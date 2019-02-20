package IevgenTest.pageObjects;

public class SitePage extends AbstractPage {

    public String getTextFromTitle(){
        return driver.getTitle();
    }
}
