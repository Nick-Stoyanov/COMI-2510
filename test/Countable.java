/**
 * This class demonstrates a static field.
 */
package test;

/**
 * This class demonstrates a static field.
 *
 * @author dean grammas (refactored from "Starting out with Java - Gaddis, Muganda")
 */

public class Countable
{
    /**
     * Static instance count
     */
    private static int instanceCount = 0;
    
    /**
     * The constructor increments the static field instanceCount. This keeps track of the number of instances of this class that are created.
     */
    
    public Countable()
    {
	Countable.instanceCount++;
    }
    
    /**
     * The getInstanceCount method returns the number of instances of this class that have been created.
     *
     * @return The value in the instanceCount field.
     */
    
    public int getInstanceCount()
    {
	return Countable.instanceCount;
    }
    
    @Override
    public String toString()
    {
	StringBuilder sb = new StringBuilder();
	
	sb.append(this.getClass());
	sb.append(" this.getInstanceCount()=").append(this.getInstanceCount());
	
	return sb.toString();
    }
}