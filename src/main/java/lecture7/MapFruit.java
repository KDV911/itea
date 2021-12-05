package lecture7;

import java.util.*;

public class MapFruit
{

	public static Map<String, String> createMap()
	{
		java.util.Map<String, String > map = new HashMap<>();
		map.put("кавун", "ягода");
		map.put("яблуко", "фрукт");
		map.put("банан", "ягода");
		map.put("картошка", "овоч");
		map.put("томат", "овоч");
		map.put("петрушка", "зелень");
		map.put("вишня", "ягода");
		map.put("диня", "овоч");
		map.put("апельсин", "цитрус");
		map.put("полуниця", "ягода");
		return map;
	}
	public static void removeDuplicate( Map<String, String> map )
	{
		Set<String> setNames = new HashSet<>();
		Set<String> duplicateNames = new HashSet<>();
		for (Map.Entry<String, String> pair : map.entrySet())
		{
			String name=pair.getValue();
			if (setNames.contains(name))
			{
				duplicateNames.add(name);
			}
			else
			{
				setNames.add(name);
			}
		}
		for (String name : duplicateNames)
		{
			removeItemFromMap(map, name);
		}

		System.out.println(map);
	}
	public static void removeItemFromMap(Map<String, String> map, String value) {
		Map<String, String> copy = new HashMap<>(map);
		for (Map.Entry<String, String> pair : copy.entrySet()) {
			if (pair.getValue().equals(value))
				map.remove(pair.getKey());
		}
	}

	public void printText()
	{
		System.out.println("It's method from MapFruit class");
	}
}
