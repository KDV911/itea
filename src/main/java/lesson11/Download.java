package lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Download
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;

		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", Paths.get("target").toFile().getAbsolutePath());
		prefs.put("safebrowsing.enabled", "false");
		prefs.put("profile.default_content_settings.popups", 0);
		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);

		driver.get("https://demoqa.com/");
		WebElement tabElement = driver.findElement(By.xpath("//*[contains(@class, 'top-card')][1]"));
		tabElement.click();
		WebElement linkUploadAndDownload = driver.findElement(By.xpath("//*[@class='element-group'][1]//*[@id='item-7']"));
		linkUploadAndDownload.click();
		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();

	}
}
