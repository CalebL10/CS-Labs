/**
 * Course.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of Course class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Course
{
    //Put instance variables below this line.  
    private String courseName;
    private String instructor;
    private TextBook textBook = new TextBook("", "", "");
    private double[] grades;
    
    /**
     * No parameter constructor for objects of class Course.
     */
    public Course(String courseName, String instructor, TextBook textBook)
    {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textBook = textBook;
    }
    
    public void setGrades(double[] grades)
    {
        this.grades = grades;
    }
    
    public String toString()
    {
        return courseName + ", " + instructor + ", " + textBook.toString();
    }
    
    public String getName()
    {
        return courseName;
    }
    
    public String getInstructor()
    {
        return instructor;
    }
    
    public TextBook getTextBook()
    {
        TextBook textBook2 = new TextBook(textBook);
        return textBook2;
    }
    
    public double getMinimum()
    {
        double minimum = 999;
        for (int index = 0; index != grades.length; index++)
        {
            if (grades[index] < minimum)
            {
                minimum = grades[index];
            }
            else
            {
                ;
            }
        }
        return minimum;
    }
    
    public double getMaximum()
    {
        double maximum = -999;
        for (int index = 0; index != grades.length; index++)
        {
            if (grades[index] > maximum)
            {
                maximum = grades[index];
            }
            else
            {
                ;
            }
        }
        return maximum;
    }
    
    public double getAverage()
    {
        double average;
        double sum = 0;
        if (grades.length == 0)
        {
            return 0;
        }
        for (int index = 0; index != grades.length; index++)
        {
            sum += grades[index];
        }
        average = (sum / grades.length);
        return average;
    }
}
