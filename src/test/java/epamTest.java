import IevgenTest.Driver;
import IevgenTest.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class epamTest extends GoogleSearchPage {
//Class<Driver> drive = Driver.class;
//Class<GoogleSearchPage> search = GoogleSearchPage.class;

        @Test
        public void TestOne() {
            WebDriver driver = Driver.get();
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
            WebDriver driver = Driver.get();
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

