/**
 * BookDriver class.
 * 
 * Describe this class and for what it is used.
 *
 * @author (your name here)
 * @version (date or version number)
 */
public class BookDriver
{
    //create main method below.
    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.setAuthor("Susan Meyers");
        book1.setTitle("Book1");
        book1.setPages(200);
        book1.setPublisher("Publisher1");
        book1.setPhoneNumber("9195550110");
        
        Book book2 = new Book();
        book2.setAuthor("Mark Jones");
        book2.setTitle("Book2");
        book2.setPages(120);
        book2.setPublisher("Publisher2");
        book2.setPhoneNumber("9195550169");
        
        Book book3 = new Book();
        book3.setAuthor("Joy Rogers");
        book3.setTitle("Book3");
        book3.setPages(325);
        book3.setPublisher("Publisher3");
        book3.setPhoneNumber("9195550114");
        
        System.out.printf("%s %s %d %s %s \n", book1.getAuthor(), 
                         book1.getTitle(), book1.getPages(), book1.getPublisher(), book1.getPhoneNumber());
        
        System.out.printf("%s %s %d %s %s \n",book2.getAuthor(), 
                         book2.getTitle(), book2.getPages(), book2.getPublisher(), book2.getPhoneNumber());
                         
        System.out.printf("%s %s %d %s %s \n",book3.getAuthor(), 
                         book3.getTitle(), book3.getPages(), book3.getPublisher(), book3.getPhoneNumber());
                         
    }
}
