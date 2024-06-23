package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_07 {
    public static void main(String[] args) {
        /*
        * (Find the number of years) Write a program that prompts the user to enter the
        minutes (e.g., 1 billion), and displays the number of years and days for the
        minutes. For simplicity, assume a year has 365 days
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = in.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 525600;

        System.out.println(minutes+"minutes is approximately "+years+"years and "+days+"days");


    }
}
