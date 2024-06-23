package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_12 {
    public static void main(String[] args) {
        /*
        * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
        speed v, you can compute the minimum runway length needed for an airplane to
        take off using the following formula:
        Write a program that prompts the user to enter v in meters/second (m/s) and the
        acceleration a in meters/second squared and displays the minimum runway
        length
        * */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();

        /*double length=Math.sqrt(speed)/(2*acceleration);*/
        double length=Math.pow(speed,2)/(2*acceleration);

        System.out.println("The minimum runway length for this airplane is "+length);

    }
}
