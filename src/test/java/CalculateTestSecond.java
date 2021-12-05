import lecture7.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculateTestSecond
{
	public Calculator calculator = new Calculator();


	@DataProvider(name = "testSum3DataProvider")
	public Object[][] firstTest3Data()
	{
		Object[][] data = new Object[][] {
				{5, 15, Integer.sum(5,15)},
				{4, 8, Integer.sum(4,8)},
				{2, 9, Integer.sum(2,9)},
				{3, 6, Integer.sum(3,6)},
				{7, 3, Integer.sum(7,3)},
		};

		return data;
	}

	@DataProvider()
	public Object[][] secondData()
	{
		int a = 15;
		int b = 8;

		int a1 = 4;
		int b1 = 8;

		int a2 = 2;
		int b2 = 9;

		int a3 = 3;
		int b3 = 6;

		int a4 = 7;
		int b4 = 3;

		int sum = Integer.sum(a, b);
		int sum1 = Integer.sum(a1, b1);
		int sum2 = Integer.sum(a2, b2);
		int sum3 = Integer.sum(a3, b3);
		int sum4 = Integer.sum(a4, b4);

		return new Object[][]
				{
						{a, b, sum},
						{a1, b1, sum1},
						{a2, b2, sum2},
						{a3, b3, sum3},
						{a4, b4, sum4},
				};
	}


	@Test(priority = 1, dataProvider = "testSum3DataProvider")
	public void testSum3(int a, int b, int sum)
	{
		Assert.assertEquals(calculator.sum(a, b), sum);
		System.out.println("Sum3= " + calculator.sum(a, b));
	}
}
