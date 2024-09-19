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
 * WebPageGeneratorTest class.
 * 
 * @author Courtney Dixon and Val Lapensée-Rankine
 * @version 30.10.2021
 */ 
public class WebPageGeneratorTest
{
    private Class c;
    private WebPageGenerator w;
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;  

    /**
     * WebPageGeneratorTest.
     */
    public WebPageGeneratorTest()
    {
        w = null;
        oldSysOut = null;
        oldSysIn = null; 
        w = new WebPageGenerator();
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
    public void webPageGeneratorClassExists()
    {
        try
        {
            c = Class.forName("WebPageGenerator");
        } 
        catch (Exception e)
        {
            fail("WebPageGenerator: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in WebPageGenerator.
     */
    //@Test
    public void testWebPageGeneratorMain(String inValue)
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
            fail("Did you print all the expected output? Got " 
                 + op.length + " lines, expected " + r.length + " lines");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].equals(result[i]))
                {
                    checkLine(op[i], msg, result[i]);
                }
            }
        }
    }

    //private void checkLine(Scanner o, String msg, String expected)
    private void checkLine(String o, String msg, String expected)
    {

        o = o.replaceAll("\\r","");
            
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
    public String retrieveExpected(int lineNumber)
    {        
        switch (lineNumber)
        {
            case 0:
                return "<html><head></head><body><center><h1>Courtney</h1>"
                        + "</center><hr>LecturerofComputerScience"
                        + "<hr></body></html>";
            case 1:
                return "<html><head></head><body><center><h1>JulieTaylor</h1>"
                        + "</center><hr>Iamacomputersciencemajor,amember"
                        + "oftheJazzclub,andIhopetoworkasamobileapp"
                        + "developerafterIgraduate.<hr></body></html>";
            case 2:
                return "<html><head></head><body><center><h1>Paul</h1>"
                        + "</center><hr>Ilikepuns.Checktheseout"
                        + "https://parade.com/1024249/marynliles/funny-puns/."
                        + "<hr></body></html>";
            case 3:
                return "<html><head></head><body><center><h1>Dipper</h1>"
                        + "</center><hr>Idomysterytwinthingswithmysistermable"
                        + "inGravityFalls,ORwhilestayingwithGrunkleStanthissummer."
                        + "<hr></body></html>"; 
        }
        return "";
    }

    /**
     * Method testWebPageGeneratorMain0.
     */
    @Test
    public void testWebPageGeneratorMain0()
    {
        String[] result = new String[2];
        result[0] = new String("Enter your name: ");
        result[1] = new String("Describe yourself: ");

        String test = "Courtney\n";
        test += "Lecturer of Computer Science\n";
        testWebPageGeneratorMain(test);
        testResult(result);
        testFileGenerated0();
    }

    /**
     * Method testWebPageGeneratorMain1.
     */
    @Test
    public void testWebPageGeneratorMain1()
    {
        String[] result = new String[2];
        result[0] = new String("Enter your name: ");
        result[1] = new String("Describe yourself: ");

        String test = "Julie Taylor\n";
        test += "I am a computer science major, a member of the Jazz club, and "
        + "I hope to work as a mobile app developer after I graduate.\n";
        testWebPageGeneratorMain(test);
        testResult(result);
        testFileGenerated1();
    }

    /**
     * Method testWebPageGeneratorMain2.
     */
    @Test
    public void testWebPageGeneratorMain2()
    {
        String[] result = new String[2];
        result[0] = new String("Enter your name: ");
        result[1] = new String("Describe yourself: ");

        String test = "Paul\n";
        test += "I like puns. Check these out "
        + "https://parade.com/1024249/marynliles/funny-puns/.\n";
        testWebPageGeneratorMain(test);
        testResult(result);
        testFileGenerated2();
    }

    /**
     * Method testWebPageGeneratorMain3.
     */
    @Test
    public void testWebPageGeneratorMain3()
    {
        String[] result = new String[2];
        result[0] = new String("Enter your name: ");
        result[1] = new String("Describe yourself: ");

        String test = "Dipper\n";
        test += "I do mystery twin things with my sister mable in Gravity Falls, " 
        + "OR while staying with Grunkle Stan this summer.\n";
        testWebPageGeneratorMain(test);
        testResult(result);
        testFileGenerated3();
    }

    /**
     * 
     */
    public void testFileGenerated0()
    {
        try
        {
            File genFile = new File("webpage.html");
            Scanner fileReader = new Scanner(genFile);
            String expected = retrieveExpected(0);
            String output = "";
            while (fileReader.hasNext())
            {
                output += fileReader.next();
            }
            output = output.replaceAll("\\n","");
            output = output.replaceAll("\\s","");
            output = output.replaceAll("\\r","");
            output = output.replaceAll("\\t","");
            fileReader.close();
            //fail(output + "\n");
            if (!output.equals(expected))
            {
                fail("Your generated html file contents are wrong."
                    + "\n" + output + "\n" + expected);
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Your program did not produce a file named webpage.html.");
        }        
    }

    /**
     * 
     */
    public void testFileGenerated1()
    {
        try
        {
            File genFile = new File("webpage.html");
            Scanner fileReader = new Scanner(genFile);
            String expected = retrieveExpected(1);
            String output = "";
            while (fileReader.hasNext())
            {
                output += fileReader.next();
            }
            output = output.replaceAll("\\n","");
            output = output.replaceAll("\\s","");
            output = output.replaceAll("\\r","");
            output = output.replaceAll("\\t","");
            fileReader.close();
            if (!output.equals(expected))
            {
                fail("Your generated html file contents are wrong.");
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Your program did not produce a file named webpage.html.");
        }
    }

    /**
     * 
     */
    public void testFileGenerated2()
    {
        try
        {
            File genFile = new File("webpage.html");
            Scanner fileReader = new Scanner(genFile);
            String expected = retrieveExpected(2);
            String output = "";
            while (fileReader.hasNext())
            {
                output += fileReader.next();
            }
            output = output.replaceAll("\\n","");
            output = output.replaceAll("\\s","");
            output = output.replaceAll("\\r","");
            output = output.replaceAll("\\t","");
            fileReader.close();
            if (!output.equals(expected))
            {
                fail("Your generated html file contents are wrong.");
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Your program did not produce a file named webpage.html.");
        }
    }

    /**
     * 
     */
    public void testFileGenerated3()
    {
        try
        {
            File genFile = new File("webpage.html");
            Scanner fileReader = new Scanner(genFile);
            String expected = retrieveExpected(3);
            String output = "";
            while (fileReader.hasNext())
            {
                output += fileReader.next();
            }
            output = output.replaceAll("\\n","");
            output = output.replaceAll("\\s","");
            output = output.replaceAll("\\r","");
            output = output.replaceAll("\\t","");
            fileReader.close();
            if (!output.equals(expected))
            {
                fail("Your generated html file contents are wrong."
                    + "\n" + output + "\n" + expected);
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Your program did not produce a file named webpage.html.");
        }
    }
}
