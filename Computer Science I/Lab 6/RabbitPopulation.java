/**
 * RabbitPopulation.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Calculates the population of rabbits at different time intervals.
 * @author (Caleb Long) 
 * @version (.1)
 */
public class RabbitPopulation
{
    //Put instance variables below this line.  
    private int initialPopulation;
    private int sixMonthPopulation;
    /**
     * No param constructor for objects of class RabbitPopulation.
     */
    public RabbitPopulation()
    {
        initialPopulation = 0;
        sixMonthPopulation = 0;
    }
    
    /**
     * Base constructor for RabbitPopulation.
     * @param initialPopulation initial pop. of rabbits.
     * @param sixMonthPopulation pop. of rabbits after 6 months.
     */
    public RabbitPopulation(int initialPopulation, int sixMonthPopulation)
    {
        if (initialPopulation < 0)
        {
            this.initialPopulation = 0;
        }
        else
        {
            this.initialPopulation = initialPopulation;
        }

        if (sixMonthPopulation < 0)
        {
            this.sixMonthPopulation = 0;
        }
        else
        {
            this.sixMonthPopulation = sixMonthPopulation;
        }
    }
    
    /**
     * Calculates the growth rate from the past 6 months.
     * @return growthRate
     */
    public double calculateGrowthRate()
    {
        double growthRate;
        
        growthRate = (((double) getSixMonthPopulation() 
            - (double) getInitialPopulation()) 
            / (double) getInitialPopulation());
        
        return growthRate;
    }
    
    /**
     * Predicts what the population will be at 12 months, 
     * based on the growthRate.
     * @return twelveMonthPopulation
     */
    public int calculate12MonthPopulation()
    {
        double twelveMonthPopulation;
        
        twelveMonthPopulation = ((double) getSixMonthPopulation() 
            * (1 + calculateGrowthRate()));
        
        return (int) Math.round(twelveMonthPopulation);
    }
    
    /**
     * Gets the value for initialPopulation and returns it.
     * @return initialPopulation 
     */
    public int getInitialPopulation()
    {
        return initialPopulation;
    }

    /**
     * Gets the value for sixMonthPopulation and returns it.
     * @return sixMonthPopulation
     */
    public int getSixMonthPopulation()
    {
        return sixMonthPopulation;
    }
    
    /**
     * @param initialPopulation sets value.
     */
    public void setInitialPopulation(int initialPopulation)
    {
        if (initialPopulation < 0)
        {
            this.initialPopulation = 0;
        }
        else
        {
            this.initialPopulation = initialPopulation;
        }
    }
    
    /**
     * @param sixMonthPopulation sets value.
     */
    public void setSixMonthPopulation(int sixMonthPopulation)
    {
        if (sixMonthPopulation < 0)
        {
            this.sixMonthPopulation = 0;
        }
        else
        {
            this.sixMonthPopulation = sixMonthPopulation;
        }
    }
}
