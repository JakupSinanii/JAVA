package Loops;

public class Exercise_04_07 {
    public static void main(String[] args) {
        /*
        * (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year. Write a program that
        computes the tuition in ten years and the total cost of four years’ worth of tuition
        starting ten years from now
        * */
        double currentTuition = 10000;
        double annualIncreaseRate = 0.05;

        double tuitionInYears = currentTuition;
        for (int i = 0; i < 10; i++) {
            tuitionInYears *= (1 + annualIncreaseRate);
        }
        double totalCost = 0;
        double tuition = tuitionInYears;
        ;
        for (int i = 0; i < 4; i++) {
            totalCost += tuition;
            tuition *= (1 + annualIncreaseRate);
        }
        System.out.printf("Tuition in ten years: ", tuitionInYears);
        System.out.printf("Total cost for four years starting ten years from now: $%.2f%n", totalCost);

    }
}
