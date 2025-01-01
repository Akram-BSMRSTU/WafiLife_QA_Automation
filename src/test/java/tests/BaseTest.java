package tests;

import Factory.PlaywrightFactory;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {

    PlaywrightFactory pf;
    Page page;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeTest
    public void setup(){
        pf = new PlaywrightFactory();
        page = pf.initBrowser("firefox");
        homePage = new HomePage(page);
    }

    @AfterTest
    public  void teardown(){
        page.context().browser().close();

    }
}
