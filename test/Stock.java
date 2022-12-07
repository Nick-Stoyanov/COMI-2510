/**
 * The Stock class holds data about a stock.
 */
package test;



/**
 * The Stock class holds data about a stock.
 *
 * @author dean grammas (refactored from "Starting out with Java - Gaddis, Muganda")
 */

public class Stock
{
    /**
     * Countable object
     */
    private Countable countable;
    
    /**
     * The number of shares.
     */
    private double numberShares;
    /**
     * Current price per share
     */
    private double sharePrice;
    /**
     * Trading symbol of stoc
     */
    private String symbol;
    
    /**
     * Constructor
     *
     * @param symbol       The stock's trading symbol.
     * @param sharePrice   The stock's share price.
     * @param numberShares The number of shares.
     */
    
    public Stock(String symbol, double sharePrice, double numberShares)
    {
	this.setCountable(new Countable());
	this.setSymbol(symbol);
	this.setSharePrice(sharePrice);
	this.setNumberShares(numberShares);
    }
    
    /**
     * Get countable
     * 
     * @return the countable
     */
    public Countable getCountable()
    {
	return countable;
    }
    
    /**
     * Get number shares
     * 
     * @return the numberShares
     */
    public double getNumberShares()
    {
	return numberShares;
    }
    
    /**
     * getSharePrice method
     *
     * @return The stock's share price
     */
    
    public double getSharePrice()
    {
	return sharePrice;
    }
    
    /**
     * Get the stock value
     * 
     * @return the Stock value
     */
    public double getStockValue()
    {
	return StockHelper.getStockValue(this);
    }
    
    /**
     * getSymbol method
     *
     * @return The stock's trading sysmbol.
     */
    
    public String getSymbol()
    {
	return symbol;
    }
    
    /**
     * Set countable
     * 
     * @param countable the countable to set
     */
    private void setCountable(Countable countable)
    {
	this.countable = countable;
    }
    
    /**
     * Set number shares
     * 
     * @param numberShares the numberShares to set
     */
    public void setNumberShares(double numberShares)
    {
	this.numberShares = numberShares;
    }
    
    /**
     * Set share price
     * 
     * @param sharePrice the sharePrice to set
     */
    public void setSharePrice(double sharePrice)
    {
	this.sharePrice = sharePrice;
    }
    
    /**
     * Set symbol
     * 
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol)
    {
	this.symbol = symbol;
    }
    
    /**
     * toString method
     *
     * @return A string indicating the object's trading symbol and share price.
     */
    
    @Override
    public String toString()
    {
	StringBuilder sb = new StringBuilder();
	
	sb.append(this.getClass());
	sb.append(" this.getCountable()=").append(this.getCountable());
	sb.append(" this.getSymbol()=").append(this.getSymbol());
	sb.append(" this.getSharePrice()=").append(this.getSharePrice());
	sb.append(" this.getNumberShares()=").append(this.getNumberShares());
	sb.append(" this.getStockValue()=").append(this.getStockValue());
	
	return sb.toString();
    }
}
