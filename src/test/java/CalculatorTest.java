import lecture7.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest
{

	public Calculator calculator = new Calculator();

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}

	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println("BeforeGroups");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}


	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	@AfterGroups
	public void afterGroups()
	{
		System.out.println("AfterGroups");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite");
	}


	@Test(priority = 1)
	public void testSum()
	{
		Assert.assertEquals(calculator.sum(4, 6), 10);
		System.out.println("Sum= " + calculator.sum(4, 6));

	}

	@Test(priority = 1)
	public void testSum2()
	{
		Assert.assertEquals(calculator.sum(5, 15), 20);
		System.out.println("Sum= " + calculator.sum(5, 15));
	}

//	@Test(groups = "aa")
//	public void testSum3()
//	{
//		Assert.assertEquals(calculator.sum(4, 6), 10);
//	}
}
