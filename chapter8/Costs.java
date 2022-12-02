/**
 * 
 */
package chapter8;

/**
 * @author Nikolay Stoyanov
 * Dec 2, 2022
 */
public class Costs
{

	private String name =null;
	private Double newTiresCost= 0.0;
	private Double oilChangeCost =0.0;
	private Double fuelPrice = 0.0;
	private Double carCost = 0.0;
	@Override
	public String toString()
	{
		return "Costs [name=" + name + ", newTiresCost=" + newTiresCost + ", oilChangeCost=" + oilChangeCost
				+ ", fuelPrice=" + fuelPrice + ", carCost=" + carCost + "]";
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
	 * @return the newTiresCost
	 */
	public Double getNewTiresCost()
	{
		return newTiresCost;
	}
	/**
	 * @param newTiresCost the newTiresCost to set
	 */
	public void setNewTiresCost(Double newTiresCost)
	{
		this.newTiresCost = newTiresCost;
	}
	/**
	 * @return the oilChangeCost
	 */
	public Double getOilChangeCost()
	{
		return oilChangeCost;
	}
	/**
	 * @param oilChangeCost the oilChangeCost to set
	 */
	public void setOilChangeCost(Double oilChangeCost)
	{
		this.oilChangeCost = oilChangeCost;
	}
	/**
	 * @return the fuelPrice
	 */
	public Double getFuelPrice()
	{
		return fuelPrice;
	}
	/**
	 * @param fuelPrice the fuelPrice to set
	 */
	public void setFuelPrice(Double fuelPrice)
	{
		this.fuelPrice = fuelPrice;
	}
	/**
	 * @return the carCost
	 */
	public Double getCarCost()
	{
		return carCost;
	}
	/**
	 * @param carCost the carCost to set
	 */
	public void setCarCost(Double carCost)
	{
		this.carCost = carCost;
	}
	/**
	 * Default constructor
	 */
	public Costs()
	{
		super();
	}

}
