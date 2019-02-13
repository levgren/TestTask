package IevgenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {
@FindBy(xpath = "//*[@id=\"q\"]")


    static WebDriver driver = Driver.get();
    public boolean FIndDomain() {

        if (driver.getPageSource().contains("https://www.testautomationday.com/")) {

            System.out.println("In the search output on the first page the link 'https://www.testautomationday.com/' is present");
            return true;
        } else {
            System.out.println("There is no such domain");
        }
        return false;
    }
    public GoogleSearchPage PressNextButton() {
    WebElement button = driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]"));
    button.click();
    return this;
    }


}