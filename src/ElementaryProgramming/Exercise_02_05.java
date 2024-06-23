package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_05 {
    public static void main(String[] args) {

        /*
        * Write a program that reads an integer between 0 and
        1000 and adds all the digits in the integer. For example, if an integer is 932, the
        sum of all its digits is 14.
        Hint: Use the % operator to extract digits, and use the / operator to remove the
        extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = in.nextInt();
        if (number > 0 && number <= 1000) {
            int remainder = number % 10;
            int sum = 0;
            sum += remainder;
            int num1 = (number - remainder) / 10;
            number = num1;
            remainder = number % 10;
            sum += remainder;
            int num2 = (number - remainder) / 10;
            number = num2;
            remainder = number % 10;
            sum += remainder;
            System.out.println("The sum of the digits is " + sum);
        } else {
            System.out.println("Not a valid number");
        }

    }
}
