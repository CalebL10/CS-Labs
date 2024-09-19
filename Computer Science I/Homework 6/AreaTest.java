import static org.junit.Assert.fail;  
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The AreaTest class.
 * 
 * This test class test the Area class.
 *
 * @author Courtney Dixon 
 * @version 11.3.2021
 */
public class AreaTest
{
    private Class c;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        try
        {
            c = Class.forName("Area");
        } 
        catch (Exception e)
        {
            fail("Area: unable to perform test. "
                + "Did you name the class correctly?");
        }
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
     * Tests for existance of the Area class.
     */
    @Test
    public void testAreaClassExists()
    {
        try
        {
            c = Class.forName("Area");
        } 
        catch (Exception e)
        {
            fail("Area: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }
    
    /**
     * Tests the area method of the Area class for circles.
     */
    @Test
    public void testAreaCircle()
    {
        double radius = 7.9;
        double correctArea = Math.PI * radius * radius;
        double studentArea = Area.area(radius);
        if (studentArea != correctArea)
        {
            fail("The correct circle area is: " + correctArea + "\n"
                + "The area your method calculated is: " + studentArea);
        }
    }

    /**
     * Tests the area method of the Area class for rectangles.
     */
    @Test
    public void testAreaRectangle()
    {
        int length = 17;
        int width = 22;
        double correctArea = length * width;
        double studentArea = Area.area(length, width);
        if (studentArea != correctArea)
        {
            fail("The correct rectangle area is: " + correctArea + "\n"
                + "The area your method calculated is: " + studentArea);
        }
    }

    /**
     * Tests the area method of the Area class cylinders.
     */
    @Test
    public void testAreaCylinder()
    {
        double radius = 4.7;
        double height = 15.1;
        double correctArea = Math.PI * radius * radius * height;
        double studentArea = Area.area(radius, height);
        if (studentArea != correctArea)
        {
            fail("The correct cylinder area is: " + correctArea + "\n"
                + "The area your method calculated is: " + studentArea);
        }
    }
}