package lecture4;

class Cat{

	private String name;
	private String color;

	public String getName(){
		return name;
	}

	public void setName(String a){
		name = a;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public Cat()
	{

	}

	public Cat(String name)
	{
		this.name = name;
	}

	public Cat(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
}
