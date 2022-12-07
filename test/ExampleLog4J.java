
/**
 * Example Log4J
 */
package test;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Example Log4J
 *
 * @author dean grammas
 *
 */
public class ExampleLog4J
{

    /** Get the class name to be printed on */
    private static final Logger logger = LogManager.getLogger(ExampleLog4J.class.getName());

    // static Logger log = logger.getLogger(ExampleLog4J.class.getName());
    // private static final Logger log = LogManager.getLogger();

    /**
     * Main method
     *
     * @param args - ignored
     * @throws IOException  - thrown if Log4J file cannot be written
     * @throws SQLException - thrown if problem with exception
     */
    public static void main(String[] args) throws IOException, SQLException
    {

	logger.trace("Hello this is a TRACE message.");
	logger.debug("Hello this is a DEBUG message.");
	logger.info("Hello this is an INFO message.");
	logger.warn("Hello this is an WARN message.");
	logger.error("Hello this is an ERROR message.");
	logger.fatal("Hello this is an FATAL message.");

	logger.fatal("________________________________");

    } // end main
} // end class