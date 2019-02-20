import IevgenTest.pageObjects.MainPage;
import IevgenTest.pageObjects.SearchPage;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EpamTest {
    MainPage mainPage = new MainPage();
        @Test
        public void testOne() {
            String text = mainPage.goTo("https://www.google.com/")
                        .search("automation")
                        .openFirstLink()
                        .getTextFromTitle();
            Allure.addAttachment("check of Header","Header contains 'automation'");
            Assert.assertTrue(text.toLowerCase().contains("automation"),"Header contains 'automation'");
        }
        @Test
        public void testTwo() {
            SearchPage searchPage= mainPage.goTo("https://www.google.com/")
                                           .search("automation");

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

    }

