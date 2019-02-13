package IevgenTest.pageObjects;

import IevgenTest.Driver;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    WebDriver driver = Driver.get();

    public SitePage openFirstLink(){
        WebElement FirstLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a[1]/h3"));
        FirstLink.click();
        Allure.addAttachment("open first link","The first link opens successfully");
        return new SitePage();
    }

    public boolean FIndDomain(String domain) {

        if (driver.getPageSource().contains(domain)) {

            System.out.println("In the search output on the first page the link 'https://www.testautomationday.com/' is present");
            return true;
        } else {
            System.out.println("There is no such domain");
        }
        return false;
    }
    public SearchPage PressNextButton() {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]"));
        button.click();
        return this;
    }
}
