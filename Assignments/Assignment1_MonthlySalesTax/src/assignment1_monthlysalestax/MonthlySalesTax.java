package assignment1_monthlysalestax;

/**
 *
 * author: Johnny Thavisay
 */

import java.util.Scanner;

public class MonthlySalesTax {
    public static void main(String[] args) {
        // Create scanner to get input from command line
        Scanner input = new Scanner(System.in);
        
        float stateSalesTax = 6.75f;
        float countySalesTax = 3.10f;
        
        // Prompt for user inputs
        System.out.printf("Monthly Sales Tax %nEnter the month: ");
        String monthName = input.nextLine();
        
        System.out.printf("Enter the year: ");
        int year = input.nextInt();
        
        System.out.printf("Enter the total amount collected in sales (with tax included): %n");
        float totalAmount = input.nextFloat();
        
        // Calculations
        float salesBeforeTax = totalAmount / 1.0985f;
        float countyTaxed = salesBeforeTax * (countySalesTax / 100f);
        float stateTaxed = salesBeforeTax * (stateSalesTax / 100f);
        float totalSalesTaxSum = countyTaxed + stateTaxed;
        
        
        // Output results
        System.out.printf("Month: %s %d%n", monthName, year);
        System.out.printf("-------------------------------%n");
        System.out.printf("Total Collected:     %s%9.2f%n", "$", totalAmount);
        System.out.printf("Sales:               %s%9.2f%n", "$", salesBeforeTax);
        System.out.printf("County Sales Tax:      %s% .2f%n", "$", countyTaxed);
        System.out.printf("State Sales Tax:      %s%8.2f%n", "$", stateTaxed);
        System.out.printf("Total Sales Tax:      %s%8.2f%n", "$", totalSalesTaxSum);
    }
    
}
