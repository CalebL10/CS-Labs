import static org.junit.Assert.fail;  
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * The test class ProfitTest.
 *
 * @author Courtney Dixon
 * @version 20.2.2021
 */

public class ProfitTest
{
    /**
     * Tests for existance of the Profit class.
     */
    @Test
    public void testProfitClassExists()
    {
        Class c;
        try
        {
            c = Class.forName("Profit");
        } 
        catch (Exception e)
        {
            fail("Profit: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in Profit.
     */
    @Test
    public void testProfitMain()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Profit.main(new String[0]);
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        String s = baos.toString();
        s = s.replaceAll("\\n+", "").replaceAll("\\s+", "");
        String expected = "$18.2375";
        expected = expected.replaceAll("\\n+", "").replaceAll("\\s+", "");
        if (!(expected.equals(s)))
        {
            fail("\n\nExpected output: " + expected + "\n" 
                 + "Your output: " + s + "\n");
        }
    }
}