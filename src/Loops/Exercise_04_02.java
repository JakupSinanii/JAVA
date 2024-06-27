package Loops;

import java.util.Scanner;

public class Exercise_04_02 {
    public static void main(String[] args) {
        /*
        * Listing 4.4, SubtractionQuizLoop.java, generates five random subtraction questions. Revise the program to generate ten random addition
        questions for two integers between 1 and 15. Display the correct count and test
        time.
        * */
        final int NUMBER_OF_QUESTIONS = 5;
        int correctAnswer = 0;
        int count = 0;
        String output = " ";
        long startTime = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int num1 = 1 + (int) (Math.random() * 15);
            int num2 = 1 + (int) (Math.random() * 15);

            System.out.print(
                    "What is " + num1 + " + " + num2 + "? ");
            int answer = in.nextInt();

            if (num1 + num2 == answer) {
                System.out.println("You are correct!");
                correctAnswer++;
            } else {
                System.out.println("Your answer is incorrect!" + num1 + " + " + num2 + " should be " + (num1 + num2));
            }
            count++;
            output += "\n" + num1 + "+" + num2 + "=" + answer +
                    ((num1 + num2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctAnswer +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
