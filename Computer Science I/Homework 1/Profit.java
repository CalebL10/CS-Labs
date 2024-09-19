//import statements go here

/**
 * Shows the profit made by a textbook publishing company.
 *
 * @author Caleb Long
 * @version 0.1
 */
public class Profit
{
    /**
     * Calculates and displays the profit made by the company.
     * 
     * @param  y     A sample parameter for this method.
     */
    public static void main(String[] args)
    {
       double retailPrice = 72.95;
       final double profit = retailPrice * 0.25;
       System.out.println("$"+ profit);
    }
}