package IevgenTest.pageObjects;
import IevgenTest.Driver;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    static WebDriver driver = Driver.get();

    public MainPage goTo(String url){
        driver.get(url);
        return this;
    }

    public SearchPage search(String searchText){
        WebElement search = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));  // find search field by selector
        search.sendKeys(searchText);
        Allure.addAttachment("Search input","Search input 'automation' is done");       //add reporting
        search.sendKeys(Keys.ENTER);
        Allure.addAttachment("Press enter","The button 'Enter' is pressed");        //press Enter
        return new SearchPage();
    }




}