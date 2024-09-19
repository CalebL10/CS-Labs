import javafx.scene.control.Spinner;

/**
 * 
 * 
 * 
 *
 * @author (Caleb Long) 
 * @version (9/11/22)
 */

import java.util.Scanner;

public class SalesTax
{
    /* This program takes the input of the user's name and purchase amount, then calculates tax based on a 5.5% state tax and 2%
    county tax.
     */
    public static void main(String[] args)
    {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = Scanner1.nextLine();
        
        System.out.println("Please enter your amount of purchase: ");
        String purchaseString =Scanner1.nextLine();
        double purchase = Double.parseDouble(purchaseString);
        
        double stateTax = (purchase*.055);
        double countyTax = (purchase*.02);
        double totalTax = (stateTax + countyTax);
        
        System.out.println("Hello, " + name);
        System.out.println("Purchase Amount: $" + purchase);
        System.out.println("State Sales Tax: $" + stateTax);
        System.out.println("County Sales Tax: $" + countyTax);
        System.out.println("Total Sales Tax: $" + totalTax);
        System.out.println("Total Sales Amount: $" + (purchase+totalTax));
    }
}
