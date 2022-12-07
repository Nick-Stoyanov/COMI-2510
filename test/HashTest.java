/**
 * 
 */
package test;

import java.util.HashMap;

/**
 * @author Nikolay Stoyanov Dec 1, 2022
 */
public class HashTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("username", "password");
		map.put("username1", "password1");
		map.put("username2", "password2");
		System.out.println(map);

	}
}
