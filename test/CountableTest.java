/**
 * This program demonstrates the Countable class.
 */
package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This program demonstrates the Countable class.
 *
 * @author dean grammas (refactored from "Starting out with Java - Gaddis, Muganda")
 */

public class CountableTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(CountableTest.class.getName());
    
    /**
     * Main test method
     *
     * @param args ignored
     */
    public static void main(String[] args)
    {
	int objectCount;
	
	// Create three instances of the
	// Countable class.
	Countable object1 = new Countable();
	logger.debug("object1=" + object1.toString());
	
	Countable object2 = new Countable();
	logger.debug("object2=" + object2.toString());
	
	Countable object3 = new Countable();
	logger.debug("object3=" + object3.toString());
	
	// Get the number of instances from
	// the class's static field.
	objectCount = object1.getInstanceCount();
	logger.debug(objectCount + " instances of the class " + "were created.");
	logger.debug("object1=" + object1.toString());
	logger.debug("object2=" + object2.toString());
	logger.debug("object3=" + object3.toString());
    }
    
    /**
     * Default constructor
     */
    public CountableTest()
    {
	super();
    }
}
