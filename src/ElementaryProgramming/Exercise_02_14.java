package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_14 {
    public static void main(String[] args) {
        /*
        * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
        health on weight. It can be calculated by taking your weight in kilograms and
        dividing by the square of your height in meters. Write a program that prompts the
        user to enter a weight in pounds and height in inches and displays the BMI. Note
        that one pound is 0.45359237 kilograms and one inch is 0.0254 meters
        * */
        final double kilogramsPerPound=0.45359237;
        final double meterPerInch=0.0254;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = in.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = in.nextDouble();
      weight=weight*kilogramsPerPound;
      height=height*meterPerInch;
      double BMI=weight/Math.pow(height,2);
        System.out.println("BMI is "+BMI);

    }
}
