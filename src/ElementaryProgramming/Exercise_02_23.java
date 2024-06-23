package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_23 {
    public static void main(String[] args) {
        /*
        * (Find the character of an ASCII code) Write a program that receives an ASCII
        code (an integer between 0 and 127) and displays its character. For example, if the
        user enters 97, the program displays character a.
        * */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int i=in.nextInt();

        System.out.println((char)i);
    }
}
