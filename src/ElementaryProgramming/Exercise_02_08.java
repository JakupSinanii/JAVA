package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args) {
        /*
        * Listing 2.6, ShowCurrentTime.java, gives a program that displays
        the current time in GMT. Revise the program so that it prompts the user to enter
        the time zone offset to GMT and displays the time in the specified time zone
        * */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = in.nextInt();


        long totalMiliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMiliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        currentHours = currentHours +offset;

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}
