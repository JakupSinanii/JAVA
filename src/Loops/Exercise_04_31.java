package Loops;

import java.util.Scanner;

public class Exercise_04_31 {
    public static void main(String[] args) {
        /*
        * (Financial application: compute CD value) Suppose you put $10,000 into a CD
        with an annual percentage yield of 5.75%. After one month, the CD is worth
        10000 + 10000 * 5.75 / 1200 = 10047.91
        After two months, the CD is worth
        10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
        After three months, the CD is worth
        10096.06 + 10096.06 * 5.75 / 1200 = 10144.43
        and so on.
        Write a program that prompts the user to enter an amount (e.g., 10000), the annual
        percentage yield (e.g., 5.75), and the number of months (e.g., 18)
        * */

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount: ");
        double depositAmount = in.nextDouble();

        System.out.println("Enter annual percentage yield: ");
        double percentageYield = in.nextDouble();

        System.out.println("Enter maturity period (number of months): ");
        int months = in.nextInt();

        percentageYield/=100;

        double percentageOnMonths=percentageYield/12;

        double totalOnOneMonth=depositAmount+(depositAmount*(percentageYield/percentageOnMonths));

        double total=0;

        for (int i=0;i<months;i++) {
        total=depositAmount+total*(percentageYield/percentageOnMonths);
        }
        System.out.println(total);
    }
}
