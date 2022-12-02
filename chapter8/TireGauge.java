/**
 * 
 */
package chapter8;

/**
 * @author Nikolay Stoyanov
 * Dec 2, 2022
 */
public class TireGauge
{
	private Double maxDistBeforeChange =0.0;
	private Double tireAge = 0.0;
	

	@Override
	public String toString()
	{
		return "TireGauge [maxDistBeforeChange=" + maxDistBeforeChange + ", tireAge=" + tireAge + "]";
	}


	/**
	 * @return the maxDistBeforeChange
	 */
	public Double getMaxDistBeforeChange()
	{
		return maxDistBeforeChange;
	}


	/**
	 * @param maxDistBeforeChange the maxDistBeforeChange to set
	 */
	public void setMaxDistBeforeChange(Double maxDistBeforeChange)
	{
		this.maxDistBeforeChange = maxDistBeforeChange;
	}


	/**
	 * @return the tireAge
	 */
	public Double getTireAge()
	{
		return tireAge;
	}


	/**
	 * @param tireAge the tireAge to set
	 */
	public void setTireAge(Double tireAge)
	{
		this.tireAge = tireAge;
	}


	/**
	 * Default constructor
	 */
	public TireGauge()
	{
		super();
	}

}
