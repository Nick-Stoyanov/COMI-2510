/**
 * Light bulb list
 */
package test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Light bulb list
 *
 * @author dean grammas
 *
 */
public class LightBulbList
{
    /**
     * Circle array
     */
    private LightBulb[] lightBulbArray;
    
    /**
     * Circle array list
     */
    private ArrayList<LightBulb> lightBulbArrayList;
    
    /**
     * Circle array sorted
     */
    private ArrayList<LightBulb> lightBulbArrayListSorted;
    
    /**
     * Constructor
     *
     * @param numberInList - the number in the list
     */
    public LightBulbList(int numberInList)
    {
	super();
	setLightBulbArray(createLightBulbArray(numberInList));
	setLightBulbArrayList(createLightBulbArrayList(numberInList));
	setLightBulbArrayListSorted(createLightBulbArrayListSorted());
    }
    
    /**
     * Creates and returns a list of &lt;LightBulb&gt; as an array
     *
     * @param numberInList - the number in the list
     * @return - the list of &lt;LightBulb&gt;
     */
    private LightBulb[] createLightBulbArray(int numberInList)
    {
	LightBulb list[] = new LightBulb[numberInList];
	
	for (int i = 0; i < numberInList; i++)
	{
	    list[i] = new LightBulb(true, i);
	}
	return list;
    }
    
    /**
     * Creates and returns a list of &lt;LightBulb&gt; as an ArrayList
     *
     * @param numberInList - the number in the list
     * @return - the list of &lt;LightBulb&gt;
     */
    private ArrayList<LightBulb> createLightBulbArrayList(int numberInList)
    {
	ArrayList<LightBulb> list = new ArrayList<LightBulb>();
	
	// adding 5 to the list, so that the array and array list are not the same size
	for (int i = (numberInList + 5); i > 0; i--)
	{
	    list.add(new LightBulb(false, i));
	}
	return list;
    }
    
    /**
     * Creates and returns a list of &lt;LightBulb&gt; as an ArrayList
     *
     * @return - the list of &lt;LightBulb&gt;
     */
    private ArrayList<LightBulb> createLightBulbArrayListSorted()
    {
	ArrayList<LightBulb> list = new ArrayList<LightBulb>();
	
	// add the array list
	for (int i = 0; i < this.getLightBulbArrayList().size(); i++)
	{
	    list.add(this.getLightBulbArrayList().get(i));
	}
	
	// add the array
	for (int i = 0; i < this.getLightBulbArray().length; i++)
	{
	    list.add(this.getLightBulbArray()[i]);
	}
	
	return sortList(list);
    }
    
    /**
     * Get light bulb array
     *
     * @return the lightBulbArray
     */
    private LightBulb[] getLightBulbArray()
    {
	return this.lightBulbArray;
    }
    
    /**
     * Get light bulb array list
     *
     * @return the lightBulbArrayList
     */
    private ArrayList<LightBulb> getLightBulbArrayList()
    {
	return this.lightBulbArrayList;
    }
    
    /**
     * Get sorted light bulb array list
     *
     * @return the lightBulbArrayListSorted
     */
    private ArrayList<LightBulb> getLightBulbArrayListSorted()
    {
	return this.lightBulbArrayListSorted;
    }
    
    /**
     * Get the light bulb metrics. Metrics are calculated on demand. This way if the underlying details change this information is always accurate.
     *
     * @return the light bulb metrics.
     */
    public LightBulbListMetrics getListCounts()
    {
	LightBulbListMetrics lbm = new LightBulbListMetrics();
	lbm.setNumberArray(this.getLightBulbArray().length);
	lbm.setNumberArrayList(this.getLightBulbArrayList().size());
	lbm.setNumberArrayListSorted(this.getLightBulbArrayListSorted().size());
	return lbm;
    }
    
    /**
     * Get the light bulb total watts metrics. Metrics are calculated on demand. This way if the underlying details change this information is always accurate.
     *
     * @return the light bulb total watts metrics.
     */
    public LightBulbListMetrics getTotalWatts()
    {
	LightBulbListMetrics lbm = new LightBulbListMetrics();
	int total = 0;
	for(LightBulb element : this.getLightBulbArray())
	{
	    total += element.getWatts();
	}
	for(LightBulb element : this.getLightBulbArrayList())
	{
	    total += element.getWatts();
	}
	for(LightBulb element : this.getLightBulbArrayListSorted())
	{
	    total += element.getWatts();
	}
	
	lbm.setTotalWatts(total);
	return lbm;
    }
    
    /**
     * Get the light bulb total watts metrics. Metrics are calculated on demand. This way if the underlying details change this information is always accurate.
     *
     * @return the light bulb total watts metrics.
     */
    public LightBulbListMetrics getTotalOnAndOff()
    {
	LightBulbListMetrics lbm = new LightBulbListMetrics();
	int totalOn = 0;
	int totalOff = 0;
	for(LightBulb element : this.getLightBulbArray())
	{
	    if(element.isLightOn() )
	    {
		totalOn ++;
	    }
	    else
	    {
		totalOff ++;
	    }
	}
	for(LightBulb element : this.getLightBulbArrayList())
	{
	    if(element.isLightOn() )
	    {
		totalOn ++;
	    }
	    else
	    {
		totalOff ++;
	    }
	}
	for(LightBulb element : this.getLightBulbArrayListSorted())
	{
	    if(element.isLightOn() )
	    {
		totalOn ++;
	    }
	    else
	    {
		totalOff ++;
	    }
	}
	
	lbm.setTotalNumberOn(totalOn);
	lbm.setTotalNumberOff(totalOff);
	return lbm;
    }
    
    /**
     * Set light bulb array
     *
     * @param lightBulbArray the lightBulbArray to set
     */
    private void setLightBulbArray(LightBulb[] lightBulbArray)
    {
	this.lightBulbArray = lightBulbArray;
    }
    
    /**
     * Set light bulb array list
     *
     * @param lightBulbArrayList the lightBulbArrayList to set
     */
    private void setLightBulbArrayList(ArrayList<LightBulb> lightBulbArrayList)
    {
	this.lightBulbArrayList = lightBulbArrayList;
    }
    
    /**
     * Set sorted light bulb array list
     *
     * @param lightBulbArrayListSorted the lightBulbArrayListSorted to set
     */
    private void setLightBulbArrayListSorted(ArrayList<LightBulb> lightBulbArrayListSorted)
    {
	this.lightBulbArrayListSorted = lightBulbArrayListSorted;
    }
    
    /**
     * Sorts the array list of light bulbs
     *
     * @param list the array list of light bulbs to sort
     * @return sorted array list of light bulbs
     */
    private ArrayList<LightBulb> sortList(ArrayList<LightBulb> list)
    {
	// sort the sorted list
	Collections.sort(list);
	return list;
    }
    
    /**
     * String representation of the object
     * @return string representation of the object
     */
    public String toString()
    {
	StringBuilder sb = new StringBuilder();
	sb.append("this.getLightBulbArray()");
	sb.append("\n");

	// loop to add the array elements
	for(int i=0; i<this.getLightBulbArray().length; i++)
	{
	    sb.append(this.getLightBulbArray()[i]);
	}
	sb.append("\n");

	// no need to loop with array list
	sb.append("this.getLightBulbArrayList()").append(this.getLightBulbArrayList().toString()).append("\n");
	sb.append("this.getLightBulbArrayListSorted()").append(this.getLightBulbArrayListSorted().toString()).append("\n");
	
	return sb.toString();
    }
}
