/**
 * 
 */
package chapter8;

/**
 * @author Nikolay Stoyanov
 * Dec 2, 2022
 */
public class Automobile
{

	private String name = null;
	//private Double key = 0.0;
	private Double mpg = 0.0;
	
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
	 * @return the mpg
	 */
	public Double getMpg()
	{
		return mpg;
	}

	/**
	 * @param mpg the mpg to set
	 */
	public void setMpg(Double mpg)
	{
		this.mpg = mpg;
	}

	/**
	 * Default constructor
	 */
	public Automobile()
	{
		super();
	}

}
