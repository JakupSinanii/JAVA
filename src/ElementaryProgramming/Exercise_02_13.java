package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[] args) {
        /*
        * (Financial application: compound value) Suppose you save $100 each month
        into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is After the first month, the value in the account
        becomes
        100 * (1 + 0.00417) = 100.417
        After the second month, the value in the account becomes
        (100 + 100.417) * (1 + 0.00417) = 201.252
        After the third month, the value in the account becomes
        (100 + 201.252) * (1 + 0.00417) = 302.507
        and so on.
        Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month. (In Exercise 4.30, you will use a
        loop to simplify the code and display the account value for any month.)
        * */
        final double MONTHLY_INTEREST_RATE = 0.00417;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double monthlySavingAmount = in.nextInt();
        double total = 100 * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
        total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

        System.out.println("After the sixth month, the account value is " + total);


    }
}
