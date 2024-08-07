package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_10 {
    public static void main(String[] args) {
        /*
        * (Science: calculating energy) Write a program that calculates the energy needed to
        heat water from an initial temperature to a final temperature. Your program should
        prompt the user to enter the amount of water in kilograms and the initial and final
        temperatures of the water. The formula to compute the energy is
        Q = M * (finalTemperature – initialTemperature) * 4184
        where M is the weight of water in kilograms, temperatures are in degrees Celsius,
        and energy Q is measured in joules
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double m=in.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double finalTemp=in.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemp=in.nextDouble();

        double q=m*(finalTemp-initialTemp)*4184;
        System.out.println("The energy needed is "+q);
    }
}
