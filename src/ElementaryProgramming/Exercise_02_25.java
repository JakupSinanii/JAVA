package ElementaryProgramming;

import java.util.Scanner;

public class Exercise_02_25 {
    public static void main(String[] args) {
        /*(Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
        Employee’s name (e.g., Smith)
        Number of hours worked in a week (e.g., 10)
        Hourly pay rate (e.g., 6.75)
        Federal tax withholding rate (e.g., 20%)
        State tax withholding rate (e.g., 9%)*/

        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = in.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        int hoursWorkedInaWeek = in.nextInt();
        System.out.println("Enter hourly pay rate: ");
        double payRate = in.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxWithholdingRate = in.nextDouble();
        federalTaxWithholdingRate = federalTaxWithholdingRate / 100;
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate = in.nextDouble();
        stateTaxWithholdingRate = stateTaxWithholdingRate / 100;

        System.out.println("Employee name: " + name);
        System.out.println("Hours Worked " + hoursWorkedInaWeek);
        System.out.println("Pay Rate " + payRate);
        double grossPay = payRate * hoursWorkedInaWeek;
        System.out.println("Gross Pay: " + grossPay);
        double federalWithHolding=grossPay*federalTaxWithholdingRate;
        double stateWithHolding=stateTaxWithholdingRate*grossPay;
        double totalDeduction=federalWithHolding+stateWithHolding;
        System.out.println("Deduction: "+"\n\t Federal Withholding ("+federalTaxWithholdingRate+"%): $"+federalWithHolding+"\n\t State Withholding ("+stateTaxWithholdingRate+"%): $"+stateWithHolding+"\n\t Total Deduction: $"+totalDeduction);
        double netPay=grossPay-totalDeduction;
        System.out.println("Net Pay: $"+netPay);

    }
}
