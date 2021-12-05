package lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatesOfElement
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		WebElement practiceTab = driver.findElement(By.xpath(("//*[contains(text(), 'Practice')]")));
		boolean isDisplayed = practiceTab.isDisplayed();
		boolean isEnabled = practiceTab.isEnabled();
		boolean isSelected = practiceTab.isSelected();

		System.out.println("isDisplayed: " + isDisplayed);
		System.out.println("isEnabled: " + isEnabled);
	}
}
