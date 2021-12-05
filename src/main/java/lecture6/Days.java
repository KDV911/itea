package lecture6;

public class Days
{

	String randomDay = "friday";

	boolean is = randomDay.contains(Day.MONDAY.name);


	enum Day
	{
		MONDAY("M"),
		SUNDAY("S"),
		FRIDAY("F");

		String name;

		Day(String name)
		{
			this.name = name;
		}
	}
}
