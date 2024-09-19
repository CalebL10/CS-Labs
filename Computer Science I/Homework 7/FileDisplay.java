import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
/**
 * The FileDisplay class.
 * 
 * @author (Caleb Long)
 * @version (11/28/22)
 */
public class FileDisplay
{
    //Put instance variables below this line.  
    private String fileName;
    
    /**
     * Constructor for objects of class FileDisplay.
     * @param fileName fileName
     */
    public FileDisplay(String fileName)
    {
        this.fileName = fileName;
    }
    
    public void displayHead() throws IOException
    {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        for (int index = 0; index < 5; index++)
        {
            if (scanner.hasNext() == true)
            {
                System.out.println(scanner.nextLine());
            }
        }
    }
    
    public void displayContents() throws IOException
    {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNext() == true)
        {
            System.out.println(scanner.nextLine());
        }
    }
    
    public void displayWithLineNumbers() throws IOException
    {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        for (int line = 1; scanner.hasNext() == true; line++)
        {
            System.out.println(line + ": " + scanner.nextLine());
        }
    }
}
