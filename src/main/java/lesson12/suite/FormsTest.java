package lesson12.suite;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson12.pages.FormPage;
import lesson12.pages.HomePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class FormsTest {

    WebDriver driver;

    HomePage homePage;
    FormPage formPage;

    @BeforeTest
    public void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void quit()
    {
        driver.quit();
    }

    @DataProvider
    public Object[][] fillFormsDataProvider()
    {
        return new Object[][]
                {
                        {"Dima", "Kov"}
                };
    }


    @Test(dataProvider = "fillFormsDataProvider")
    public void fillFormsTest(String firstName, String lastName)
    {
        homePage = new HomePage(driver);
        formPage = new FormPage(driver);

        homePage.openPage();
        Assert.assertTrue(homePage.isBannerDisplayed());

        homePage.clickFormsTab();
        formPage.clickTabPracticeForm();

        formPage.setFirstName(firstName);
        formPage.setLastName(lastName);
        formPage.clickSubmit();
        Assert.assertNotEquals(firstName, lastName);
    }

    @Test
    public void checkbox() {
        driver.get("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("//*[contains(@class, 'rct-collapse rct-collapse-btn')]")).click();
        driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']/ol/li[3]//*[contains(@type, 'button')]")).click();

        WebElement wordFile = driver.findElement(By.xpath("//*[@for='tree-node-wordFile']//*[@class='rct-checkbox']"));
        WebElement wordFileInput = driver.findElement(By.id("tree-node-wordFile"));
        wordFile.click();
        Assert.assertEquals(wordFileInput.isSelected(), true);


    }
}
