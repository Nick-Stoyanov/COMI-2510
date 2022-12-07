/**
 * Static helper methods for the <code>Stock</code> object.
 */
package test;

/**
 * This class provides static helper methods for the <code>Stock</code> object.
 *
 * @author dean grammas
 *
 */
public class StockHelper
{
    /**
     * Returns the value of the stock.
     *
     * @param sharePrice   the share price
     * @param numberShares number of shares
     * @return the value of the stock.
     */
    public static double getStockValue(double sharePrice, double numberShares)
    {
	return (sharePrice * numberShares);
    }
    
    /**
     * Returns the value of the stock.
     *
     * @param stock the stock
     * @return the value of the stock.
     */
    public static double getStockValue(Stock stock)
    {
	return StockHelper.getStockValue(stock.getSharePrice(), stock.getNumberShares());
    }
    
    /**
     * Default constructor
     */
    public StockHelper()
    {
	super();
    }
}
