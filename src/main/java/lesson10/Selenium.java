package lesson10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Selenium
{

	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver;

		driver = new ChromeDriver();


	Map<String, String> map = new HashMap<>();
	List<WebElement> myList = driver.findElements(By.xpath("//div[contains(@class, 'border col-md-12 col-sm-12']/p"));
	for (WebElement element :myList)

	{
		String[] spl = element.getText().split(":");

		for (int i = 0, j = myList.size(); j < spl.length; i++, j++)
		{
			map.put(spl[i], spl[j]);
		}
	}
}}
