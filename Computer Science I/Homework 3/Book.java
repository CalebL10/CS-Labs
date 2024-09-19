/**
 * Book class.
 * 
 * declares variables and methods to be used in BookDriver.
 *
 * @author (Caleb Long)
 * @version (.1)
 */
public class Book
{
    //create private fields here
    private String author;
    private String title;
    private int pages;
    private String publisher;
    private String phone;
    
    //create constructor(s) below.
    public Book()
    {
        
    }
    
    //create accessor methods for fields below.
    
    public int getPages()
    {
        return pages;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public String getPhoneNumber()
    {
        return phone;
    }
    
    //create mutator methods for fields below.
    
    public void setAuthor(String authorTemp)
    {
        author = authorTemp;
    }
    
    public void setTitle(String titleTemp)
    {
        title = titleTemp;
    }
    
    public void setPages(int pagesTemp)
    {
        pages = pagesTemp;
    }
    
    public void setPublisher(String publisherTemp)
    {
        publisher = publisherTemp;
    }
    
    public void setPhoneNumber(String phoneTemp)
    {
        phone = phoneTemp;
    }
}
