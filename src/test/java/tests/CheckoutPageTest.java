package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest {

    @Test(priority = 1)
    public void checkStateisVisible() throws InterruptedException {
        checkoutpage.selectByValue();
        Assert.assertTrue(checkoutpage.isbilling_state_is_visible());
    }
}
