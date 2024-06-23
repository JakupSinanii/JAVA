package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_09 {
    public static void main(String[] args) {
        /*
        * (Physics: acceleration) Average acceleration is defined as the change of velocity
        divided by the time taken to make the change, as shown in the following formula:
        Write a program that prompts the user to enter the starting velocity in
        meters/second, the ending velocity in meters/second, and the time span t in
        seconds, and displays the average acceleration.
        * */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter v0, v1, and t: ");
        double v0=in.nextDouble();
        double v1=in.nextDouble();
        double t=in.nextDouble();

        double a=(v1-v0)/t;
        System.out.println("The average acceleration is "+a);
    }
}
