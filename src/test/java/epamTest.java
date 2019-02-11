import IevgenTest.ConfProp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static IevgenTest.Driver.driver;

public class epamTest {

        @Test
        public void TestOne() {
            WebElement search = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));  // Находим поле поиска
            search.sendKeys("automation");
            System.out.println("Search input 'automation' is done");    //вывод на экран отчет, что все прошло ок
            search.sendKeys(Keys.ENTER); //жмем Enter
            System.out.println("The button 'Search' is pressed");
            System.out.println();

            WebElement FirstLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a[1]/h3"));
            FirstLink.click();

            WebElement Header = driver.findElement(By.xpath("//*[@id=\"logoImage\"]/a/img"));
            String text = Header.getAttribute("value");
            Assert.assertEquals("automation", Header);
            System.out.println("Header contains 'automation'");
            System.out.println();
        }

        @Test
        public void TestTwo() {


            WebElement search = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));  // Находим поле поиска
            search.sendKeys("automation");
            System.out.println("Search input 'automation' is done");    //вывод на экран отчет, что все прошло ок
            search.sendKeys(Keys.ENTER); //жмем Enter
            System.out.println("The button 'Search' is pressed");
            System.out.println();

            if (driver.getPageSource().contains("https://www.testautomationday.com/")) {
                System.out.println("In the search output on the first page the link 'https://www.testautomationday.com/' is present");
                 }
                 else {
                System.out.println("There is no such domain");
            }

            System.out.println();
            System.out.println("Test task complete! Best regards from Ievgen Obodianskyi!");



        }
    }

