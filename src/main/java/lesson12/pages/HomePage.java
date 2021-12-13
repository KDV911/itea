package lesson12.pages;

import io.qameta.allure.Step;
import lesson11.CustomLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

//    By banner = By.className("banner-image");
//    By formTab = By.xpath("//div[contains(@class, 'top-card')][2]");

    @FindBy(className = "banner-image")
    WebElement banner;

    @FindBy(xpath = "//div[contains(@class, 'top-card')][2]")
    WebElement formTab;


    public static final String URL = "https://demoqa.com/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(URL);
    }


    @Step("Verify is banner displayed")
    public boolean isBannerDisplayed() {
//        boolean isBannerDisplayed = driver.findElement(banner).isDisplayed();
        boolean isBannerDisplayed = banner.isDisplayed();

        log.info("Is banner displayed: " + isBannerDisplayed);
        return isBannerDisplayed;
    }


    @Step("Click tab FORMS")
    public void clickFormsTab() {
//        driver.findElement(formTab).click();
        formTab.click();
        log.info("Click FORMS tab");
    }
}
