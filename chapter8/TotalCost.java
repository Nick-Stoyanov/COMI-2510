/**
 * 
 */
package chapter8;

/**
 * @author Nikolay Stoyanov
 * Dec 2, 2022
 */
public class TotalCost
{

	private String name = null;
	private Double totalTyreCost = 0.0;
	private Double totalOilChangeCost =0.0;
	private Double totalCostOfFuel = 0.0;
	/**
	 * Default constructor
	 */
	public TotalCost()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "TotalCost [name=" + name + ", totalTyreCost=" + totalTyreCost + ", totalOilChangeCost="
				+ totalOilChangeCost + ", totalCostOfFuel=" + totalCostOfFuel + "]";
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the totalTyreCost
	 */
	public Double getTotalTyreCost()
	{
		return totalTyreCost;
	}
	/**
	 * @param totalTyreCost the totalTyreCost to set
	 */
	public void setTotalTyreCost(Double totalTyreCost)
	{
		this.totalTyreCost = totalTyreCost;
	}
	/**
	 * @return the totalOilChangeCost
	 */
	public Double getTotalOilChangeCost()
	{
		return totalOilChangeCost;
	}
	/**
	 * @param totalOilChangeCost the totalOilChangeCost to set
	 */
	public void setTotalOilChangeCost(Double totalOilChangeCost)
	{
		this.totalOilChangeCost = totalOilChangeCost;
	}
	/**
	 * @return the totalCostOfFuel
	 */
	public Double getTotalCostOfFuel()
	{
		return totalCostOfFuel;
	}
	/**
	 * @param totalCostOfFuel the totalCostOfFuel to set
	 */
	public void setTotalCostOfFuel(Double totalCostOfFuel)
	{
		this.totalCostOfFuel = totalCostOfFuel;
	}

}
