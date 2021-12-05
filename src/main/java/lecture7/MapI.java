package lecture7;

import java.util.*;

public class MapI extends MapFruit
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("potatoes", "vegetable");
		map.put("tomato", "vegetable");
		map.put("cucumber", "vegetable");
		map.put("apple", "fruit");
		map.put("cherry", "fruit");
		map.put("pear", "fruit");
		map.put("girolle", "mushroom");
		map.put("porcino", "mushroom");
		map.put("dill", "grass");



		Set<String> mySet = new HashSet<>();

		for (Iterator itr = map.entrySet().iterator(); itr.hasNext(); )
		{
			Map.Entry<String, String> entrySet = (Map.Entry) itr.next();

			String value = entrySet.getValue();

			if (!mySet.add(value))
			{
				itr.remove();
			}

		}

		System.out.println(map);
	}

	@Override
	public void printText()
	{
		System.out.println("It's my life");
	}
}


