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
 * The test class OddOrEvenTest.
 *
 * @author Courtney Dixon
 * @version 20.2.2021
 */

public class OddOrEvenTest
{
    /**
     * Tests for existance of the PersonalInfo class.
     */
    @Test
    public void testOddOrEvenClassExists()
    {
        Class c;
        try
        {
            c = Class.forName("OddOrEven");
        } 
        catch (Exception e)
        {
            fail("OddOrEven: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }
    
    /**
     * Tests the main method in OddOrEven.
     */
    @Test
    public void testOddOrEvenMain()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String input = new String("6\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.setOut(new PrintStream(baos));        
        OddOrEven.main(null);
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        String s = baos.toString();
        String expected = "Please enter an integer: \nThe input is even";
        if (!(expected.equals(s)))
        {
            fail("Expected output: " + expected + "\n" 
                 + "Your output: " + s + "\n");
        }
    }
}