package Loops;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int num1=(int)(Math.random()%10);
        int num2=(int)(Math.random()%10);

        Scanner in = new Scanner(System.in);
        System.out.println("What is "+num1+" + "+num2+"? ");
        int answer=in.nextInt();

        while(num1+num2!=answer){
            System.out.println("Wrong answer. Try again. What is "+num1+" + "+num2+"? ");
            answer=in.nextInt();
        }
        System.out.println("You got it");
    }
}
