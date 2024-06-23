package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        /*
        (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
        double value from the console, then converts it to Fahrenheit and displays the
        result. The formula for the conversion is as follows:
        fahrenheit = (9 / 5) * celsius + 32
        Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a degree in Celcius: ");
        double degree = in.nextDouble();
        double fahrenheit = (9.0 / 5) * degree + 32;
        System.out.println(degree + "Celcius is " + fahrenheit + " Fahrenheit");

    }
}
