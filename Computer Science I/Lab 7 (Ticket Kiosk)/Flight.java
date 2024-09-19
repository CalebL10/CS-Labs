/**
 * Flight.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of Flight class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (Caleb Long) 
 * @version (.01)
 */
public class Flight
{
    //Put instance variables below this line.  
    private int flightNumber;
    private String destination;
    private Pilot pilot;
    private String date;
    
    /**
     * No parameter constructor for objects of class Flight.
     */
    public Flight()
    {
        flightNumber = 0;
        destination = "";
        pilot = new Pilot();
        date = "";
    }
    
    /**
     * Constructor.
     * @param flightNumber flightNumber
     * @param destination destination
     * @param pilot Pilot manning flight
     * @param date date of flight
     */
    public Flight(int flightNumber, String destination, 
        Pilot pilot, String date)
    {
        setFlightNumber(flightNumber);
        setDestination(destination);
        setPilot(pilot);
        setDate(date);
    }
    
    /**
     * Accessor.
     * @return flightNumber flightNumber
     */
    public int getFlightNumber()
    {
        return flightNumber;
    }

    /**
     * Accessor.
     * @return destination destination
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Accessor.
     * @return pilot pilot
     */
    public Pilot getPilot()
    {
        return pilot.copy();
    }
    
    /**
     * Accessor.
     * @return date date
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Mutator.
     * @param flightNumber flightNumber
     */
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    
    /**
     * Mutator.
     * @param destination destination
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    /**
     * Mutator.
     * @param pilot pilot
     */
    public void setPilot(Pilot pilot)
    {
        this.pilot = pilot.copy();
    }
    
    /**
     * Mutator.
     * @param date date
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    
    /**
     * toString method.
     * @return str formatted output
     */
    public String toString()
    {
        String str = "Flt#: " + getFlightNumber() + "\tDest: " 
            + getDestination() + "\tPlt: " + pilot.getName() 
            + "\tDate: " + getDate();
        return str;
    }
    
    /**
     * Copy method.
     * @return Flight copy
     */
    public Flight copy()
    {
        return new Flight(flightNumber, destination, pilot, date);
    }
    
}
