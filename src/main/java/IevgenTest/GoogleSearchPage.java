package IevgenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {
    WebDriver driver = Driver.get();
    public GoogleSearchPage FIndDomain() {

        if (driver.getPageSource().contains("https://www.testautomationday.com/")) {
            System.out.println("In the search output on the first page the link 'https://www.testautomationday.com/' is present");
        } else {
            System.out.println("There is no such domain");
        }
        return this;
    }
    public GoogleSearchPage PressNextButton() {
    WebElement button = driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]"));
    button.click();
    return this;
    }
}