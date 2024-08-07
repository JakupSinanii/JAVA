package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_21 {
    public static void main(String[] args) {
        /*
        * (Financial application: calculate future investment value) Write a program that
        reads in investment amount, annual interest rate, and number of years, and displays the future investment value using the following formula:
        futureInvestmentValue =
        investmentAmount x (1 + monthlyInterestRate)numberOfYears*12
        For example, if you enter amount 1000, annual interest rate 3.25%, and number of
        years 1, the future investment value is 1032.98.
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = in.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = in.nextDouble();
        annualInterestRate = annualInterestRate / 1200;
        System.out.println("Enter number of years: ");
        int numberOfYears = in.nextInt();
        double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate), numberOfYears * 12);
        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
