import IevgenTest.Driver;
import IevgenTest.GoogleSearchPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class epamTest extends GoogleSearchPage{
    WebDriver driver = Driver.get();
        @Test
        public void TestOne() {

            WebElement search = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));  // Находим поле поиска
            search.sendKeys("automation");
            System.out.println("Search input 'automation' is done");
            search.sendKeys(Keys.ENTER);
            System.out.println("The button 'Search' is pressed");
            System.out.println();

            WebElement FirstLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a[1]/h3"));
            FirstLink.click();

            WebElement Header = driver.findElement(By.xpath("//*[@id=\"logoImage\"]/a/img"));
            String text = Header.getAttribute("value");
            Assert.assertEquals("automation", text);
            System.out.println("Header contains 'automation'");
            System.out.println();
        }

        @Test
        public Boolean TestTwo() {

            WebElement search = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));  // Находим поле поиска
            search.sendKeys("automation");
            System.out.println("Search input 'automation' is done");
            search.sendKeys(Keys.ENTER);
            System.out.println("The button 'Search' is pressed");
            System.out.println();

            Boolean result = false;
            for(int i = 0; i<5; i++){
                FIndDomain();
                PressNextButton();
            }
            return result;
        }

    }

