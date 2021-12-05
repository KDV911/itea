package lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class UploadDownload
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		File dir = new File("src/main/java/lecture6");
		if(dir.isDirectory())
		{
			for(File item : dir.listFiles())
			{
				if(item.isDirectory())
					System.out.println(item.getName() + " directory***");
				else
					System.out.println(item.getName() + " " + item.length());
			}
		}



	}
}
