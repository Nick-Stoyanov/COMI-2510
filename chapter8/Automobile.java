/**
 * 
 */
package chapter8;

/**
 * @author Nikolay Stoyanov Dec 2, 2022
 */
public class Automobile
{

	private String name = null;

	private double fuelCapacity = 0.0;

	private double oilChange = 0.0;

	private double tireLife = 0.0;
	private double mgp = 0.0;

	/**
	 * @return the mgp
	 */
	public double getMgp()
	{
		return mgp;
	}

	/**
	 * @param mgp the mgp to set
	 */
	public void setMgp(double mgp)
	{
		this.mgp = mgp;
	}

	/**
	 * @return the fuelCapacity
	 */
	public double getFuelCapacity()
	{
		return fuelCapacity;
	}

	/**
	 * @param fuelCapacity the fuelCapacity to set
	 */
	public void setFuelCapacity(double fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * @return the oilChange
	 */
	public double getOilChange()
	{
		return oilChange;
	}

	/**
	 * @param oilChange the oilChange to set
	 */
	public void setOilChange(double oilChange)
	{
		this.oilChange = oilChange;
	}

	/**
	 * @return the tireLife
	 */
	public double getTireLife()
	{
		return tireLife;
	}

	/**
	 * @param tireLife the tireLife to set
	 */
	public void setTireLife(double tireLife)
	{
		this.tireLife = tireLife;
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
	 * Default constructor
	 */
	public Automobile()
	{
		super();
	}

}
