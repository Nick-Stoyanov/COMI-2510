/**
 * Light bulb metrics
 */
package test;

/**
 * Light bulb metrics
 *
 * @author dean grammas
 */
public class LightBulbListMetrics
{
    /**
     * Number of light bulbs in the array
     */
    private int numberArray;
    /**
     * Number of light bulbs in the array list
     */
    private int numberArrayList;
    /**
     * Number of light bulbs in the sorted list
     */
    private int numberArrayListSorted;
    
    /**
     * Total number off
     */
    private int totalNumberOff;
    
    /**
     * Total number on
     */
    private int totalNumberOn;
    
    /**
     * Total amount of watts
     */
    private int totalWatts;
    
    /**
     * Default constructor
     */
    public LightBulbListMetrics()
    {
	super();
    }
    
    /**
     * Get number of array items
     *
     * @return the numberArray
     */
    public int getNumberArray()
    {
	return this.numberArray;
    }
    
    /**
     * Get number of array list items
     *
     * @return the numberArrayList
     */
    public int getNumberArrayList()
    {
	return this.numberArrayList;
    }
    
    /**
     * Get number of sorted array list items
     *
     * @return the numberArrayListSorted
     */
    public int getNumberArrayListSorted()
    {
	return this.numberArrayListSorted;
    }
    
    /**
     * Get total number off
     *
     * @return the totalNumberOff
     */
    public int getTotalNumberOff()
    {
	return this.totalNumberOff;
    }
    
    /**
     * Get total number on
     *
     * @return the totalNumberOn
     */
    public int getTotalNumberOn()
    {
	return this.totalNumberOn;
    }
    
    /**
     * Get total watts
     *
     * @return the totalWatts
     */
    public int getTotalWatts()
    {
	return this.totalWatts;
    }
    
    /**
     * Set number of array items
     *
     * @param numberArray the numberArray to set
     */
    protected void setNumberArray(int numberArray)
    {
	this.numberArray = numberArray;
    }
    
    /**
     * Set number of array list items
     *
     * @param numberArrayList the numberArrayList to set
     */
    protected void setNumberArrayList(int numberArrayList)
    {
	this.numberArrayList = numberArrayList;
    }
    
    /**
     * Set number of sorted array list items
     *
     * @param numberArrayListSorted the numberArrayListSorted to set
     */
    protected void setNumberArrayListSorted(int numberArrayListSorted)
    {
	this.numberArrayListSorted = numberArrayListSorted;
    }
    
    /**
     * Set total number off
     *
     * @param totalNumberOff the totalNumberOff to set
     */
    protected void setTotalNumberOff(int totalNumberOff)
    {
	this.totalNumberOff = totalNumberOff;
    }
    
    /**
     * Set total number on
     *
     * @param totalNumberOn the totalNumberOn to set
     */
    protected void setTotalNumberOn(int totalNumberOn)
    {
	this.totalNumberOn = totalNumberOn;
    }
    
    /**
     * Set total watts
     *
     * @param totalWatts the totalWatts to set
     */
    protected void setTotalWatts(int totalWatts)
    {
	this.totalWatts = totalWatts;
    }
    
    /**
     * Returns an unserialized representation of this object as a <code>java.lang.String</code>.
     *
     * @return The unserilized representation of this object as a <code>java.lang.String</code>.
     */
    @Override
    public String toString()
    {
	StringBuilder sb = new StringBuilder();
	sb.append(" this.getNumberArray() = ").append(this.getNumberArray());
	sb.append(" this.getNumberArrayList() = ").append(this.getNumberArrayList());
	sb.append(" this.getNumberArrayListSorted() = ").append(this.getNumberArrayListSorted());
	sb.append(" this.getTotalWatts() = ").append(this.getTotalWatts());
	sb.append(" this.getTotalNumberOn() = ").append(this.getTotalNumberOn());
	sb.append(" this.getTotalNumberOff() = ").append(this.getTotalNumberOff());
	
	return (sb.toString());
    } // end toString
    
}
