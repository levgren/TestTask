package IevgenTest.pageObjects;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends AbstractPage {

    By linksSelector=By.cssSelector(".iUh30");
    By buttonSelector=By.cssSelector("#pnnext");

    public SitePage openFirstLink(){
        driver.findElements(linksSelector).get(0).click();
        Allure.addAttachment("open first link","The first link opens successfully");
        return new SitePage();
    }
    public boolean fIndDomain(String domain) {
        for(WebElement link:driver.findElements(linksSelector)){
            if(link.getText().contains(domain)) {
                Allure.addAttachment("Search for domain","Domain " + domain + " exist");
                return true;
            }
        }
        Allure.addAttachment("Search for domain","There is no such domain");
        return false;

    }
    public SearchPage pressNextButton() {
        driver.findElement(buttonSelector).click();
        return this;
    }
}
