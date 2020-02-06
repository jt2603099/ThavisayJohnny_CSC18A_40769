/**
 * @author jt2603099
 * @description:  calculates how much a person would earn over a user entered period of time if his or her salary is one penny the first day and two pennies the second day
 */

import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        // Create a scanner object & declare/initialize variables
        Scanner input = new Scanner(System.in);
        boolean promptUser = false;
        int maxDaysDoubled = 0;
        double pay = 0.01;
        double totalPay = 0;
        
        // Prompt user for inputs
        do {
            System.out.printf("For how many days will the pay double? ");
            maxDaysDoubled = input.nextInt();
            
            //  Do not accept a number less than 1 for the number of days worked and no more than 45 for the number of days worked
            if ((maxDaysDoubled < 1 || maxDaysDoubled > 45 )) {
                promptUser = true;
            }        
        } while (promptUser == true);
        
        // Calculate the pay each day
        System.out.printf("Day             Total pay          %n");
        System.out.printf("-----------------------------------%n");
        for (int day = 1; day <= maxDaysDoubled; day++) {
            System.out.printf("%-15d $ %16.2f%n", day, pay);
            totalPay += pay; // Add the pay to total pay before doubling it
            pay *= 2; // Double the pay for the next after printing current day's pay
        }
        System.out.printf("-----------------------------------%n");
        System.out.printf("Total           $ %16.2f%n", totalPay);
        
    }
}
