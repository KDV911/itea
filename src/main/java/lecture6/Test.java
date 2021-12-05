package lecture6;

import java.util.*;

public class Test
{

	//Kyiv 27
	//Lviv 14
	//Odessa 17
	//Kharkiv 19

	public static void main(String[] args)
	{
		Map<String, Map<String, String>> map = new HashMap<>();

		Map<String, String> maps2 = new HashMap<>();

		maps2.put("Ukrain"," EU");


		map.put("Kyiv", maps2);





		System.out.println(map.values());


	}

}
