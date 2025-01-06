package pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class CheckoutPage {

//    Page page;

    private final Page page;
    private final ElementHandle billing_state;
    private final ElementHandle Cumilla;

    private String billing_name = "//input[@id='billing_first_name']";
    private String billing_phone = "//input[@id='billing_phone']";
    private String billing_email = "//input[@id='billing_email']";
    private String billin_address = "//textarea[@id='billing_address_1']";
    private String place_order = "//button[@id='place_order']";
//    private String billing_state = "//span[@id='select2-billing_state-container']";

//    ElementHandle billing_state =  page.querySelector("//span[@id='select2-billing_state-container']");
    private String billing_area = "//select[@id='billing_area']";

    public CheckoutPage(Page page) {
        if (page == null) { // Handle null page error gracefully
            throw new IllegalArgumentException("Page cannot be null");
        }
        this.page = page;
        this.billing_state = page.querySelector("//span[@id='select2-billing_state-container']");
        this.Cumilla = page.querySelector("li[role='option']:has-text('Cumilla')");// Example locator for a checkout button
    }

    public void selectByValue() throws InterruptedException {
        Thread.sleep(3000);
        billing_state.click();
        Cumilla.click();
        Thread.sleep(3000);
    }
    public boolean isbilling_state_is_visible(){
        billing_state.isVisible();
        return true;
    }
}
