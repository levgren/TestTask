package IevgenTest;

import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;

    private Driver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url = "https://www.google.com/";
        driver.get(url);
        Allure.addAttachment("driver starts", "initial page: " +url);
    }

    public static WebDriver get() {
        if(driver==null)
            new Driver();
        return driver;
    }
}
