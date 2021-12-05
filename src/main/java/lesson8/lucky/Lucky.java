package lesson8.lucky;

public class Lucky
{
	WrongTypeException wrongTypeException = new WrongTypeException();
	LengthArrayException lengthArrayException = new LengthArrayException();
	NegativeValueException negativeValueException = new NegativeValueException();
	CustomLengthException customLengthException = new CustomLengthException();

	public void checkInteger(int[] array1, int index)
	{
		int a = (int) (Math.random() * 5);

		if (a + 2 >= a)
		{
			System.out.println("I am lucky");
		}
		else
		{
			System.out.println("Run again");
		}
	}
}
