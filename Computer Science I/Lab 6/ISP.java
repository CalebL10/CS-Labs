/**
 * ISP.java
 * 
 */

/**
 * Calculates the cost of an internet package, 
 * as well as modifying and returning the values for them.
 *
 * @author (Caleb Long) 
 * @version (.1)
 */
public class ISP
{
    //Put instance variables below this line.  
    private char pkg;
    private double hoursUsed;
    private double cost;
    /**
     * No parameter constructor for objects of class ISP.
     */
    public ISP()
    {
        pkg = 'A';
        hoursUsed = 0;
    }
    
    /**
     * Base constructor for ISP class.
     * @param pkg package selected.
     * @param hoursUsed number of hours selected.
     */
    public ISP(char pkg, double hoursUsed)
    {
        this.pkg = pkg;    
        this.hoursUsed = hoursUsed;
    }
    
    /**
     * Calculates charges depending on the package selected and hours used.
     * @return cost
     */
    public double calculateCharges()
    {
        double cost = 0;
        
        if (pkg == 'A')
        {
            if (hoursUsed <= 10)
            {
                cost = 9.95;
            }
            else
            {
                cost = 9.95 + ((hoursUsed - 10) * 2);
            }
        }
        
        if (pkg == 'B')
        {
            if (hoursUsed <= 20)
            {
                cost = 14.95;
            }
            else
            {
                cost = 14.95 + ((hoursUsed - 20) * 1);
            }
        }
        
        if (pkg == 'C')
        {
            cost = 19.95;
        }
        
        return cost;
    }
    
    /**
     * Prints the savings given the package selected, hours used, and cost.
     */
    public void printSavings()
    {
        double savingsB = 0;
        double savingsC = 0;
        
        if (pkg == 'A')
        {
            if (hoursUsed <= 20)
            {
                savingsB = calculateCharges() - 14.95;
            }
            else
            {
                savingsB = calculateCharges() 
                    - (14.95 + ((hoursUsed - 20) * 1));
            }
          
            savingsC = calculateCharges() - 19.95;
        }
        if (pkg == 'B')
        {
            savingsC = calculateCharges() - 19.95;
        }
        if (savingsB > 0)
        {
            System.out.println("You would have saved " 
                + String.format("$%.2f", savingsB) + " by choosing package B");
        }
        
        if (savingsC > 0)
        {
            System.out.println("You would have saved " 
                + String.format("$%.2f", savingsC) + " by choosing package C");
        }
    }
    
    /**
     * Gets the value for pkg and returns it.  
     * @return pkg
     */
    public char getPkg()
    {
        return pkg;
    }
    
    /**
     * Gets the value for hoursUsed and returns it.
     * @return hoursUsed
     */
    public double getHoursUsed()
    {
        return hoursUsed;
    }
    
    /**
     * @param pkg sets value.
     */
    public void setPkg(char pkg)
    {
        this.pkg = pkg;
    }
    
    /**
     * @param hoursUsed sets value.
     */
    public void setHoursUsed(double hoursUsed)
    {
        this.hoursUsed = hoursUsed;
    }
}
