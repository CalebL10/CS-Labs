import java.util.Scanner;
/**
 * The Conversion class.
 * 
 * @author (Caleb Long) 
 * @version (11/28/22)
 */
public class Conversion
{
    public static void main(String[] args)
    {
        double tempF = 0;
        System.out.println("Centigrade\tFahrenheit");
        System.out.println("----------\t----------");
        
        for (double tempC = 0; tempC <= 20; tempC++)
        {
            tempF = (((double)9 / (double)5) * tempC + 32);
            System.out.printf("%10.0f\t%10.2f\n", tempC, tempF);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please press enter to continue...");
        scanner.nextLine();
    }
}
