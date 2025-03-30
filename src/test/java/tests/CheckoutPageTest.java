package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest {

    @Test(priority = 1)
    public void checkStateisVisible() throws InterruptedException {
        checkoutpage.selectByValue();
    }

    @Test(priority = 2)
    public void Billing_area_selection() throws InterruptedException {
        checkoutpage.selectBilling_area();
    }
    @Test(priority = 3)
    public void varifyFulladdress() throws InterruptedException {
        checkoutpage.fillAddress();
    }
    @Test(priority = 4)
    public void varifyPaymentMethod() throws InterruptedException{
        checkoutpage.clickplcaeorder();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void scrollup() throws InterruptedException {
        String script = "window.scrollTo(0,0)";
        page.evaluate(script);
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void Dologout() throws InterruptedException{
        checkoutpage.logout();
        Thread.sleep(3000);
        Assert.assertTrue(page.isVisible(loginPage.loginbutton), "Login link is visible after logout");

    }




}
