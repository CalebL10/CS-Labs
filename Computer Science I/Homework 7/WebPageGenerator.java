import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * The WebPageGenerator class
 * 
 * @author (Caleb Long) 
 * @version (11/28/22)
 */
public class WebPageGenerator
{
    public static void main(String[] args) throws IOException
    {
        String name;
        String description;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Describe yourself: ");
        description = scanner.nextLine();
        
        File file = new File("webpage.html");
        file.createNewFile();
        PrintWriter writer = new PrintWriter(file);
        writer.write("<html>\n"
            + "<head>\n"
            + "</head>\n"
            + "<body>\n"
            + "\t<center>\n"
            + "\t\t<h1>" + name + "</h1>\n"
            + "\t</center>\n"
            + "\t<hr>\n"
            + "\t\t" + description + "\n"
            + "\t<hr>\n"
            + "</body>\n"
            + "</html>");
        writer.close();
    }
}
