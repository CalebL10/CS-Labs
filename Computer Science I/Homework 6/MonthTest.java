import static org.junit.Assert.fail;  
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
/**
 * The MonthTest class.
 * 
 * This test class test the Month class.
 *
 * @author Courtney Dixon
 * @version 11.3.2021
 */
public class MonthTest
{
    private Class c;
    private Month m1;
    private Month m2;
    private Month m3;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        m1 = new Month();
        m2 = new Month();
        m3 = new Month();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
     /**
     * Tests for existance of the Month class.
     */
    @Test
    public void testMonthClassExists()
    {
        try
        {
            c = Class.forName("Month");
        } 
        catch (Exception e)
        {
            fail("Month: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }
    
    /**
     * Tests the no-arg constructor of the Month class.
     */
    @Test
    public void testMonthNoArgConstructor()
    {
        m1 = new Month();
        if (m1.getMonthNumber() != 1)
        {
            fail("No argument constructor incorrectly "
                 + "set monthNumber field.");
        }
    }
    
    /**
     * Tests the one-arg constructor with int parameter of the Month class.
     */
    @Test
    public void testMonthIntOneArgConstructor()
    {
        m2 = new Month(-1);
        if (m2.getMonthNumber() != 1)
        {
            fail("One argument constructor with integer parameter " 
                 + "incorrectly set monthNumber field.");
        }
    }
    
    /**
     * Tests the one-arg constructor with String parameter of the Month class.
     */
    @Test
    public void testMonthStringOneArgConstructor()
    {
        m3 = new Month("August");
        if (m3.getMonthNumber() != 8)
        {
            fail("One argument constructor with String parameter " 
                 + "incorrectly set monthNumber field.");
        }
    }
    
    /**
     * Tests the setMonthNumber method of the Month class.
     */
    @Test
    public void testSetMonthNumberMethod()
    {
        m1 = new Month();
        m1.setMonthNumber(-3);
        if (m1.getMonthNumber() != 1)
        {
            fail("setMonthNumber method incorrectly "
                 + "set monthNumber field.");
        }
    }
    
    /**
     * Tests the getMonthNumber method of the Month class.
     */
    @Test
    public void testGetMonthNumberMethod()
    {
        m2 = new Month(-5);
        if (m2.getMonthNumber() != 1)
        {
            fail("getMonthNumber method returns incorrect "
                 + "value from monthNumber field.");
        }
    }
    
    /**
     * Tests the getMonthName method of the Month class.
     */
    @Test
    public void testGetMonthNameMethod()
    {
        m3 = new Month("November");
        if (!m3.getMonthName().equals("November"))
        {
            fail("getMonthName method returns incorrect "
                 + "value for month name.");
        }
    }
    
    /**
     * Tests the toString method of the Month class.
     */
    @Test
    public void testToStringMethod()
    {
        m1 = new Month();
        if (!m1.getMonthName().equals(m1.toString()))
        {
            fail("toString method and getMonthName method disagree "
                 + "about which month it is.");
        }
    }
    
    /**
     * Tests the equals method of the Month class.
     */
    @Test
    public void testEqualsMethod()
    {
        m2 = new Month(5);
        m3 = new Month("May");
        if(!m2.equals(m3))
        {
            fail("equals method returned false, but May is the 5th month.");
        }
    }
    
    /**
     * Tests the greaterThan method of the Month class.
     */
    @Test
    public void testGreaterThanMethod()
    {
        m1 = new Month();
        m2 = new Month(4);
        if(m1.greaterThan(m2))
        {
            fail("greaterThan method returned true, but "
                 + "January is not greater than April.");
        }
    }
    
    /**
     * Tests the lessThan method of the Month class.
     */
    @Test
    public void testLessThanMethod()
    {
        m1 = new Month();
        m3 = new Month("July");
        if(m3.lessThan(m1))
        {
            fail("lessThan method returned true, but "
                 + " July is not less than January.");
        }
    }
    
}
