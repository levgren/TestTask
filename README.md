# TestTask
In this Maven project there are two automated tests. They were written on Java with the help of Selenium Webdriver+TestNg frameworks. Page Object and Singleton patterns were used. Reportings with Allure.

Here are two automated test:
1.	Test #1. Open Google. Search for “automation”. Open the first link on search results page. Verify that title contains searched word
2.	Test #2. Open Google. Search for “automation”. Verify that there is expected domain (“testautomationday.com”) on search results  pages (page: 1-5).
First test passed good.
Second test falls because there is no such domain on pagination (expected [true] but found [false])

I fixed the test task and here are my answers on comments in the order in which they were written:
—ReadMe.md now is present (but I think that general description is written not like it should be);
— unused imports have been removed;
—I tried to make locators more flexible;
—verification of domain now is from result links;
—locator was moved out of method "PressNextButton";
—now methods are lowercased (and I understand how terrible it was looking like);
—System.out.println were removed from methods;
—commented code also was removed;
—fields/variables are private now;
—instead of  @Before and @After I used @BeforeMethod and @AfterClass to create pre/post conditions;
—I remove WebDriver driver = Driver.get() and it really works without that!
—ThreadLocal static driver to avoid problems with parallelization—I had not enough time to deal with this task (but I will certainly correct this gap as soon as I could.)
—bonigarcia dependency now is present and I don`t need to move chromeDriver.exe to Git;
—pom.xml, maven default plugins that are not used have been removed;
—I tried to  improve Page Object approach and make it more polished (Abstract class was added, contentious of classes and methods was changed and now code has new look)

It was very interesting to work with this test task, I learned and understood a lot of new things and I want to learn automation deeper and grow up in this direction! Thank you for giving me the opportunity to work with this task. I really liked it!
Best regards Ievgen Obodianskyi.