package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_04 {
    public static void main(String[] args) {
        /*\
        * (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to
        kilograms, and displays the result. One pound is 0.454 kilograms.
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double kilograms = in.nextDouble();
        double pounds=0.454;
        double convertInPounds=kilograms*pounds;
        System.out.println(kilograms+" pounds is "+convertInPounds+" kilograms");
    }
}
