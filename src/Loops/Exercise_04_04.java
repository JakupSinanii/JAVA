package Loops;

public class Exercise_04_04 {
    public static void main(String[] args) {
        /*
        * (Conversion from miles to kilometers) Write a program that displays the following
        table (note that 1 mile is 1.609 kilometers):
        * */
        final double KILOMETERS_PER_MILE = 1.609;

        System.out.println("Miles Kilo");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%-15d%6.1f\n", i, (i * KILOMETERS_PER_MILE));
        }
    }
}
