package lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JsExec
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();


		driver.get("https://demoqa.com/");
//		WebElement tabElement = driver.findElement(By.xpath("//*[contains(@class, 'top-card')][1]"));
//
//		WebElement input = driver.findElement(By.xpath("//input[contains(@aria-label, 'jump')]"));
//		WebElement state = driver.findElement(By.id("state"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//
		WebElement birth = driver.findElement(By.id("dateOfBirthInput"));
		birth.click();

//		js.executeScript("arguments[0].value='12.12.2020';", birth);
		setDate(driver, "12", "June", "1991");

//		js.executeScript("document.getElementById('dateOfBirthInput').value = '12 Dec 1991'");
		driver.findElement(By.id("firstName")).sendKeys("dima");
		driver.findElement(By.id("lastName")).sendKeys("dima");
		driver.findElement(By.id("userNumber")).sendKeys("123123123123");
//		driver.findElement(By.id("gender-radio-1")).submit();
		driver.findElement(By.id("submit")).click();

		setDate(driver, "23", "June", "1232");
		setDate(driver, "26", "June", "1232");



		//		js.executeScript("alert('input your name')");
//		js.executeScript("return arguments[0].value", input);
//		js.executeScript("arguments[0].style.outline='3px solid red'", tabElement);
//		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		String value = "NCR";
		Thread.sleep(3000);
	}

	public static void setDate(WebDriver driver, String day, String month, String year)
	{
		WebElement birth = driver.findElement(By.id("dateOfBirthInput"));
		birth.click();
		WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
		Select selectMonth = new Select(monthElement);
		selectMonth.selectByVisibleText(month);
		WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
		Select selectYear = new Select(yearElement);
		selectYear.selectByVisibleText(year);
		WebElement dayElement = driver.findElement(By.xpath("//*[contains(@class, 'react-datepicker__day react-datepicker__day--0"+ day + "')]"));
		dayElement.click();
	}
}
