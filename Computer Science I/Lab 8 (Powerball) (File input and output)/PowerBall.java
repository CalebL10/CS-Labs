/**
 * PowerBall.java
 * 
 */

//Put any imports below this line.
//Java.util.* is importing the ENTIRE package.
import java.util.Random;
 
/**
 * Short, one-line description of PowerBall class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (Caleb Long) 
 * @version (.01)
 */
public class PowerBall
{
    //Put instance variables below this line.  
    public static final int MAX_LOTTERY_NUMBER = 59;
    public static final int MAX_POWER_BALL_NUMBER = 35;
    
    private Random randomGenerator;
    private int number0;
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int powerBall;
    
    /**
     * No parameter constructor for objects of class PowerBall.
     */
    public PowerBall()
    {
        randomGenerator = new Random();
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        powerBall = 0;
    }
    
    /**
     * Generates random num between 1-59.
     * @return Random number.
     */
    public int generateLotteryNumber()
    {
        // put your code here
        return randomGenerator.nextInt(MAX_LOTTERY_NUMBER) + 1;
    }
    
    /**
     * Generates a random num between 1-35.
     * @return Random number.
     */
    public int generatePowerBallNumber()
    {
        return randomGenerator.nextInt(MAX_POWER_BALL_NUMBER) + 1;
    }
    
    /**
     * Tests if a num is duplicate to number variables 1-4.
     * @param newNumber.
     */
    public boolean isDuplicateLotteryNumber(int newNumber)
    {
        if (newNumber == number0 || newNumber == number1 
        || newNumber == number2 || newNumber == number3 
        || newNumber == number4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Returns a lottery num obtained 
     * from generateLotteryNumber.
     * 
     * Also checks for duplicates 
     * using isDuplicateLotteryNumber.
     * 
     * @return Next Lottery Number.
     */
    public int nextLotteryNumber()
    {
        int newNumber;
        do
        {
            newNumber = generateLotteryNumber();
        }
        while (isDuplicateLotteryNumber(newNumber));
        return newNumber;
    }
    
    public void reset()
    {
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        powerBall = 0;
    }
    
    public void generateLotteryPicks()
    {
        reset();
        number0 = nextLotteryNumber();
        number1 = nextLotteryNumber();
        number2 = nextLotteryNumber();
        number3 = nextLotteryNumber();
        number4 = nextLotteryNumber();
        powerBall = generatePowerBallNumber();
    }
    
    public String toString()
    {
        String str = String.format("%02d, %02d, %02d, %02d, %02d, Powerball %02d", 
        number0, number1, number2, number3, number4, powerBall);
        return str;
    }
    
    /**
     * Accessor for randomGenerator.
     * @return randomGenerator.
     */
    public Random getRandomGenerator()
    {
        return randomGenerator;
    }
    
    /**
     * Accessor for number0.
     * @return number0.
     */
    public int getNumber0()
    {
        return number0;
    }
    
    /**
     * Accessor for number1.
     * @return number1.
     */
    public int getNumber1()
    {
        return number1;
    }
    
    /**
     * Accessor for number2.
     * @return number2.
     */
    public int getNumber2()
    {
        return number2;
    }
    
    /**
     * Accessor for number3.
     * @return number3.
     */
    public int getNumber3()
    {
        return number3;
    }
    
    /**
     * Accessor for number4.
     * @return number4.
     */
    public int getNumber4()
    {
        return number4;
    }
    
    /**
     * Accessor for powerBall.
     * @return powerBall.
     */
    public int getPowerBall()
    {
        return powerBall;
    }
    
    /**
     * Mutator for randomGenerator.
     * @param randomGenerator.
     */
    public void setRandomGenerator(Random randomGenerator)
    {
        this.randomGenerator = randomGenerator;
    }
    
    /**
     * Mutator for number0.
     * @param number0.
     */
    public void setNumber0(int number0)
    {
        this.number0 = number0;
    }
    
    /**
     * Mutator for number1.
     * @param number1.
     */
    public void setNumber1(int number1)
    {
        this.number1 = number1;
    }
    
    /**
     * Mutator for number2.
     * @param number2.
     */
    public void setNumber2(int number2)
    {
        this.number2 = number2;
    }
    
    /**
     * Mutator for number3.
     * @param number3.
     */
    public void setNumber3(int number3)
    {
        this.number3 = number3;
    }
    
    /**
     * Mutator for number4.
     * @param number4.
     */
    public void setNumber4(int number4)
    {
        this.number4 = number4;
    }
    
    /**
     * Mutator for powerBall.
     * @param powerBall.
     */
    public void setPowerBall(int powerBall)
    {
        this.powerBall = powerBall;
    }
}
