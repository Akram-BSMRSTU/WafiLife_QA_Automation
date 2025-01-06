package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
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

    @Test(priority = 3, dataProvider = "loginData")
    public void testDoLogin(String appUsername, String appPassword, boolean isValid) {
        boolean loginResult = loginPage.doLogin(appUsername, appPassword);

        // Assert based on the expected validity of the credentials
        if (isValid) {
            // For valid credentials, loginResult should be true
            Assert.assertTrue(loginResult,
                    "Login should succeed for valid credentials, but it failed.");
        } else {
            // For invalid credentials, loginResult should be false
            Assert.assertFalse(loginResult,
                    "Login should fail for invalid credentials, but it succeeded.");
        }
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                {"wativor163@myweblaw.com", "invalidPass2",false},
                {"invalidUser1", "123456789**", false},
                {"", "123456789**",false},
                {"wativor163@myweblaw.com", "",false},
                {"", "",false},
                {"wativor163@myweblaw.com", "123456789**",true}
        };
    }


}
