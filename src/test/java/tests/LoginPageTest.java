package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test(priority = 1)
    public void navigatetoLoginpagetest(){
       loginPage.nevigateToLoginPage();
       String actualoginPageTitile = loginPage.getLoginPagetitile();
       System.out.println("Page Actual Title : "+actualoginPageTitile);
        Assert.assertEquals(actualoginPageTitile,"আমার অ্যাকাউন্ট");
    }
    @Test(priority = 2)
    public void forgetpasswordlinkExistTest() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.isforgetpasslinkisEsist());
    }
    @Test(priority = 3)
    public void loginTest() throws InterruptedException {
        Assert.assertFalse(loginPage.doLogin("wativor163@myweblaw.com","123456789**"));
        Thread.sleep(3000);
    }


}
