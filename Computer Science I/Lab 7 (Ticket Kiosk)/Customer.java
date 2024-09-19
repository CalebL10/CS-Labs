/**
 * Customer.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of Customer class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (Caleb Long) 
 * @version (.01)
 */
public class Customer
{
    //Put instance variables below this line.  
    private String name;
    private String ssn;
    
    /**
     * No parameter constructor for objects of class Customer.
     */
    public Customer()
    {
        name = "";
        ssn = "";
    }
    
    /**
     * Constructor.
     * @param name of customer
     * @param ssn of customer
     */
    public Customer(String name, String ssn)
    {
        setName(name);
        setSsn(ssn);
    }
    
    /**
     * Copy Constructor.
     * @param customer new customer
     */
    public Customer(Customer customer)
    {
        name = customer.name;
        ssn = customer.ssn;
    }
    
    /**
     * Accessor.
     * @return name name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Accessor.
     * @return ssn ssn
     */
    public String getSsn()
    {
        return ssn;
    }
    
    /**
     * Mutator.
     * @param name name
     */
    public void setName(String name)
    {
        if (name == null)
        {
            name = "";
        }
        this.name = name;
    }
    
    /**
     * Mutator.
     * @param ssn ssn
     */
    public void setSsn(String ssn)
    {
        if (ssn == null)
        {
            ssn = "";
        }
        this.ssn = ssn;
    }
    
    /**
     * toString method.
     * @return str formatted output
     */
    public String toString()
    {
        String str = "Name: " + name 
            + " - SSN: " + ssn;
        return str;
    }
}
