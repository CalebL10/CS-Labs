/**
 * TextBook.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of TextBook class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBook
{
    //Put instance variables below this line.  
    private String title;
    private String author;
    private String publisher;
    
    /**
     * No parameter constructor for objects of class TextBook.
     */
    public TextBook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public TextBook(TextBook object2)
    {
        this.title = object2.title;
        this.author = object2.author;
        this.publisher = object2.publisher;
    }
    
    public void set(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public String toString()
    {
        return title + ", " + author + ", " + publisher;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
}
