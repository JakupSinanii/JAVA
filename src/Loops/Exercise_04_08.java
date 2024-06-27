package Loops;

import java.util.Scanner;

public class Exercise_04_08 {
    public static void main(String[] args) {
       /*
       * (Find the highest score) Write a program that prompts the user to enter the number
        of students and each student’s name and score, and finally displays the name of the
        student with the highest score.
       * */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int numberOfStudents = in.nextInt();
        String highestScoreStudentName = "";
        double highestScoreStudentScore = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of Student " + (i + 1) + ": ");
            String name = in.next();
            System.out.println("Enter score of Student " + (i + 1) + ": ");
            int score = in.nextInt();

            if (score > highestScoreStudentScore) {
                highestScoreStudentScore = score;
                highestScoreStudentName = name;
            }
        }
        System.out.println("The student with the highest score is " + highestScoreStudentName + " " + highestScoreStudentScore);

    }
}
