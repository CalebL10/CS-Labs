/**
 * The Month class.
 * 
 * This program has one field, three constructors,
 * one mutator method, two accessor methods, a
 * toString method, an equals method, and two
 * comparison methods.
 *
 * @author (Caleb Long) 
 * @version (.1)
 */
public class Month
{
    private int monthNumber;
    
    /**
     * No-arg constructor for Month
     */
    public Month()
    {
        monthNumber = 1;
    }
    
    /**
     * @param monthNumber number corresponding to the month
     */
    public Month(int monthNumber)
    {
        if (monthNumber < 1 || monthNumber > 12)
        {
            setMonthNumber(1);
        }
        else
        {
            setMonthNumber(monthNumber);
        }
    }
    
    /**
     * @param monthName name of month
     */
    public Month(String monthName)
    {
        if (monthName == "January")
        {
            monthNumber = 1;
        }
        else if (monthName == "February")
        {
            monthNumber = 2;
        }
        else if (monthName == "March")
        {
            monthNumber = 3;
        }
        else if (monthName == "April")
        {
            monthNumber = 4;
        }
        else if (monthName == "May")
        {
            monthNumber = 5;
        }
        else if (monthName == "June")
        {
            monthNumber = 6;
        }
        else if (monthName == "July")
        {
            monthNumber = 7;
        }
        else if (monthName == "August")
        {
            monthNumber = 8;
        }
        else if (monthName == "September")
        {
            monthNumber = 9;
        }
        else if (monthName == "October")
        {
            monthNumber = 10;
        }
        else if (monthName == "November")
        {
            monthNumber = 11;
        }
        else if (monthName == "December")
        {
            monthNumber = 12;
        }
    }
    
    /**
     * @param monthNumber number corresponding to the month
     */
    public void setMonthNumber(int monthNumber)
    {
        if (monthNumber < 1 || monthNumber > 12)
        {
            this.monthNumber = 1;
        }
        else
        {
            this.monthNumber = monthNumber;
        }
    }
    
    /**
     * @return monthNumber
     */
    public int getMonthNumber()
    {
        return monthNumber;
    }
    
    /**
     * @return name of the month
     */
    public String getMonthName()
    {
        if (monthNumber == 1)
        {
            return "January";
        }
        else if (monthNumber == 2)
        {
            return "February";
        }
        else if (monthNumber == 3)
        {
            return "March";
        }
        else if (monthNumber == 4)
        {
            return "April";
        }
        else if (monthNumber == 5)
        {
            return "May";
        }
        else if (monthNumber == 6)
        {
            return "June";
        }
        else if (monthNumber == 7)
        {
            return "July";
        }
        else if (monthNumber == 8)
        {
            return "August";
        }
        else if (monthNumber == 9)
        {
            return "September";
        }
        else if (monthNumber == 10)
        {
            return "October";
        }
        else if (monthNumber == 11)
        {
            return "November";
        }
        else if (monthNumber == 12)
        {
            return "December";
        }
        else
        {
            return "";
        }
    }
    
    /**
     * @return str formatted output
     */
    public String toString()
    {
        String str = getMonthName();
        return str;
    }
    
    /**
     * determines if 2 months are equal
     * @return true or false
     */
    public boolean equals(Month m)
    {
        m = new Month(monthNumber);
        if (m.monthNumber == this.monthNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * determines if an argument month is less
     * @return true or false
     */
    public boolean greaterThan(Month m)
    {
        m = new Month(monthNumber);
        if (m.monthNumber < this.monthNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * determines if an argument month is more
     * @return true or false
     */
    public boolean lessThan(Month m)
    {
        m = new Month(monthNumber);
        if (m.monthNumber > this.monthNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
