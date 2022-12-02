/**
 * 
 */
package chapter8;

/**
 * @author Nikolay Stoyanov
 * Dec 2, 2022
 */
public class FuelGauge
{
	@Override
	public String toString()
	{
		return "FuelGauge [maxFuel=" + maxFuel + ", currentFuel=" + currentFuel + "]";
	}

	private  Double maxFuel = 0.0;
	private Double currentFuel =0.0;

	/**
	 * @return the maxFuel
	 */
	public Double getMaxFuel()
	{
		return maxFuel;
	}

	/**
	 * @param maxFuel the maxFuel to set
	 */
	public void setMaxFuel(Double maxFuel)
	{
		this.maxFuel = maxFuel;
	}

	/**
	 * @return the currentFuel
	 */
	public Double getCurrentFuel()
	{
		return currentFuel;
	}

	/**
	 * @param currentFuel the currentFuel to set
	 */
	public void setCurrentFuel(Double currentFuel)
	{
		this.currentFuel = currentFuel;
	}

	/**
	 * Default constructor
	 */
	public FuelGauge()
	{
		super();
	}

}
