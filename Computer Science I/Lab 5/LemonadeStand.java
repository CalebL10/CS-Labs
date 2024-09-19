/**
 * LemonadeStand.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of LemonadeStand class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LemonadeStand
{
    //Put instance variables below this line.  
    private int lemons;
    private int gallonsOfWater;
    private int cupsOfSugar;
    private int emptyGlasses;
    private int glassesOfLemonade; 
    private double price;
    private double income;
    
    /**
     * @param initLemons initLemons
     * @param initGallonsOfWater initGallonsOfWater
     * @param initCupsOfSugar initCupsOfSugar
     * @param initEmptyGlasses initEmptyGlasses
     * @param initPrice initPrice
     */
    public LemonadeStand(int initLemons, int initGallonsOfWater,
        int initCupsOfSugar, int initEmptyGlasses, double initPrice)
    {
        setLemons(initLemons);
        setGallonsOfWater(initGallonsOfWater);
        setCupsOfSugar(initCupsOfSugar);
        setEmptyGlasses(initEmptyGlasses);
        setPrice(initPrice);
        setGlassesOfLemonade(0);
        setIncome(0);
    }
    
    /**
     * provides initial values for variables.
     */
    public LemonadeStand()
    {
        lemons = 0;
        gallonsOfWater = 0;
        cupsOfSugar = 0;
        emptyGlasses = 0;
        glassesOfLemonade = 0;
        price = 0;
        income = 0;
    }
    
    /**
     * @param args
     * provides a template for using the methods in this code.
     */
    public static void main(String[] args)
    {
        LemonadeStand lemonadeStand = new LemonadeStand(5, 2, 2, 10, 1);
        lemonadeStand.makeLemonade();
        System.out.println(lemonadeStand.getLemons());
        System.out.println(lemonadeStand.getGallonsOfWater());
        System.out.println(lemonadeStand.getCupsOfSugar());
        System.out.println(lemonadeStand.getGlassesOfLemonade());
        
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        lemonadeStand.sellLemonade();
        System.out.println(lemonadeStand.getLemons());
        System.out.println(lemonadeStand.getGallonsOfWater());
        System.out.println(lemonadeStand.getCupsOfSugar());
        System.out.println(lemonadeStand.getGlassesOfLemonade());
    }
    
   /**
    * @return lemons
    */
    public int getLemons()
    {
        return lemons;
    }
    
    /**
     * @return gallons of water
     */
    public int getGallonsOfWater()
    {
        return gallonsOfWater;
    }
    
    /**
     * @return cups of sugar
     */
    public int getCupsOfSugar()
    {
        return cupsOfSugar;
    }
    
    /**
     * @return empty glasses
     */
    public int getEmptyGlasses()
    {
        return emptyGlasses;
    }
    
    /**
     * @return glasses of lemonade
     */
    public int getGlassesOfLemonade()
    {
        return glassesOfLemonade;
    }
    
    /**
     * @return price
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * @return income
     */
    public double getIncome()
    {
        return income;
    }
    
    /**
     * @param newLemons newLemons
     */
    public void setLemons(int newLemons)
    {
        if (newLemons < 0)
        {
            newLemons = 0;
        }
        lemons = newLemons;
    }
    
    /**
     * @param newGallonsOfWater newGallonsOfWater
     */
    public void setGallonsOfWater(int newGallonsOfWater)
    {
        if (newGallonsOfWater < 0)
        {
            newGallonsOfWater = 0;
        }
        gallonsOfWater = newGallonsOfWater;
    }
    
    /**
     * @param newCupsOfSugar newCupsOfSugar
     */
    public void setCupsOfSugar(int newCupsOfSugar)
    {
        if (newCupsOfSugar < 0)
        {
            newCupsOfSugar = 0;
        }
        cupsOfSugar = newCupsOfSugar;
    }
    
    /**
     * @param newEmptyGlasses newEmptyGlasses
     */
    public void setEmptyGlasses(int newEmptyGlasses)
    {
        if (newEmptyGlasses < 0)
        {
            newEmptyGlasses = 0;
        }
        emptyGlasses = newEmptyGlasses;
    }
    
    /**
     * @param newGlassesOfLemonade newGlassesOfLemonade
     */
    public void setGlassesOfLemonade(int newGlassesOfLemonade)
    {
        if (newGlassesOfLemonade < 0)
        {
            newGlassesOfLemonade = 0;
        }
        glassesOfLemonade = newGlassesOfLemonade;
    }
    
    /**
     * @param newPrice newPrice
     */
    public void setPrice(double newPrice)
    {
        if (newPrice < 0)
        {
            newPrice = 0;
        }
        price = newPrice;
    }
    
    /**
     * @param newIncome newIncome
     */
    public void setIncome(double newIncome)
    {
        if (newIncome < 0)
        {
            newIncome = 0;        }
        income = newIncome;
    }
    
    /**
     * @return makeLemonade makeLemonade
     */
    public int makeLemonade()
    {
        if (emptyGlasses >= 8 && lemons >= 6 && gallonsOfWater 
            >= 1 && cupsOfSugar >= 1)
        {
            lemons -= 6;
            gallonsOfWater -= 1;
            cupsOfSugar -= 1;
            emptyGlasses -= 8;
            glassesOfLemonade += 8;
            return 8;
        }
        else
        {
            return 0;
        }
    }
    
    /**
     * @return sellLemonade sellLemonade
     * modifies glassesOflemonade and Income to reflect selling a glass.
     * can also make a new batch if you are out of fullglasses.
     */
    public int sellLemonade()
    {
        if (glassesOfLemonade > 0)
        {
            glassesOfLemonade -= 1;
            income += price;
            return 1;
        }
        else
        {
            if (emptyGlasses >= 8)
            {
                makeLemonade();
                glassesOfLemonade -= 1;
                income += price;
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
    
    /**
     * @return sellMoreLemonade sellMoreLemonade
     * @param requestedGlasses requestedGlasses
     */
    public int sellMoreLemonade(int requestedGlasses)
    {
        if (requestedGlasses > 8)
        {
            requestedGlasses = 8;
        }
        if (glassesOfLemonade >= requestedGlasses)
        {
            glassesOfLemonade -= requestedGlasses;
            income += (price * requestedGlasses);
            return requestedGlasses;
        }
        else
        {
            if (makeLemonade() > 0)
            {
                glassesOfLemonade -= requestedGlasses;
                income += (price * requestedGlasses);
                return requestedGlasses;
            }
            else
            {
                income += (price * glassesOfLemonade);
                int rem = glassesOfLemonade;
                glassesOfLemonade = 0;
                return rem;
            }
        }
    }
}
