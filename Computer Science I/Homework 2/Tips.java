/**
 * 
 * 
 * 
 *
 * @author (Caleb Long) 
 * @version (9/11/22)
 */
import java.util.Scanner;
public class Tips
{
    /**
     * 
     */
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  //Create scanner to detect user input
        
        System.out.println("Please enter the subtotal: "); //Prompt user for input
        double subtotal = myObj.nextDouble(); //Declare input variables
        System.out.println("Please enter the gratuity rate: ");
        double gratuityPercent = (myObj.nextDouble() * .01); //Read user input
        
        //Declare and display output 
        double gratuityPaid = subtotal * gratuityPercent;
        double total = subtotal + gratuityPaid;
        System.out.println("Gratuity: $" + gratuityPaid + "\nTotal: $" + total);
    }
}