package Loops;

import java.util.Scanner;

public class Exercise_04_22 {
    public static void main(String[] args) {

        /*
        * (Financial application: loan amortization schedule) The monthly payment for a
        given loan pays the principal and the interest. The monthly interest is computed by
        multiplying the monthly interest rate and the balance (the remaining principal).
        The principal paid for the month is therefore the monthly payment minus the
        monthly interest. Write a program that lets the user enter the loan amount, number
        of years, and interest rate and displays the amortization schedule for the loan.
        * */

        Scanner in = new Scanner(System.in);

        System.out.println("Loan Amount: ");
        double loanAmount = in.nextDouble();
        System.out.println("Number of Years: ");
        double numberOfYears = in.nextDouble();
        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = in.nextDouble();
        annualInterestRate /= 100;


        double balance = loanAmount;
        double monthlyInterestRate = annualInterestRate / 12;

        double interest = 0;

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double principal = 0;

        System.out.println(monthlyPayment);
        System.out.println((monthlyPayment * numberOfYears) * 12);


        for (int i = 0; i < numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;

            System.out.println(i + "\t\t" + interest
                    + "\t\t" + principal + "\t\t" + balance);

        }


    }
}
