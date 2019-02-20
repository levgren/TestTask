package IevgenTest.pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

}
