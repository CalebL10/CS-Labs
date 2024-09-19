import java.util.Scanner;
/**
 * Activity1PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author (Caleb Long)
 * @version (9/13/22)
 */
public class Activity1PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_WITHHOLD = 0.1;
    public static final double FED_TAX = 0.2;
    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String employeeName = scanner1.nextLine();
        System.out.print("Enter your social security number (with hyphens): ");
        String socialSecurity = scanner1.nextLine();
        System.out.print("How many REGULAR hours have you worked?: ");
        int regHours = scanner1.nextInt();
        System.out.print("How many OVERTIME hours have you worked?: ");
        int overtimeHours = scanner1.nextInt();
        System.out.print("What is your hourly pay rate?: ");
        double payRate = scanner1.nextDouble();
        
        double regularPay = payRate * regHours;
        double overtimePayRate = (payRate * OVERTIME_RATE);
        double overtimePay = overtimePayRate * overtimeHours;
        double grossPay = regularPay + overtimePay;
        double socialSecWithhold = grossPay * SS_WITHHOLD;
        double fedTax = (grossPay - socialSecWithhold) * FED_TAX; 
        double netPay = grossPay - (fedTax + socialSecWithhold);
        
        System.out.print("___________________________________________");
        System.out.print("_______________________");
        String format = "\nName: %-37s SSN: %-11s\n";
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
