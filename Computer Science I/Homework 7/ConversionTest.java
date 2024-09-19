import static org.junit.Assert.fail;  
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * ConversionTest class.
 * 
 * @author Courtney Dixon and Val Lapensée-Rankine
 * @version 30.10.2021
 */
public class ConversionTest
{
    private Class c;
    private Conversion w;
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;  

    /**
     * ConversionTest.
     */
    public ConversionTest()
    {
        w = null;
        oldSysOut = null;
        oldSysIn = null; 
        w = new Conversion();
    }

    /**
     * 
     */
    @Before
    public void setUp()
    {
        oldSysIn = System.in;
        oldSysOut = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    /**
     * Tears down the test fixture.
     * 
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        resetStreams();
    }

    /**
     * Resets I/O streams.
     */
    private void resetStreams()
    {
        System.setOut(oldSysOut);
        System.setIn(oldSysIn);
    }

    /**
     * 
     */ 
    @Test
    public void conversionClassExists()
    {
        try
        {
            c = Class.forName("Conversion");
        } 
        catch (Exception e)
        {
            fail("Conversion: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in Conversion.
     */
    //@Test
    public void testConversionMain(String inValue)
    {
        String inputValue = inValue;
        ByteArrayInputStream input = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(input);
        try 
        {
            w.main(null);
        }
        catch (java.util.InputMismatchException e) 
        {
            e.printStackTrace();
            fail("Input did not match what your Scanner expected.");
        }
        catch (java.util.NoSuchElementException e) 
        {
            e.printStackTrace();
            fail("In main, your Scanner expected more input than provided.");
        }
        catch (java.lang.IllegalStateException e) 
        {
            e.printStackTrace();
            fail("In main, your Scanner malfunctioned; " 
                + "did it get closed somehow."
                + " \nView the exception details in the bottom section"  
                + " of your terminal window.");
        }
        catch (java.util.IllegalFormatConversionException e) 
        {
            e.printStackTrace();
            fail("In main, you have an incorrect format in your printf."
                + " You seem to be trying to print a string with a d or f" 
                + " conversion.\nView the exception details in the"
                + " bottom section of your terminal window.");
        }
        catch (Exception e) 
        {
            e.printStackTrace();
            fail("Your main method failed with an unknown exception. "
                + " \nView the exception details in the bottom section"  
                + " of your terminal window.");        
        }
    }

    /**
     * testResult method.
     * This method takes in the expected output 
     * and compares it to the actual output. 
     */
    public void testResult(String[] r)
    {
        String[] op = output.toString().split("\n");
        String[] result = r;
        String msg = "";
        if (op.length > r.length)
        {
            fail("You're printing too many lines.");
        }
        else if (op.length < r.length)
        {
            fail("Did you print all the expected output?");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].replaceAll("\\r","").equals(result[i].replaceAll("\\r","")))
                {
                    checkLine(op[i], msg, result[i]);
                }
            }
        }
    }

    //private void checkLine(Scanner o, String msg, String expected)
    private void checkLine(String o, String msg, String expected)
    {
        if (!o.equals(expected))
        {
            fail(" " + msg + " is malformed.\n"
                + "Expected:  \"" + expected + "\"\n" 
                + "Your code: \"" + o + "\"\n");
        }
    }

    /**
     * 
     */
    @Test
    public void testConversion()
    {
        String test = "\n";
        String[] result = new String[24];
        result[0] = "Centigrade\tFahrenheit";
        result[1] = "----------\t----------";
        result[2] = String.format("%10d\t%10.2f", 0, 32.00);
        result[3] = String.format("%10d\t%10.2f", 1, 33.80);
        result[4] = String.format("%10d\t%10.2f", 2, 35.60);
        result[5] = String.format("%10d\t%10.2f", 3, 37.40);
        result[6] = String.format("%10d\t%10.2f", 4, 39.20);
        result[7] = String.format("%10d\t%10.2f", 5, 41.00);
        result[8] = String.format("%10d\t%10.2f", 6, 42.80);
        result[9] = String.format("%10d\t%10.2f", 7, 44.60);
        result[10] = String.format("%10d\t%10.2f", 8, 46.40);
        result[11] = String.format("%10d\t%10.2f", 9, 48.20);
        result[12] = String.format("%10d\t%10.2f", 10, 50.00);
        result[13] = String.format("%10d\t%10.2f", 11, 51.80);
        result[14] = String.format("%10d\t%10.2f", 12, 53.60);
        result[15] = String.format("%10d\t%10.2f", 13, 55.40);
        result[16] = String.format("%10d\t%10.2f", 14, 57.20);
        result[17] = String.format("%10d\t%10.2f", 15, 59.00);
        result[18] = String.format("%10d\t%10.2f", 16, 60.80);
        result[19] = String.format("%10d\t%10.2f", 17, 62.60);
        result[20] = String.format("%10d\t%10.2f", 18, 64.40);
        result[21] = String.format("%10d\t%10.2f", 19, 66.20);
        result[22] = String.format("%10d\t%10.2f", 20, 68.00);
        result[23] = "Please press enter to continue...";

        testConversionMain(test);
        testResult(result);
    }
}
