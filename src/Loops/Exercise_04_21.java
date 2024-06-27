package Loops;

import java.util.Scanner;

public class Exercise_04_21 {
    /*
    * (Financial application: compare loans with various interest rates) Write a program that lets the user enter the loan amount and loan period in number of years
    and displays the monthly and total payments for each interest rate starting from
    5% to 8%, with an increment of 1/8.
    * */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Loan Amount: ");
        double loanAmount = in.nextDouble();

        System.out.println("Number of years: ");
        int years = in.nextInt();

        double increment=1.0/8.0;

        System.out.println(
                "Interest Rate    Monthly Payment    Total Payment");

        for (double i=5.0;i<=8.0;i+=increment){
            System.out.printf("%-5.3f", i);
            System.out.print("%           ");

            double monthlyInterestRate=i/1200;

            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            System.out.printf("%-19.2f ",monthlyPayment);
            System.out.printf("%-8f\n",(monthlyPayment*12)*years);
        }
    }
}
