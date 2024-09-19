import java.util.Scanner;
/**
 * Activity2PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author (Caleb Long)
 * @version (9/13/22)
 */
public class Activity2PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_WITHHOLD = 0.1;
    public static final double FED_TAX = 0.2;
    private String employeeName;
    private String socialSecurity;
    private int regHours;
    private int overtimeHours;
    private double payRate;
    private double regularPay;
    private double overtimePayRate;
    private double overtimePay;
    private double grossPay;
    private double socialSecWithhold;
    private double fedTax;
    private double netPay;
    //Declare scanner for use in gathering inpu, call other methods
    
/**
 * Main method for calling other methods.
 * @param args calls other methods
 */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        Activity2PayStub a2ps = new Activity2PayStub();
        a2ps.getInput(keyboard);
        a2ps.calculate();
        a2ps.printPayStub();
    }
 
    /**
     * gets unput from user.
     * @param keyboard gets input from user.
     */
    public void getInput(Scanner keyboard)
    {
        System.out.print("Enter your name: ");
        employeeName = keyboard.nextLine();
        System.out.print("Enter your social security number (with hyphens): ");
        socialSecurity = keyboard.nextLine();
        System.out.print("How many REGULAR hours have you worked?: ");
        regHours = keyboard.nextInt();
        System.out.print("How many OVERTIME hours have you worked?: ");
        overtimeHours = keyboard.nextInt();
        System.out.print("What is your hourly pay rate?: ");
        payRate = keyboard.nextDouble();
    }
    
    /**
     * calculates pay of user.
     */
    public void calculate()
    {
        regularPay = payRate * regHours;
        overtimePayRate = (payRate * OVERTIME_RATE);
        overtimePay = overtimePayRate * overtimeHours;
        grossPay = regularPay + overtimePay;
        socialSecWithhold = grossPay * SS_WITHHOLD;
        fedTax = (grossPay - socialSecWithhold) * FED_TAX; 
        netPay = grossPay - (fedTax + socialSecWithhold);
    }
    
    /**
     * prints pay stub for user.
     */
    public void printPayStub()
    {
        System.out.println("__________________________________________________________________");
        String format = "Name: %-37s SSN: %-11s\n";
        System.out.printf(format, employeeName, socialSecurity);
        
        String format1 = "Regular Hours: %-8d Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n";
        System.out.printf(format1, regHours, payRate, regularPay);
        
        String format2 = "Overtime Hours: %-7d OT Rate: $%-9.2f OT Pay: $%-8.2f\n";
        System.out.printf(format2, overtimeHours, overtimePayRate, overtimePay);
        
        String format3 = "Gross Pay: $%-8.2f\n";
        System.out.printf(format3, grossPay);
        
        String format4 = "SS Withholding: $%-8.2f\n";
        System.out.printf(format4, socialSecWithhold);
        
        String format5 = "Federal Tax: $%-8.2f\n";
        System.out.printf(format5, fedTax);
        
        String format6 = "Net Pay: $%-8.2f\n";
        System.out.printf(format6, netPay);
        System.out.println("__________________________________________________________________");
    }
}
