/**
 *
 * @author jt2603099
 */

import java.util.Scanner;

public class MinMaxIntegers {
    public static void main(String[] args) {
        // Create a scanner object & declare/initialize variables
        Scanner input = new Scanner(System.in);
        int minValue = 0, maxValue = 0;
        
        // Prompt for user inputs
        System.out.printf("Enter four integers and find the minimum and maximum%n");
        System.out.printf("Enter the first value: ");
        int firstNumber = input.nextInt();
            maxValue = firstNumber; 
            minValue = firstNumber;
                
        System.out.printf("Enter the second value: ");
        int secondNumber = input.nextInt();
        
        System.out.printf("Enter the third value: ");
        int thirdNumber = input.nextInt();
        
        System.out.printf("Enter the fourth value: ");
        int fourthNumber = input.nextInt();
        
        /*
            First integer is set to max & min then we compare the next three integers one-by-one to determine if it's > or < than the
            condition to set the new max/min values and it gets iterated until the last integer.
        */
        
        if (secondNumber > maxValue) {
            maxValue = secondNumber;
        } else if (secondNumber < minValue) {
            minValue = secondNumber;
        }
        if (thirdNumber > maxValue) {
            maxValue = thirdNumber;
        } else if (thirdNumber < minValue) {
            minValue = thirdNumber;
        }
        if (fourthNumber > maxValue) {
            maxValue = fourthNumber;
        } else if (fourthNumber < minValue) {
            minValue = fourthNumber;
        }

        // Output results
        System.out.printf("The values entered: %d, %d, %d, %d have a minimum value of %d and a maximum value %d%n", firstNumber, secondNumber, thirdNumber, fourthNumber, minValue, maxValue);
        
    }
    
}
