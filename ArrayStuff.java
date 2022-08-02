
import java.util.Random;
import java.util.Scanner;
public class ArrayStuff {


    public static void main(String[] args) {
        Random rnd = new Random();

        int[] dataValues = new int[100];

        for (int i = 0; i < dataValues.length; i++) {
            dataValues[i] = rnd.nextInt(100) + 1;
        }

        for (int j = 0; j < dataValues.length; j++) {
            if (j < dataValues.length - 1) {
                System.out.print(dataValues[j] + " | ");
            } else {
                System.out.print(dataValues[j]);
            }
        }

        getAverage(dataValues);


        Scanner in = new Scanner(System.in);
        int count = 0;

        int ans = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100", 1, 100);

        occurenceScan(dataValues, ans);

        int val = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100", 1, 100);
        contains(dataValues, val);

        min(dataValues);
        max(dataValues);

        System.out.println("Average of dataValues is: " + getAverage(dataValues));
    }

    public static double getAverage(int values[]) {
        double sum = 0;
        double average;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        average = sum/values.length;
        System.out.printf("\nThe sum of the data values is %.2f and the average is %.2f.\n", sum, average);
        return average;
    }

    public static int min(int values[]) {
        int min = values[0];
        for (int n = 0; n < values.length; n++) {
            if (values[n] < min) {
                min = values[n];
            }
        }
        System.out.printf("\nThe min value is %d.\n", min);
        return min;
    }

    public static int max(int values[]) {
        int max = values[0];
        for (int n = 0; n < values.length; n++) {
            if (values[n] > max) {
                max = values[n];
            }
        }
        System.out.printf("\nThe max value is %d.\n", max);
        return max;
    }

    public static int occurenceScan(int values[], int target) {
        int counter = 0;
        for (int l = 0; l < values.length; l++) {
            if (target == values[l]) {
                counter++;
            }
        }
        System.out.printf("\n%d appeared in the DataPoints array %d times.\n", target, counter);
        return counter;
    }

    public static int sum(int values[]) {
        int sumOfValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumOfValues += values[i];
        }
        return sumOfValues;
    }

    public static boolean contains(int values[], int target) {
        int match = -1;
        for (int m = 0; m < values.length; m++) {
            if (target == values[m]) {
                match = m;
                break;
            }
        }
        if (match != -1) {
            System.out.printf("\nThe value %d was found at array index %d.\n", target, match);
            return true;
        } else {
            System.out.printf("\nThe value %d was not found.\n", target);
            return false;
        }
    }
}