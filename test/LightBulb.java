/**
 * Simple light bulb class
 */
package test;

/**
 * Simple light bulb class
 *
 * @author dean grammas
 *
 */
public class LightBulb implements AutoCloseable, Comparable<Object>
{
    /**
     * True if switch is on
     */
    private boolean isLightOn;
    
    /**
     * light bulb watts
     */
    private int watts;
    
    /**
     * Constructor
     *
     * @param isLightOn - true if lights are on
     * @param watts     - number of watts
     */
    public LightBulb(boolean isLightOn, int watts)
    {
	super();
	this.setLightOn(isLightOn);
	this.setWatts(watts);
    }
    
    /**
     * Turns out finalize() has been deprecated. Who knew?<BR>
     * This link describes the problem and also the solution implemented with AutoCloseable and the close method<BR>
     * <a href="https://www.baeldung.com/java-finalize">https://www.baeldung.com/java-finalize</a>
     */
    public void close()
    {
	this.setLightOn(false);
	this.setWatts(0);
	
	System.out.println("LightBulb.close" + this.toString());
    }
    
    /**
     * Comparable interface
     *
     * @param other - the other object
     * @return a negative integer, zero, or a positive integer as this objectis less than, equal to, or greater than the specified object.
     */
    public int compareTo(Object other)
    {
	// test if they are equal
	if (this.equals(other))
	{
	    return 0;
	}
	
	// test is the this watts are less than the other watts
	// test if this lights are off and other are on
	if (this.isLightOff() && ((LightBulb) other).isLightOn())
	{
	    if (this.getWatts() < ((LightBulb) other).getWatts())
	    {
		return -1;
	    }
	} else if (this.getWatts() < ((LightBulb) other).getWatts())
	{
	    return -1;
	}
	
	return 1;
    }
    
    /**
     * Returns true if they are equal
     *
     * @param other - the other object to compare
     */
    @Override
    public boolean equals(Object other)
    {
	// test that an object was passed
	
	// test that the object is the correct type
	
	// alternate way to test if the object is the correct type
	// this extra test prevents a typo in the prior test
	// test is the watts are the same
	if ((other == null) || !(other instanceof LightBulb) || (this.getClass() != other.getClass())
		|| (this.getWatts() != ((LightBulb) other).getWatts()))
	{
	    return false;
	}
	
	// test if they are both on
	if (this.isLightOn() != ((LightBulb) other).isLightOn())
	{
	    return false;
	}
	return true;
    }
    
    /**
     * Gets watts
     *
     * @return the watts
     */
    public int getWatts()
    {
	return this.watts;
    }
    
    /**
     * True if light is off
     *
     * @return the true if the light is off
     */
    public boolean isLightOff()
    {
	return !this.isLightOn();
    }
    
    /**
     * True if lights are on
     *
     * @return the isLightOn
     */
    public boolean isLightOn()
    {
	return this.isLightOn;
    }
    
    /**
     * Set to true if light is on
     *
     * @param isLightOn the isLightOn to set
     */
    public void setLightOn(boolean isLightOn)
    {
	this.isLightOn = isLightOn;
    }
    
    /**
     * Sets wats
     *
     * @param watts the watts to set
     */
    private void setWatts(int watts)
    {
	this.watts = watts;
    }
    
    /**
     * Return the object as a string
     *
     * @return the object as a string
     */
    @Override
    public String toString()
    {
	StringBuilder sb = new StringBuilder();
	sb.append("this.getWatts()").append(this.getWatts()).append("\t");
	sb.append("this.isLightOn()").append(this.isLightOn()).append("\n");
	return sb.toString();
    }
}
