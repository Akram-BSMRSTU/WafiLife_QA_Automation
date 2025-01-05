package tests;

import Factory.PlaywrightFactory;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.*;

public class BaseTest {

    protected PlaywrightFactory pf;
    protected Page page;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected CommonPage commonPage;
    protected LekhokPage lekhokPage;


    @BeforeClass
    public void setup() {
        System.out.println("Setting up the tests...");
        pf = PlaywrightFactory.getInstance(); // Get Singleton instance
        page = pf.initBrowser("firefox");

        // Initialize page objects
        homePage = new HomePage(page);
        loginPage = new LoginPage(page);
        commonPage = new CommonPage(page);
        lekhokPage = new LekhokPage(page);

        System.out.println("Setup completed. Login initialized: " + (loginPage != null));
    }

    @AfterSuite
    public void teardown() {
        System.out.println("Tearing down the tests...");
        pf.closeBrowser();  // Close the browser after all tests
    }
}
