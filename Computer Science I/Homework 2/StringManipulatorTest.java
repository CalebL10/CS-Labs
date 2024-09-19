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
 * The test class StringManipulatorTest.
 *
 * @author Courtney Dixon
 * @version 20.2.2021
 */

public class StringManipulatorTest
{
    /**
     * Tests for existance of the StringManipulator class.
     */
    @Test
    public void testStringManipulatorClassExists()
    {
        Class c;
        try
        {
            c = Class.forName("StringManipulator");
        } 
        catch (Exception e)
        {
            fail("StringManipulator: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in " " that prints output.
     */
    @Test
    public void testStringManipulatorMain()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        StringManipulator.main(new String[0]);
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        String s = baos.toString();
        String[] s2 = s.split("\n");
        int expectedLines = 4;
        s2[3] = s2[3].replaceAll("\n","").replaceAll("\\s","");
        int charsInLastLine = s2[3].length();
        if (s2.length != expectedLines)
        {
            fail("Expected output should consist of four lines.\n");
        }
        if (charsInLastLine != 1)
        {
            fail("Expected output's last line should be a single character.\n"
                 + "\t\t\t\t\tYour line is \"" + s2[3] + "\" and has " 
                 + s2[3].length() + " characters.");
        }
    }
}