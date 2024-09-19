import static org.junit.Assert.fail;  
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * FileDisplayTest class.
 * 
 * @author Courtney Dixon and Val Lapensée-Rankine
 * @version 30.10.2021
 */
public class FileDisplayTest
{
    private Class c;
    private FileDisplay w;
    private PrintStream oldSysOut;
    private InputStream oldSysIn;
    private ByteArrayOutputStream output;  
    private PrintWriter test;

    /**
     * FileDisplayTest.
     */
    public FileDisplayTest() throws IOException
    {
        test = new PrintWriter("test.txt");
        test.println("This file should only have two lines.");
        test.print("This is the last line of this file.");
        w = null;
        oldSysOut = null;
        oldSysIn = null; 
        w = new FileDisplay("test.txt");
        test.close();
    }

    /**
     * setUp()
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
    public void tearDown() throws IOException
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
     * fileDisplayClassExists()
     */ 
    @Test
    public void fileDisplayClassExists()
    {
        try
        {
            c = Class.forName("FileDisplay");
        } 
        catch (Exception e)
        {
            fail("FileDisplay: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * readFile(String filename)
     */
    public String[] readFile(String filename) throws FileNotFoundException
    {
        File testFile = new File(filename);
        Scanner reader = new Scanner(testFile);
        String correctText = "";
        while (reader.hasNext())
        {
            correctText += reader.nextLine() + "\n";
        }
        return correctText.split("\n");
    }

    /**
     * readFileFive(String filename)
     */
    public String[] readFileFive(String filename) throws FileNotFoundException
    {
        File testFile = new File(filename);
        Scanner reader = new Scanner(testFile);
        String correctText = "";
        for (int i = 0; i < 5 && reader.hasNext(); i++)
        {
            correctText += reader.nextLine() + "\n";
        }
        return correctText.split("\n");
    }
    
    /**
     * addNum(String[] exp)
     */
    public String[] addNum(String[] exp)
    {
        String[] expectedWithNums = new String[exp.length];
        for (int i = 0; i < exp.length; i++)
        {
            expectedWithNums[i] = (i + 1) + ": " + exp[i]; 
        }
        return expectedWithNums;
    }

    /**
     * testFileDisplayConstructor()
     */
    @Test
    public void testFileDisplayConstructor()
    {
        FileDisplay fd = new FileDisplay("README.TXT");
        if (fd == null)
        {
            fail("Your Constructor is incorrect."
                + "Check the instructions please.");
        }
    }

    /**
     * testFileDisplayMethodDisplayHead0()
     */
    @Test
    public void testFileDisplayMethodDisplayHead0() throws IOException
    {
        String[] expected = readFile("test.txt");
        FileDisplay fd = new FileDisplay("test.txt");
        fd.displayHead();
        String[] op = output.toString().split("\n");
        String msg = "";
        if (op.length > expected.length)
        {
            fail("You're printing too many lines.");
        }
        else if (op.length < expected.length)
        {
            fail("Did you print all the expected output?");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].replaceAll("\\r","").equals(expected[i].replaceAll("\\r","")))
                {
                    checkLine(op[i], msg, expected[i]);
                }
            }
        }
    }

    /**
     * testFileDisplayMethodDisplayHead1()
     */
    @Test
    public void testFileDisplayMethodDisplayHead1() throws IOException
    {
        String[] expected = readFileFive("README.TXT");
        FileDisplay fd = new FileDisplay("README.TXT");
        fd.displayHead();
        String[] op = output.toString().split("\n");
        String msg = "";
        if (op.length > expected.length)
        {
            fail("You're printing too many lines.");
        }
        else if (op.length < expected.length)
        {
            fail("Did you print all the expected output?");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].replaceAll("\\r","").equals(expected[i].replaceAll("\\r","")))
                {
                    checkLine(op[i], msg, expected[i]);
                }
            }
        }
    }

    /**
     * testFileDisplayMethodDisplayContents0()
     */
    @Test
    public void testFileDisplayMethodDisplayContents0() throws IOException
    {
        String[] expected = readFile("test.txt");
        FileDisplay fd = new FileDisplay("test.txt");
        fd.displayContents();
        String[] op = output.toString().split("\n");
        String msg = "";
        if (op.length > expected.length)
        {
            fail("You're printing too many lines.");
        }
        else if (op.length < expected.length)
        {
            fail("Did you print all the expected output?");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].replaceAll("\\r","").equals(expected[i].replaceAll("\\r","")))
                {
                    checkLine(op[i], msg, expected[i]);
                }
            }
        }
    }

    /**
     * testFileDisplayMethodDisplayContents1()
     */
    @Test
    public void testFileDisplayMethodDisplayContents1() throws IOException
    {
        String[] expected = readFile("README.TXT");
        FileDisplay fd = new FileDisplay("README.TXT");
        fd.displayContents();
        String[] op = output.toString().split("\n");
        String msg = "";
        if (op.length > expected.length)
        {
            fail("You're printing too many lines.");
        }
        else if (op.length < expected.length)
        {
            fail("Did you print all the expected output?");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].replaceAll("\\r","").equals(expected[i].replaceAll("\\r","")))
                {
                    checkLine(op[i], msg, expected[i]);
                }
            }
        }
    }

    /**
     * testFileDisplayMethodDisplayWithLineNumbers0()
     */
    @Test
    public void testFileDisplayMethodDisplayWithLineNumbers0() throws IOException
    {
        String[] expected = readFile("test.txt");
        expected = addNum(expected);
        FileDisplay fd = new FileDisplay("test.txt");
        fd.displayWithLineNumbers();
        String[] op = output.toString().split("\n");
        String msg = "";
        if (op.length > expected.length)
        {
            fail("You're printing too many lines.");
        }
        else if (op.length < expected.length)
        {
            fail("Did you print all the expected output?");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].replaceAll("\\r","").equals(expected[i].replaceAll("\\r","")))
                {
                    checkLine(op[i], msg, expected[i]);
                }
            }
        }
    }

    /**
     * testFileDisplayMethodDisplayWithLineNumbers1()
     */
    @Test
    public void testFileDisplayMethodDisplayWithLineNumbers1() throws IOException
    {
        String[] expected = readFile("README.TXT");
        expected = addNum(expected);
        FileDisplay fd = new FileDisplay("README.TXT");
        fd.displayWithLineNumbers();
        String[] op = output.toString().split("\n");
        String msg = "";
        if (op.length > expected.length)
        {
            fail("You're printing too many lines.");
        }
        else if (op.length < expected.length)
        {
            fail("Did you print all the expected output?");
        }
        else
        {
            for (int i = 0; i < op.length; i++)
            {
                msg = "Output Line " + i;
                if (!op[i].replaceAll("\\r","").equals(expected[i].replaceAll("\\r","")))
                {
                    checkLine(op[i], msg, expected[i]);
                }
            }
        }
    }

    //private void checkLine(Scanner o, String msg, String expected)
    /**
     * checkLine(String o, String msg, String expected)
     */
    private void checkLine(String o, String msg, String expected)
    {
        if (!o.equals(expected))
        {
            fail(" " + msg + " is malformed.\n"
                + "Expected:  \"" + expected + "\"\n" 
                + "Your code: \"" + o + "\"\n");
        }
    }
}
