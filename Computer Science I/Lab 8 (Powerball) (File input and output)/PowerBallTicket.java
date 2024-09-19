/**
 * PowerBallTicket.java
 * 
 */


//Put any imports below this line.
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Short, one-line description of PowerBallTicket class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (Caleb Long) 
 * @version (.01)
 */
public class PowerBallTicket
{
    //Put instance variables below this line.  
    
    /**
     * No parameter constructor for objects of class PowerBallTicket.
     */
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a file name");
        String fileName = input.nextLine();
        PrintWriter outputFile = new PrintWriter(fileName);
        
        System.out.println("How many PowerBall tickets do you want?");
        PowerBall powerBall = new PowerBall();
        for (int num = input.nextInt(); num > 0; num--)
        {
            powerBall.generateLotteryPicks();
            outputFile.println(powerBall.toString());
        }
        outputFile.close();
    }
}
