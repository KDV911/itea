package lesson12.pages;

import lesson11.CustomLogger;
import org.openqa.selenium.WebDriver;

abstract class PageBase {

    WebDriver driver;
    CustomLogger log = new CustomLogger();
}
