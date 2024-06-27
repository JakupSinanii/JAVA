package Loops;

import java.util.Scanner;

public class Excercise_04_01 {
    public static void main(String[] args) {
        /*(Count positive and negative numbers and compute the average of numbers) Write
        a program that reads an unspecified number of integers, determines how many
        positive and negative values have been read, and computes the total and average of
        the input values (not counting zeros). Your program ends with the input 0. Display
        the average as a floating-point number.*/
        Scanner in = new Scanner(System.in);

        int countPositives=0;
        int countNegatives=0;
        int count=0;
        double total=0;
        System.out.println("Enter an integer, the input ends if it is 0: ");
        int num=in.nextInt();

        if(num==0){
            System.out.println("No numbers are entered except 0!");
            System.exit(1);
        }

        while(num!=0){
            if (num>0){
                countPositives++;

            }else {
                countNegatives++;

            }
            total+=num;
            count++;
            num=in.nextInt();
        }
        System.out.println("The number of positives is: "+countPositives
        +"\nThe number of negatives is: "+countNegatives
        +"\nThe total number is: "+total
        +"\n The average is: "+(total/count));
    }
}
