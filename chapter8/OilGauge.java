/**
 * 
 */
package chapter8;

/**
 * @author Nikolay Stoyanov
 * Dec 2, 2022
 */
public class OilGauge
{
	private Double maxDistForOilChange = 0.0;
	private Double oilAge =0.0;
	

	@Override
	public String toString()
	{
		return "OilGauge [maxDistForOilChange=" + maxDistForOilChange + ", oilAge=" + oilAge + "]";
	}


	/**
	 * @return the maxDistForOilChange
	 */
	public Double getMaxDistForOilChange()
	{
		return maxDistForOilChange;
	}


	/**
	 * @param maxDistForOilChange the maxDistForOilChange to set
	 */
	public void setMaxDistForOilChange(Double maxDistForOilChange)
	{
		this.maxDistForOilChange = maxDistForOilChange;
	}


	/**
	 * @return the oilAge
	 */
	public Double getOilAge()
	{
		return oilAge;
	}


	/**
	 * @param oilAge the oilAge to set
	 */
	public void setOilAge(Double oilAge)
	{
		this.oilAge = oilAge;
	}


	/**
	 * Default constructor
	 */
	public OilGauge()
	{
		super();
	}

}
