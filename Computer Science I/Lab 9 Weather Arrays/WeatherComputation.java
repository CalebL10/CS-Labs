/**
 * WeatherComputation.java
 */

//Put any imports below this line.
 
/**
 * Static methods library which compute averages and other
 * computations on integer arrays of temperatures.
 * 
 * @author Joel Swanson 
 * @version 03.29.2014
 */
public class WeatherComputation
{    
    /**
     * Average an array of temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return Returns the average of the array of ints.
     */
    public static double averageTemperature(int[] temperatures)
    {   
        double average;
        double temperaturesSum = 0;
        for (int index = 0; index < temperatures.length; index++)
        {
            if (temperatures[index] == -999)
            {
                ;
            }
            else
            {
                temperaturesSum += temperatures[index];
            }
        }
        average = temperaturesSum / (temperatures.length - 
            numberMissing(temperatures));
        return average;
    }
    
    /**
     * Find the highest in an array of temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return The largest value from the the array of ints.
     */
    public static int highestTemperature(int[] temperatures)
    {      
        int max = -999; 
        for (int index = 0; index < temperatures.length; index++)
        {
            if (temperatures[index] > max && temperatures[index] != -999)
            {
                max = temperatures[index];
            }
        }
        return max;
    }  
    
    /**
     * Find the lowest in an array of temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return The lowest value from the the array of ints.
     */
    public static int lowestTemperature(int[] temperatures)
    {
        int min = 999; 
        for (int index = 0; index < temperatures.length; index++)
        {
            if (temperatures[index] < min && temperatures[index] != -999)
            {
                min = temperatures[index];
            }
        }
        return min;
    }    
    
    /**
     * Return the total number of missing days.  That is days with
     * -999 recorded as the temperatures.
     * @param temperatures An array storing temperatures as ints.
     * @return The number of -999s found.
     */
    public static int numberMissing(int[] temperatures)
    {       
        int count = 0; 
        for (int index = 0; index < temperatures.length; index++)
        {
            if (temperatures[index] == -999)
            {
                count++;
            }
            else
            {
                ;
            }
        }
        return count;
    } 
    
    /**
     * Calculate heating degree day.
     * @param max The highest temperature for a given day.
     * @param min The lowest temperature for a given day.
     * @return heating degree day data for this day.
     */
    public static double hdd(int max, int min)
    {
        double hdd = 0.0;
        double tAverage = ((double) max + (double) min) / 2;
        if (tAverage < 65.0)
        {
            hdd = 65.0 - tAverage;
        }
        else if (tAverage > 65.0)
        {
            hdd = 0.0;
        }
        else if (tAverage == 65.0)
        {
            hdd = 0.0;
        }
        
        if (max == -999 || min == -999)
        {
            hdd = 0.0;
        }
        else if (max < min)
        {
            hdd = 0.0;
        }

        return hdd;
    }
    
    /**
     * Calculate cooling degree day.
     * @param max The highest temperature for a given day.
     * @param min The lowest temperature for a given day.
     * @return cooling degree day data for this day.
     */
    public static double cdd(int max, int min)
    {
        double cdd = 0.0;
        double tAverage = ((double) max + (double) min) / 2;
        if (tAverage < 65.0)
        {
            cdd = 0.0;
        }
        else if (tAverage > 65.0)
        {
            cdd = tAverage - 65.0;
        }
        else if (tAverage == 65.0)
        {
            cdd = 0.0;
        }
        
        if (max == -999 || min == -999)
        {
            cdd = 0.0;
        }
        else if (max < min)
        {
            cdd = 0.0;
        }
        
        return cdd;
    }    
    
    /**
     * Sum monthly heating degree days.
     * @param max An array with the highest temperatures for each day
     * in a given month.
     * @param min An array with the lowest temperatures for each day
     * in a given month.
     * @return The sum of the heating degree days.
     */
    public static double monthHdd(int[] max, int[] min)
    {
        double sum = 0.0;
        
        for (int index = 0; index < max.length && index < min.length; index++)
        {
            sum += hdd(max[index], min[index]);
        }

        return sum;        
    }
    
    /**
     * Sum monthly cooling degree days.
     * @param max An array with the highest temperatures for each day
     * in a given month.
     * @param min An array with the lowest temperatures for each day
     * in a given month.
     * @return The sum of the cooling degree days.
     */
    public static double monthCdd(int[] max, int[] min)
    {
        double sum = 0.0;
        
        for (int index = 0; index < max.length && index < min.length; index++)
        {
            sum += cdd(max[index], min[index]);
        }
        
        return sum;
    }     
}
