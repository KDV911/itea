package lesson8.lucky;

public class WrongTypeException extends CustomException
{

	@Override
	void print()
	{
		System.out.println("Wrong Type Exception");
	}
}
