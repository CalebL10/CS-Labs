import static org.junit.Assert.fail;  
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The test class BookDriverTest.
 *
 * @author Courtney Dixon
 * @version 20.2.2021
 */

public class BookDriverTest
{
    /**
     * Tests for existance of the PersonalInfo class.
     */
    @Test
    public void testBookDriverClassExists()
    {
        Class c;
        try
        {
            c = Class.forName("BookDriver");
        } 
        catch (Exception e)
        {
            fail("BookDriver: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }
    
    /**
     * Tests the main method in BookDriver.
     */
    @Test
    public void testBookDriverMain()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        BookDriver.main(new String[0]);
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        String s = baos.toString();
        s = s.replaceAll("\\s+", "");
        s = s.replaceAll("\\n+", "");
        s = s.toLowerCase();
        String expected = "Susan Meyers Book1 200 Publisher1 9195550110"
                          + "Mark Jones Book2 120 Publisher2 9195550169"
                          + "Joy Rogers Book3 325 Publisher3 9195550114";
        expected = expected.replaceAll("\\s+", "");
        expected = expected.replaceAll("\\n+", "");
        expected = expected.toLowerCase();
        if (!(expected.equals(s)))
        {
            fail("Expected output: " + expected + "\n" 
                 + "Your output: " + s + "\n");
        }
    }

}