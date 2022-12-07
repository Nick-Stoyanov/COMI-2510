/**
 * Test Data for Stock object
 */
package test;


/**
 * Test Data for Stock object
 *
 * @author dean grammas
 *
 */
public class StockTestData
{
    /**
     * Number of Shares
     */
    public final static double NUM_SHARES = 10;
    /**
     * Stock price
     */
    public final static double STOCK_PRICE = 9.62;
    /**
     * Symbol
     */
    public final static String SYMBOL = "XYZ";
    
    /**
     * Stock object
     */
    private Stock stock;
    
    /**
     * Constructor
     */
    public StockTestData()
    {
	super();
	
	Stock companyStock = new Stock(StockTestData.SYMBOL, StockTestData.STOCK_PRICE, StockTestData.NUM_SHARES);
	this.setStock(companyStock);
    }
    
    /**
     * Returns the stock
     *
     * @return the stock
     */
    public Stock getStock()
    {
	return this.stock;
    }
    
    /**
     * Returns the value of the stock.
     *
     * @return the value of the stock.
     */
    public double getStockValue()
    {
	return StockHelper.getStockValue(this.getStock());
    }
    
    /**
     * Sets the stock
     *
     * @param stock the stock to set
     */
    public void setStock(Stock stock)
    {
	this.stock = stock;
    }
    
}
