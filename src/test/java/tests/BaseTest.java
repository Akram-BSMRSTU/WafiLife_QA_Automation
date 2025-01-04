package tests;

import Factory.PlaywrightFactory;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.CommonPage;
import pages.HomePage;
import pages.LekhokPage;
import pages.LoginPage;

public class BaseTest {

    PlaywrightFactory pf;
    Page page;
    HomePage homePage;
    LoginPage loginPage;
    LekhokPage lekhokpage;
    CommonPage commonPage;

    @BeforeTest
    public void setup(){
        pf = new PlaywrightFactory();
        page = pf.initBrowser("firefox");


        homePage = new HomePage(page);
        loginPage = new LoginPage(page);
        lekhokpage = new LekhokPage(page);
        commonPage = new CommonPage(page);
    }

    @AfterTest
    public  void teardown(){
        page.context().browser().close();

    }
}
