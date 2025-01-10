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


}
