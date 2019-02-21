import IevgenTest.pageObjects.AbstractPage;
import IevgenTest.pageObjects.MainPage;
import IevgenTest.pageObjects.SearchPage;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EpamTest {
    MainPage mainPage = new MainPage();

    @BeforeMethod
    public void before(){
        mainPage.goTo("https://www.google.com/");
    }

    @Test
    public void testOne() {
        String text =mainPage
                    .search("automation")
                    .openFirstLink()
                    .getTextFromTitle();
        Allure.addAttachment("check of Header","Header contains 'automation'");
        Assert.assertTrue(text.toLowerCase().contains("automation"),"Header contains 'automation'");
    }
    @Test
    public void testTwo() {
        SearchPage searchPage= mainPage.search("automation");

        Boolean result = false;
        for(int i = 0; i<5; i++){
            if(searchPage.fIndDomain("https://www.testautomationday.com/")){
                result = true;
                break;
            }
            searchPage.pressNextButton();
        }
        Assert.assertTrue(result,"there is no such link on pagination");
    }

    @AfterClass
    public void afterClass(){
        new AbstractPage().closeDriver();
    }

    }

