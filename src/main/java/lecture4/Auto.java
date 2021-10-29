package lecture4;

public class Auto
{
	String body;
	String color;
	String type;

	public Auto(String body, String color, String type)
	{
		this(body, color);
		this.type = type;
//		System.out.println("Three parameters");
	}

	public Auto(String body, String color)
	{
		this();
		this.body = body;
		this.color = color;
		System.out.println("Two parameters");
	}

	public Auto()
	{
		System.out.println("default");
	}
}
