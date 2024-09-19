import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Method;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The test class PersonalInfoTest.
 *
 * @author Mark Hills
 * @version 1.0.0
 */

public class PersonalInfoTest
{
    /**
     * Tests for existance of the PersonalInfo class.
     */
    @Test
    public void testPersonalInfoClassExists()
    {
        Class c;
        try
        {
            c = Class.forName("PersonalInfo");
        }
        catch (Exception e)
        {
            fail("PersonalInfo: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }

    /**
     * Tests the main method in PersonalInfo.
     */
    @Test
    public void testPersonalInfoMain()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        PersonalInfo.main(new String[0]);
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        String s = baos.toString();
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Braden Baney",
            "Austin Blaylock","Jamal Branch","Kyler Byrd",
            "Matthew Darby","Hudson Feeney","Joseph Gulino",
            "Mark Hills","Tahlia Kamieniecki","Elijah Khamphengphet",
            "Alexander Kieffer","Tristan Lambert","Cody Lawing",
            "Caleb Long","Shane McDuffee","Corey McRae","Christian Novgrod",
            "Leif Nyland","Emma Oliver","Gage Petty","Nathan Phillips",
            "Mark Putnam","Alan Ray","Gael Senter","Tanner Shearouse",
            "Sage Siler","Jakyra Simmons","Domonique Snyder",
            "Zachary Stpierre","John Waugh","Luke West"));
        String[] sSplit = s.split("\n");
        String expected = sSplit[0].toLowerCase().replaceAll("\\s+", "").replaceAll("\\n+", "");
        boolean inClass = false;
        for (String studentName : students)
        {
            if (expected.equals(studentName.toLowerCase().replaceAll("\\s+", "")))
            {
                inClass = true;
                break;
            }
        }
        if (!inClass)
        {
            fail("You did not use your name:\n" + sSplit[0] + "\n");
        }
    }

}
