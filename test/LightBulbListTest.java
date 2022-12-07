/**
 * Light bulb list test
 */
package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Light bulb list test
 *
 * @author dean grammas
 *
 */
public class LightBulbListTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(LightBulbListTest.class.getName());
    
    /**
     * Main method
     *
     * @param args - test for arguments
     */
    public static void main(String[] args)
    {
	StringBuilder sb = new StringBuilder();
	LightBulbList lightBulbList = null;
	LightBulbListMetrics lbm = null;
	
	// test if any arguments were passed
	sb.append(testRunConfigArgs(args));
	logger.debug(sb.toString());
	
	for (int i = 5; i <= 100; i *= 5)
	{
	    sb.setLength(0);
	    lightBulbList = new LightBulbList(i);
	    
	    // this debug can be dangerous if the list is very long!
	    sb.append("\n");
	    logger.debug(lightBulbList.toString());
	    logger.debug("\n");
	    
	    // Get the light bulb metrics. Metrics are calculated on demand. This way if the underlying details change
	    // this information is always accurate.
	    lbm = lightBulbList.getListCounts();
	    logger.debug(lbm.toString());
	    sb.append("num array=").append(lbm.getNumberArray()).append("\n");
	    sb.append("num array list=").append(lbm.getNumberArrayList()).append("\n");
	    sb.append("num array list sorted=").append(lbm.getNumberArrayListSorted()).append("\n");
	    
	    // Get the light bulb total watss metrics. Metrics are calculated on demand. This way if the underlying details change
	    // this information is always accurate.
	    lbm = lightBulbList.getTotalWatts();
	    logger.debug(lbm.toString());
	    sb.append("total watts=").append(lbm.getTotalWatts()).append("\n");
	    
	    // Get the light bulb total on and total off metrics. Metrics are calculated on demand. This way if the underlying details change
	    // this information is always accurate.
	    lbm = lightBulbList.getTotalOnAndOff();
	    logger.debug(lbm.toString());
	    sb.append("total on=").append(lbm.getTotalNumberOn()).append("\n");
	    sb.append("total off=").append(lbm.getTotalNumberOff()).append("\n");
	    
	    logger.debug(sb.toString());
	}
	logger.debug("Have a nice day!");
    }
    
    /**
     * Tests the run configuration arguments
     *
     * @param args - run configuration arguments
     * @return the results of the test
     */
    private static String testRunConfigArgs(String[] args)
    {
	StringBuilder sb = new StringBuilder();
	
	// look for any run configuration arguments
	sb.append("Welcome to LightBulbListTest.java!");
	if (args.length == 0)
	{
	    sb.append(" No arguments were passed.\n");
	} else
	{
	    sb.append("args ");
	    for (int i = 0; i < args.length; i++)
	    {
		sb.append(args[i]).append(" ");
	    }
	}
	return sb.toString();
    }
    
    /**
     * Default constructor
     */
    public LightBulbListTest()
    {
	super();
    }
}
