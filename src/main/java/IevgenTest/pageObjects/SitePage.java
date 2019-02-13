package IevgenTest.pageObjects;

import IevgenTest.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SitePage {
    WebDriver driver = Driver.get();
    public String getTextBySelector(By by){
        return driver.findElement(by).getText();
    }
}
