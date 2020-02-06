/**
 * @author jt2603099
 * @description: Takes in one parameter named number, and return a String containing the factors for the number that totals up to the number if the number is a perfect number
 */

/*
We consider an integer number as a perfect number if its factors (including 1, but not the number itself) total up to the number. 
For example, 6 is a perfect number because its factors (excluding 6) are: 1, 2, and 3, which total to 6.
Utilize this isPerfect method in a program that prompts the user for a maximum integer, 
so the program can display all perfect numbers from 2 to the maximum integer (be careful having the user pick a maximum integer bigger than 100000).
*/

import java.util.*;

public class isPerfect {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.printf("Determine if a number is perfect.%n");
        int num = inputValidation();
        
        for (int i = 1; i <= num; i++) {
            if (isPerfect(i)) {
                System.out.printf("%d is perfect.%n", i);
                System.out.printf("        Factors: %s%n", factors(i));
            }
        }
    }
    
    public static int inputValidation() {
        int MIN = 1, MAX = 10000;
        int validInput = 0;
        boolean inputValidate = false;
        
        do {
            try {
                validInput = input.nextInt();
                if (validInput >= MIN && validInput <= MAX) {
                    inputValidate = true;
                } else {
                    System.out.printf("Input values only 1-10000: ");
                    input.nextLine();
                }
            } catch (InputMismatchException exception) {
                System.out.printf("Input values only 1-10000: ");
                input.nextLine();
            }
        } while (!(inputValidate));
        
        return validInput;
    }
    
    public static boolean isPerfect(int n) {
        int sumOfFactors = 0;
        
        for (int factor = 1; factor < n; factor++) {
            if (n % factor == 0) {
                sumOfFactors += factor;
            }
        }
        
        if (sumOfFactors == n) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String factors(int n) {
        String listOfFactors = "";
        
        for (int factor = 1; factor < n; factor++) {
            if (n % factor == 0) {
                listOfFactors = listOfFactors + " " + factor;
            }
        }
        return listOfFactors;
    }
}