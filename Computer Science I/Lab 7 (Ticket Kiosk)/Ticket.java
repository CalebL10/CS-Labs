/**
 * Ticket.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of Ticket class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (Caleb Long) 
 * @version (.01)
 */
public class Ticket
{
    //Put instance variables below this line.  
    private Customer customer;
    private Flight flight;
    
    /**
     * No parameter constructor for objects of class Ticket.
     */
    public Ticket()
    {
        customer = new Customer();
        flight = new Flight();
    }
    
    /**
     * Constructor.
     * @param customer getting ticket
     * @param flight for ticket
     */
    public Ticket(Customer customer, Flight flight)
    {
        setCustomer(new Customer(customer));
        setFlight(flight.copy());
    }
    
    /**
     * Accessor.
     * @return customer customer
     */
    public Customer getCustomer()
    {
        return new Customer(customer);
    }
    
    /**
     * Accessor.
     * @return flight flight
     */
    public Flight getFlight()
    {
        return flight.copy();
    }
    
    /**
     * Mutator.
     * @param customer customer
     */
    public void setCustomer(Customer customer)
    {
        if (customer == null)
        {
            customer = new Customer();
        }
        this.customer = new Customer(customer);
    }
    
    /**
     * Mutator.
     * @param flight flight
     */
    public void setFlight(Flight flight)
    {
        if (flight == null)
        {
            flight = new Flight();
        }
        this.flight = flight.copy();
    }

    /**
     * toString method.
     * @return str formatted output
     */
    public String toString()
    {
        String str = "******** TICKET ********\n"
            + "* Name: " + customer.getName() + "\n"
            + "* SSN: " + customer.getSsn() + "\n"
            + "* Flight: " + flight.getFlightNumber() + "\n"
            + "* Date: " + flight.getDate() + "\n"
            + "* Destination: " + flight.getDestination() + "\n"
            + "************************";
        return str;
    }
}
