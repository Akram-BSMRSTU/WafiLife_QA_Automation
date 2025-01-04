package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LekhokPageTest extends BaseTest{

    @Test(priority = 1)
    public void nevigatetoLekhokPageTest() throws InterruptedException {
        lekhokpage =commonPage.nevigateToLekhokPage();
        String actualTitle = lekhokpage.getLekhokTitle();
        System.out.println("LekhokPageActual Title :"+actualTitle);
        Assert.assertEquals(actualTitle,"English & Bangla Islamic Books by Authors | Wafilife");
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void LekhokPageHeadingTest(){
        Assert.assertTrue(lekhokpage.islekhokHeading());
    }
    @Test(priority = 3)
    public void clicktowrittername() throws InterruptedException {
        Assert.assertTrue(lekhokpage.Clicktowritter());
        Thread.sleep(3000);

    }


//    @Test
//    public void LekhokTitlePageTest(){
//        String actualTitle = lekhokpage.getLekhokTitle();
//        System.out.println("LekhokPageActual Title :"+actualTitle);
//        Assert.assertEquals(actualTitle,"লেখক");
//    }
}
