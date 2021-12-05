package lesson8.lucky;

public class CustomLengthException extends CustomException
{
	@Override
	void print()
	{
		System.out.println("Custom length exception");
	}
}
