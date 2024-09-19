import java.util.Scanner;
/**
 * PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author (Caleb Long)
 * @version (9/13/22)
 */
public class PayStub
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
    
    /**
     * @param keyboard calls methods for getting input and calculating pay.
     */
    public PayStub(Scanner keyboard)
    {
        getInput(keyboard);
        keyboard.nextLine();
        calculate();
    }
    
    /**
     * @param args calls other methods for marge
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        PayStub homer = new PayStub(keyboard);
        PayStub marge = new PayStub(keyboard);
        PayStub lisa = new PayStub(keyboard);
        marge.printPayStub();
        marge.increasePay();
        marge.calculate();
        System.out.println();
        System.out.printf("New gross pay: $%-8.2f\n", marge.getGrossPay());
    }
    
    /**
     * @param keyboard gets input for hours, SS number, and pay rate
     */
    private void getInput(Scanner keyboard)
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
     * increases pay for marge.
     */
    private void increasePay()
    {
        payRate = 20.00;
    }    
    
    /**
     * calculates pay from hours and pay rates.
     */
    private void calculate()
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
     * prints pay stub for the user.
     */
    public void printPayStub()
    {
        System.out.print("_____________________________");
        System.out.print("_____________________________________");
        String format = "\nName: %-37s SSN: %-11s\n";
        System.out.printf(format, employeeName, socialSecurity);
        
        String format1 = "Regular Hours: %-8d "
            + "Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n";
        System.out.printf(format1, regHours, payRate, regularPay);
        
        String format2 = "Overtime Hours: %-7d "
            + "OT Rate: $%-9.2f OT Pay: $%-8.2f\n";
        System.out.printf(format2, overtimeHours, overtimePayRate, overtimePay);
        
        String format3 = "Gross Pay: $%-8.2f\n";
        System.out.printf(format3, grossPay);
        
        String format4 = "SS Withholding: $%-8.2f\n";
        System.out.printf(format4, socialSecWithhold);
        
        String format5 = "Federal Tax: $%-8.2f\n";
        System.out.printf(format5, fedTax);
        
        String format6 = "Net Pay: $%-8.2f\n";
        System.out.printf(format6, netPay);
        System.out.print("__________________________________");
        System.out.print("________________________________");
    }
    
    /**
     * @return overtime hours for calculations.
     */
    public int getOvertimeHours()
    {
        return overtimeHours;
    }
    
    /**
     * @return gross pay for calculations.
     */
    public double getGrossPay()
    {
        return grossPay;   
    }
    
    /**
     * @param newValue sets the overtime hours.
     */
    public void setOvertimeHours(int newValue)
    {
        if (newValue >= 0)
        {
            overtimeHours = newValue;
            calculate();
        }
    }
    
    /**
     * @param newValue sets the pay rate.
     */
    public void setPayRate(double newValue)
    {
        if (newValue >= 0)
        {
            payRate = newValue;
            calculate();
        }
    }
}
