package tests;

import Factory.PlaywrightFactory;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest {

    PlaywrightFactory pf;
    Page page;
    HomePage homePage;

    @BeforeTest
    public void setup(){
        pf = new PlaywrightFactory();
        page = pf.initBrowser("firefox");
        homePage = new HomePage(page);
    }
    @Test(priority = 1)
    public void homePageTitileTest(){
        String actutalTitle = homePage.getHomepageTitle();
        Assert.assertEquals(actutalTitle,"Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife");
    }
    @Test(priority = 2)
    public void homePageURLTest(){
        String actualURL = homePage.getHomepageUrl();
        Assert.assertEquals(actualURL,"https://www.wafilife.com/");
    }

    @Test(priority = 3)
    public void searchTest(){
        String actualpageheader = homePage.doSearch("Nabab");
        Assert.assertEquals(actualpageheader,"অনুসন্ধানের ফলাফল");
    }





    @AfterTest
    public  void teardown(){
        page.context().browser().close();

    }

}
