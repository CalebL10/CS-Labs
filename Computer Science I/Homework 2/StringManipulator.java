/**
 * 
 * 
 * 
 *
 * @author (Caleb Long) 
 * @version (9/11/22)
 */
import java.util.Scanner;

public class StringManipulator
{
    /**
     * 
     */
    public static void main(String[] args)
    {
        //Create scanner to detect input
        Scanner myObj = new Scanner(System.in);
        
        //prompt for input, declare variables for scanner
        System.out.print("Enter your favorite city: ");
        String faveCity = myObj.nextLine();
        int charNum = faveCity.length();
        String uppercase = faveCity.toUpperCase();
        String lowercase = faveCity.toLowerCase();
        char firstChar = faveCity.charAt(0);
        
        //print results
        System.out.println(charNum +"\n" + uppercase + "\n" + lowercase);
        System.out.println(firstChar);
    }
}