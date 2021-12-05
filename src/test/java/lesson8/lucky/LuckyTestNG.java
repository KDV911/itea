package lesson8.lucky;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LuckyTestNG
{
	Lucky lucky = new Lucky();

	@DataProvider()
	public Object[][] integerLuckDataProvider()
	{
		int[] array1 = { 15, 18, -3, 341, 49, 584 };
		int[] array2 = { 615, 78, 824, 941, 79, 184 };
		int[] array3 = { 215, 38, 524, 741, 889, 4 };
		int[] array4 = { 15, 8, 24, 41, 9, 84, 12 };

		// mail = aa@gmail.com pass = 123; ex result - login;
		// mail = nezaregana@gmail.com pass = 123; ex result - this is email is not registred;
		// mail = aa@gmail.com pass = 123123; ex result - wrong pass;



		return new Object[][]
				{
						{null, 3, false},
						{array2, 7, false},
						{array3, -1, true},
						{array4, 2, true}
				};

	}


	@DataProvider
	public Object[][] stringData()
	{
		int[] array1 = { 15, 18, -3, 341, 49, 584 };

		return new Object[][]
				{
						{array1, 1, "Im lucky"}
				};
	}

//	@Test(dataProvider = "integerLuckDataProvider")
//	public void isIntegerLucky(int[] array, int index, String result)
//	{
//		Assert.assertEquals(lucky.checkInteger(array, index));
//	}
}
