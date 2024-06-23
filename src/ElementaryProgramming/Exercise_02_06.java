package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args) {
        /*
        * Write a program that reads the subtotal and
        the gratuity rate, then computes the gratuity and total. For example, if the user
        enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = in.nextDouble();
        double gratuity = in.nextDouble();
        double rate = (100 * gratuity) / 1000;
        double total = subtotal + rate;
        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
