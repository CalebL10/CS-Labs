/**
 * ISPMain.java
 * 
 */


//Put any imports below this line.
import java.util.Scanner;
 
/**
 * 
 * Creates an ISP object using the methods from the class ISP.
 *
 * @author (Caleb Long) 
 * @version (.1)
 */
public class ISPMain
{ 
    /**
     * Creates a new ISP object based on user input.
     * @param args no args.
     */
    public static void main(String[] args)
    {
        System.out.println("We offer 3 packages for internet service. \n" 
            + "Package A: $9.95 per month, "
            + "10 hours free, $2 additional hours \n" 
            + "Package B: $14.95 per month, "
            + "20 hours free, $1 additional hours \n" 
            + "Package C: $19.95 per month, "
            + "unlimited access");
        System.out.println("Please select your package.");
        Scanner obj = new Scanner(System.in);
        String userInput = obj.nextLine();
        char selectedPackage = userInput.charAt(0);
        double selectedHours = 0;
        if (selectedPackage == 'A' || selectedPackage == 'B')
        {
            System.out.println("How many hours will you be using?");
            selectedHours = obj.nextInt();
        }
        
        ISP isp = new ISP();
        isp.setPkg(selectedPackage);
        isp.setHoursUsed(selectedHours);
        
        System.out.println("Your service will cost " + isp.calculateCharges() 
            + " per month");
        
        isp.printSavings();
    }
}
