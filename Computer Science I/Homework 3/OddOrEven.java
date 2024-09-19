//import statements go here.
import java.util.Scanner;
/**
 * OddOrEven class.
 * 
 * Determines if a number is odd or even.
 *
 * @author (Caleb Long)
 * @version (.1)
 */
public class OddOrEven
{
    //create main method below.
    public static void main(String[] args)
    {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = numberInput.nextInt();
        
        if(number % 2 ==0)
        {
            System.out.println("This input is even");
        }
        else
        {
            System.out.println("This input is odd");
        }
    }
}