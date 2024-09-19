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
 * The test class  BookTest.
 *
 * @author Courtney Dixon
 * @version 20.2.2021
 */

public class BookTest
{
    /**
     * Tests for existance of the PersonalInfo class.
     */
    @Test
    public void testBookClassExists()
    {
        Class c;
        try
        {
            c = Class.forName("Book");
        } 
        catch (Exception e)
        {
            fail("Book: unable to perform test. "
                + "Did you name the class correctly?");
        }
    }
    
    /**
     * Tests getAuthor accessor method 
     * and setAuthor mutator method.
     */
    @Test
    public void testGetSetAuthor()
    {
        Book book = new Book();
        book.setAuthor("Harlan Coben");
        String bookAuthor = book.getAuthor();
        if(!bookAuthor.equals("Harlan Coben"))
        {
            fail("The thing should be Harlan Coben not " + bookAuthor);
        }
    }
    
    /**
     * Tests getTitle accessor method
     * and setTitle mutator method.
     */
    @Test
    public void testGetSetTitle()
    {
        Book book = new Book();
        book.setTitle("No Second Chance");
        String bookTitle = book.getTitle();
        if(!bookTitle.equals("No Second Chance"))
        {
            fail("The thing should be Six Years not " + bookTitle);
        }
    }

    /**
     * Tests getPages accessor method
     * and setPages mutator method.
     */
    @Test
    public void testGetSetPages()
    {
        Book book = new Book();
        book.setPages(245);
        int bookPages = book.getPages();
        if(bookPages != 245)
        {
            fail("The thing should be 245 not " + bookPages);
        }
    }
    
    /**
     * Tests getPublisher accessor method
     * and setPublisher mutator method.
     */
    @Test
    public void testGetSetPublisher()
    {
        Book book = new Book();
        book.setPublisher("Dutton");
        String bookPublisher = book.getPublisher();
        if(!bookPublisher.equals("Dutton"))
        {
            fail("The thing should be Dutton not " + bookPublisher);
        }
    }
    
    /**
     * Tests getPhoneNumber accessor method
     * and setPhoneNumber mutator method.
     */
    @Test
    public void testGetSetPhoneNumber()
    {
        Book book = new Book();
        book.setPhoneNumber("9803332265");
        String bookPhoneNumber = book.getPhoneNumber();
        if(!bookPhoneNumber.equals("9803332265"))
        {
            fail("The thing should be 9803332265 not " + bookPhoneNumber);
        }
    }
    
}