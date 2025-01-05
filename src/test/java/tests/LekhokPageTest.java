package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LekhokPageTest extends BaseTest{

    @Test(priority = 1)
    public void nevigatetoLekhokPageTest() throws InterruptedException {
        lekhokPage.nevigateToLekhokPage();
        String actualTitle = lekhokPage.getLekhokTitle();
        System.out.println("LekhokPageActual Title :"+actualTitle);
        Assert.assertEquals(actualTitle,"English & Bangla Islamic Books by Authors | Wafilife");
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void LekhokPageHeadingTest(){
        Assert.assertTrue(lekhokPage.islekhokHeading());
    }
    @Test(priority = 3)
    public void clicktowrittername() throws InterruptedException {
        Assert.assertTrue(lekhokPage.Clicktowritter());
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void clicktoorder() throws InterruptedException {
        Assert.assertTrue(lekhokPage.orderclick());
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void clicktoordersomponnoKorun() throws InterruptedException {
        Assert.assertTrue(lekhokPage.clickorderORbuyMore());
        Thread.sleep(3000);
    }


//    @Test
//    public void LekhokTitlePageTest(){
//        String actualTitle = lekhokpage.getLekhokTitle();
//        System.out.println("LekhokPageActual Title :"+actualTitle);
//        Assert.assertEquals(actualTitle,"লেখক");
//    }
}