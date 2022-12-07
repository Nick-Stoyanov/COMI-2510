/**
 * This program demonstrates the Stock class's toString method.package edu.ccri.lesson01.example;
 */
package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * This program demonstrates the Stock class's toString method.
 *
 * @author dean grammas (refactored from "Starting out with Java - Gaddis, Muganda")
 */

public class StockTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(StockTest.class.getName());
    
    /**
     * Tests using <code>Stock</code>
     *
     * @return Stock object
     */
    private static Stock basicTest()
    {
	Stock companyStock = new Stock(StockTestData.SYMBOL, StockTestData.STOCK_PRICE, StockTestData.NUM_SHARES);
	
	// Display the object's values.
	logger.debug(companyStock.toString());
	return companyStock;
    }
    
    /**
     * Tests using <code>StockTestData</code>
     *
     * @return Stock object
     */
    private static Stock dataTest()
    {
	StockTestData stockTestData = new StockTestData();
	
	// Display the object's values.
	logger.debug(stockTestData.getStock().toString());
	return stockTestData.getStock();
    }
    
    /**
     * Main test method
     *
     * @param args ignored
     */
    public static void main(String[] args)
    {
	Stock stock1 = basicTest();
	Stock stock2 = dataTest();
	
	// note that the instance count is not unique, it is just the number of class instances created
	logger.debug(stock1.toString());
	logger.debug(stock2.toString());
	
    }
    
    /**
     * Default constructor
     */
    public StockTest()
    {
	super();
    }
}