/**
 * @author jt2603099
 * @description: 
 */

import java.util.*;

public class ArrayStatistics {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.printf("How many number of the type double do you want to store in your array? ");
        int arrayLength = inputValidation();
        double[] arr = createArray(arrayLength);
        fillArray(arr, arrayLength);
        
        System.out.printf("The statistics for your user entered array is: %n");
        System.out.printf("------------------------------------------------%n");
        System.out.printf("%35s %8.3f%n", "Minimum: ", findMin(arr));
        System.out.printf("%35s %8.3f%n", "Maximum: ", findMax(arr));
        System.out.printf("%35s %8.3f%n", "Average: ", findAvg(arr));
        System.out.printf("%35s %8.3f%n", "Standard deviation (population): ", calculatePopSD(arr));
        System.out.printf("%35s %8.3f%n", "Standard deviation (sample): ", calculateSampleSD(arr));
        
    }
    
    public static int inputValidation() {
        int MIN = 0;
        int validInput = 0;
        boolean inputValidate = false;
        
        do {
            try {
                validInput = input.nextInt();
                if (validInput > MIN) {
                    inputValidate = true;
                } else {
                    System.out.printf("Input values only greater than 0: ");
                    input.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.printf("Input values greater than 0: ");
                input.nextLine();
            }
        } while (!(inputValidate));
        
        return validInput;
    }
    
    public static double[] createArray(int arrLength) {
        double[] x;
        x = new double[arrLength];
        
        return x;
    }
    
    public static void fillArray(double[] emptyArray, int arrLength) {
        
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("Enter a value #%d: ", i+1);
            emptyArray[i] = input.nextDouble();
        }
    }
    
    public static double findMin(double[] a) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    
    public static double findMax(double[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    
    public static double findAvg(double[] a) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total / a.length;
    }
    
    public static double calculatePopSD(double[] a) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = a.length;
        
        for (double num : a) {
            sum += num;
        }
        
        double mean = sum/length;
        
        for (double num: a) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / length);
    }
    
    public static double calculateSampleSD(double[] a) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = a.length;
        
        for (double num : a) {
            sum += num;
        }
        
        double mean = sum/length;
        
        for (double num: a) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / (length-1));
    }
    
}