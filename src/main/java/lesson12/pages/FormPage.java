package lesson12.pages;

import lesson11.CustomLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends PageBase {

    By inputFirstName = By.id("firstName");
    By inputLastName = By.id("lastName");
    By buttonSubmit = By.id("lastName");
    By blockTabPracticeFrom = By.xpath("//span[contains(text(), 'Practice')]");


    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTabPracticeForm()
    {
        driver.findElement(blockTabPracticeFrom).click();
        log.info("Open practice form");
    }

    public void setFirstName(String firstName)
    {
        driver.findElement(inputFirstName).sendKeys(firstName);
        log.info("Set FIRST NAME: " + firstName);
    }

    public void setLastName(String lastName)
    {
        driver.findElement(inputLastName).sendKeys(lastName);
        log.info("Set LAST NAME: " + lastName);
    }

    public void clickSubmit()
    {
        driver.findElement(buttonSubmit).click();
        log.info("Click SUBMIT button");
    }
}
