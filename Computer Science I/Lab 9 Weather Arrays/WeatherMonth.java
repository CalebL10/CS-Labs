import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

/**
 * Write a description of class WeatherMonth here.
 *
 * @author (Caleb Long)
 * @version (11/21/22)
 */
public class WeatherMonth
{
    private int[] maxTemperature;
    private int[] minTemperature;
    private String monthName;
    private int daysInMonth;
    
    /**
     * Constructor for weatherMonth.
     */
    public WeatherMonth()
    {
        monthName = "January";
        daysInMonth = 31;
        maxTemperature = new int[daysInMonth];
        maxTemperature[0] = -999;
        minTemperature = new int[daysInMonth];
        minTemperature[0] = -999;
        Arrays.fill(maxTemperature, -999);
        Arrays.fill(minTemperature, -999);
    }
    
    /**
     * @param monthName monthName
     * @param daysInMonth daysInMonth
     */
    public WeatherMonth(String monthName, int daysInMonth)
    {
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        maxTemperature = new int[daysInMonth];
        maxTemperature[0] = -999;
        minTemperature = new int[daysInMonth];
        minTemperature[0] = -999;
        Arrays.fill(maxTemperature, -999);
        Arrays.fill(minTemperature, -999);
    }

    /**
     * @param dayOfMonth dayOfMonth
     * @param temperature temperature
     */
    public void setDayMaxTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth < 1 && dayOfMonth > daysInMonth)
        {
            temperature = temperature;
        }
        else if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            maxTemperature[dayOfMonth - 1] = temperature; 
        }
        
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            maxTemperature[dayOfMonth - 1] = temperature; 
        }
    }
    
    /**
     * @param dayOfMonth dayOfMonth
     * @param temperature temperature
     */
    public void setDayMinTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth < 1 && dayOfMonth > daysInMonth)
        {
            temperature = temperature;
        }
        else if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            minTemperature[dayOfMonth - 1] = temperature; 
        }
        
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            minTemperature[dayOfMonth - 1] = temperature; 
        }
    }
    
    /**
     * Displays weather month.
     */
    public void displayWeatherMonth()
    {
        System.out.println(monthName);
        System.out.println("Day\tMax\tMin");
        for (int day = 1; day <= daysInMonth; day++)
        {
            String str = String.format("%d\t%s\t%s\n", 
                day, maxTemperature[day - 1], minTemperature[day - 1]);
            System.out.print(str);
        }
    }
    
    /**
     * @param filename filename
     * @throws IOException IOException
     */
    public void readMaxTempFile(String filename) throws IOException
    {
        File maxTemp = new File(filename);
        Scanner fileReader = new Scanner(maxTemp);
        while (fileReader.hasNextInt())
        {
            setDayMaxTemp(fileReader.nextInt(), fileReader.nextInt());
        }
    }
    
    /**
     * @param filename filename
     * @throws IOException IOException
     */
    public void readMinTempFile(String filename) throws IOException
    {
        File minTemp = new File(filename);
        Scanner fileReader = new Scanner(minTemp);
        while (fileReader.hasNextInt())
        {
            setDayMinTemp(fileReader.nextInt(), fileReader.nextInt());
        }
    }
    
    /**
     * @return String
     */
    public String toString()
    { 
        String str = String.format("%s\n", monthName);
        str += String.format("%3s%9s%10s\n", "Day", "Max", "Min");
        for (int day = 1; day <= daysInMonth; day++)
        {
            if (maxTemperature[day - 1] == -999)
            {
                str += String.format("%2d%10s",
                    day, "N/A");
            }
            else
            {
                str += String.format("%2d%10d",
                    day, maxTemperature[day - 1]);
            }
            
            if (minTemperature[day - 1] == -999)
            {
                str += String.format("%10s\n",
                    "N/A");
            }
            else
            {
                str += String.format("%10s\n", 
                    minTemperature[day - 1]);
            }
        }
        return str;
    }
    
    /**
     * @return maxTemperature maxTemperature
     */
    public int[] getMaxTemperature()
    {
        return maxTemperature;
    }
    
    /**
     * @return minTemperature  minTemperature
     */
    public int[] getMinTemperature()
    {
        return minTemperature;
    }
    
    /**
     * @return monthName monthName
     */
    public String getMonthName()
    {
        return monthName;
    }
    
    /**
     * @return daysInMonth days
     */
    public int getDaysInMonth()
    {
        return daysInMonth;
    }
    
    /**
     * @param maxTemperature maxTemperature
     */
    public void setMaxTemperature(int[] maxTemperature)
    {
        this.maxTemperature = maxTemperature;
    }
    
    /**
     * @param minTemperature minTemperature
     */
    public void setMinTemperature(int[] minTemperature)
    {
        this.minTemperature = minTemperature;
    }
    
    /**
     * @param monthName monthName
     */
    public void setMonthName(String monthName)
    {
        this.monthName = monthName;
    }
    
    /**
     * @param daysInMonth daysInMonth
     */
    public void setDaysInMonth(int daysInMonth)
    {
        this.daysInMonth = daysInMonth;
    }
}
