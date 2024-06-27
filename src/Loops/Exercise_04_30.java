package Loops;

import java.util.Scanner;

public class Exercise_04_30 {
    public static void main(String[] args) {
    /*
    * (Financial application: compound value) Suppose you save $100 each month into
    a savings account with the annual interest rate 5%. So, the monthly interest rate is
    0.05 / 12 = 0.00417. After the first month, the value in the account becomes
    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter an amount (e.g., 100), the annual
    interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
    in the savings account after the given month
    * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = in.nextDouble();

        System.out.println("Enter the annual interest: ");
        double interest = in.nextDouble();

        System.out.println("Enter the number of months: ");
        int numOfMonths = in.nextInt();

        interest /= 100;

        double savings = 0;

        double monthlyInterestRate = interest / 12;

        double value = amount * (1 + monthlyInterestRate);
        for (int i = 0; i < numOfMonths; i++) {
            savings = (amount + savings) * (1 + monthlyInterestRate);
        }
        System.out.printf("Amount in savings account after %d months: %.2f%n", numOfMonths, savings);
    }
}
