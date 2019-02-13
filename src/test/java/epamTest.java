import IevgenTest.Driver;
import IevgenTest.pageObjects.MainPage;

import IevgenTest.pageObjects.SearchPage;
import io.qameta.allure.Allure;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class epamTest {
    MainPage mainPage = new MainPage();
        @Test
        public void TestOne() {
            String text = mainPage.goTo("https://www.google.com/")
                        .search("automation")
                        .openFirstLink()
                        .getTextBySelector(By.cssSelector(".apphub_AppName"));
            Allure.addAttachment("check of Header","Header contains 'automation'");
            Assert.assertTrue(text.toLowerCase().contains("automation"),"Header contains 'automation'");
        }

        @Test
        public void TestTwo() {
            SearchPage searchPage= mainPage.goTo("https://www.google.com/")
                                           .search("automation");

            Boolean result = false;
            for(int i = 0; i<5; i++){
                if(searchPage.FIndDomain("https://www.testautomationday.com/")){
                    result = true;
                    break;
                }
                searchPage.PressNextButton();
            }
            Assert.assertTrue(result,"there is no such link on pagination");
        }

    }

