package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


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
        Assert.assertTrue(page.isVisible(homePage.searchresultValidate));
    }



}
