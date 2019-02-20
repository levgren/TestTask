package IevgenTest.pageObjects;

import IevgenTest.Driver;
import org.openqa.selenium.WebDriver;



public class AbstractPage {
    protected WebDriver driver= Driver.get();

    public void closeDriver(){
        if(driver!=null)
            driver.quit();
    }


}
