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
import java.util.Scanner;

/**
 * The test class SalesTaxTest.
 *
 * @author Courtney Dixon
 * @version 20.2.2021
 */

public class SalesTaxTest
{
    private Class c;
    private SalesTax s;
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;
    
    public SalesTaxTest()
    {
        s = null;
        oldSysOut = null;
        oldSysIn = null; 
        s = new SalesTax();
    }

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
     * Tests for existance of the PersonalInfo class.
     */
    @Test
    public void testSalesTaxClassExists()
    {
        try
        {
            c = Class.forName("SalesTax");
        } 
        catch (Exception e)
        {
            fail("SalesTax: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in SumOfNumbers.
     */
    //@Test
    public void testSalesTaxMain(String inValue)
    {
        String inputValue = inValue;
        ByteArrayInputStream input = new ByteArrayInputStream(inputValue.getBytes());
        System.setIn(input);
        try 
        {
            s.main(null);
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
        Scanner op = new Scanner(output.toString());
        String[] result = r;
        int i = 0;
        int properOutputLines = r.length;
        String msg = "";

        //if there is no output at all
        if (!op.hasNextLine()) 
        {
            fail("Test for SumOfNumbersMain Failed: No output detected.");
        }

        while(op.hasNext())
        {
            msg = "Output Line " + i;
            checkLine(op, msg, result[i]);
            i++;
            properOutputLines--;
        }
        
        if (properOutputLines > 0)
        {
            fail("Did you print all the expected output?");
        }
    }
    
    private void checkLine(Scanner o, String msg, String expected)
    {
        if (!o.hasNextLine()) 
        {
            fail("Missing " + msg);
        }
        String line = o.nextLine();        
        if (!line.equals(expected))
        {
            fail(" " + msg + " is malformed.\n"
                + "Expected:  \"" + expected + "\"\n" 
                + "Your code: \"" + line + "\"\n");
        }
    }
    
    /**
     * Method to help test input in main method.
     */
    @Test
    public void test1()
    {
        String[] testData1 = new String[8];
        testData1[0] = "Please enter your name: ";
        testData1[1] = "Please enter your amount of purchase: ";
        testData1[2] = "Hello, Courtney";
        testData1[3] = "Purchase Amount: $97.56";
        testData1[4] = "State Sales Tax: $5.3658";
        testData1[5] = "County Sales Tax: $1.9512";
        testData1[6] = "Total Sales Tax: $7.317";   
        testData1[7] = "Total Sales Amount: $104.87700000000001";
        
        testSalesTaxMain("Courtney\n97.56\n");
        testResult(testData1);
    }
    
    /**
     * Method to help test input in main method.
     */
    @Test
    public void test2()
    {
        String[] testData2 = new String[8];
        testData2[0] = "Please enter your name: ";
        testData2[1] = "Please enter your amount of purchase: ";
        testData2[2] = "Hello, Dixon";
        testData2[3] = "Purchase Amount: $56.97";
        testData2[4] = "State Sales Tax: $3.13335";
        testData2[5] = "County Sales Tax: $1.1394";
        testData2[6] = "Total Sales Tax: $4.27275";   
        testData2[7] = "Total Sales Amount: $61.24275";
        
        testSalesTaxMain("Dixon\n56.97\n");
        testResult(testData2);
    }
}
