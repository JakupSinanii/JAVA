package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_03 {
    public static void main(String[] args) {
        /*
        * (Convert feet into meters) Write a program that reads a number in feet, converts it
        to meters, and displays the result. One foot is 0.305 meter.
        * */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet=in.nextDouble();
        double meters=0.305;
        double convertFeetIntoMetter=feet*meters;
        System.out.println(feet+" feet is "+convertFeetIntoMetter);
    }
}
