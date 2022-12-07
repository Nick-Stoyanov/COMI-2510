/**
 * 
 */
package chapter8;

import java.util.ArrayList;

/**
 * @author Nikolay Stoyanov Dec 2, 2022
 */
public class SalesTripTestData
{
	private static ArrayList<String> cities = new ArrayList<String>();
	
	private static ArrayList<Double> time = new ArrayList<Double>();
	
	private static  ArrayList<Double> distance = new ArrayList<Double>();

	/**
	 * @return the time
	 */
	public ArrayList<Double> getTime()
	{
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime()
	{
		time.add(22.5);
		time.add(19.75);
		time.add(21.5);
		time.add(17.9);
		time.add(31.0);
		time.add(12.1);
		time.add(3.5);
	}

	/**
	 * @return the distance
	 */
	public ArrayList<Double> getDistance()
	{
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance()
	{
		distance.add(1462.7);
		distance.add(1309.1);
		distance.add(1435.7);
		distance.add(1135.1);
		distance.add(2042.8);
		distance.add(788.9);
		distance.add(180.9);

	}

	/**
	 * @return the cities
	 */
	public ArrayList<String> getCities()
	{
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities()
	{
		cities.add("Providence");
		cities.add("Miami");
		cities.add("Dallas");
		cities.add("Los Angeles");
		cities.add("Seattle");
		cities.add("Chicago");
		cities.add("New York");
		cities.add("Providence");
	}

	/**
	 * Default constructor
	 */
	public SalesTripTestData()
	{
		super();
		setCities();
		setTime();
		setDistance();
	}

}
