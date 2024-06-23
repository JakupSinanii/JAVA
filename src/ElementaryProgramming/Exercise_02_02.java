package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_02 {
    public static void main(String[] args) {
        /**
         * (Compute the volume of a cylinder) Write a program that reads in the radius and
         * length of a cylinder and computes the area and volume using the following formulas:
         * area = radius * radius *
         * volume = area * length
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = in.nextDouble();
        double length = in.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
