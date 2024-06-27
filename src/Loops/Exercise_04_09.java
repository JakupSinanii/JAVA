package Loops;

import java.util.Scanner;

public class Exercise_04_09 {
    public static void main(String[] args) {
        /*
        * (Find the two highest scores) Write a program that prompts the user to enter
        the number of students and each student’s name and score, and finally displays the
        student with the highest score and the student with the second-highest score
        * */
        // Prompt the user to enter the number of students
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Initialize variables to keep track of the highest and second-highest scores and their names
        String highestScoreStudent = "";
        double highestScore = -1;
        String secondHighestScoreStudent = "";
        double secondHighestScore = -1;

        // Loop to get each student's name and score
        for (int i = 0; i < numberOfStudents; i++) {
            // Prompt the user to enter student's name
            System.out.print("Enter student " + (i + 1) + " name: ");
            String studentName = input.next();

            // Prompt the user to enter student's score
            System.out.print("Enter student " + (i + 1) + " score: ");
            double studentScore = input.nextDouble();

            // Check if this student has the highest score
            if (studentScore > highestScore) {
                // Update second-highest score and name
                secondHighestScore = highestScore;
                secondHighestScoreStudent = highestScoreStudent;

                // Update highest score and name
                highestScore = studentScore;
                highestScoreStudent = studentName;
            } else if (studentScore > secondHighestScore) {
                // Update second-highest score and name
                secondHighestScore = studentScore;
                secondHighestScoreStudent = studentName;
            }
        }

        // Display the names of the students with the highest and second-highest scores
        System.out.println("The student with the highest score is " + highestScoreStudent + " with a score of " + highestScore);
        System.out.println("The student with the second-highest score is " + secondHighestScoreStudent + " with a score of " + secondHighestScore);

        // Close the scanner

    }
}
