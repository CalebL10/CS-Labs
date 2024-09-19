/**
 * Pilot.java
 * 
 */


//Put any imports below this line.
 
 
/**
 * Short, one-line description of Pilot class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pilot
{
    //Put instance variables below this line.  
    private String name;
    private String license;
    
    /**
     * No parameter constructor for objects of class Pilot.
     */
    public Pilot()
    {
        name = "";
        license = "";
    }
    
    /**
     * Base constructor for Pilot class.
     * @param name Name of pilot.
     * @param license License of pilot.
     */
    public Pilot(String name, String license)
    {
        setName(name);
        setLicense(license);
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
     * @return license license
     */
    public String getLicense()
    {
        return license;
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
     * @param license license
     */
    public void setLicense(String license)
    {
        if (license == null)
        {
            license = "";
        }
        this.license = license;
    }
    
    /**
     * Copy method.
     * @return Pilot copy
     */
    public Pilot copy()
    {
        return new Pilot(name, license);
    }
    
    /**
     * toString method.
     * @return str formatted output
     */
    public String toString()
    {
        String str = "Name: " + name + " - " 
            + "License: " + license;
        return str;
    }
    
    /**
     * equals method.
     * @return true or false
     * @param pilot object being compared
     */
    public boolean equals(Pilot pilot)
    {
        if (name.equals(pilot.name) && license.equals(pilot.license))
        {
            return true;
        }
        return false;
    }
}
