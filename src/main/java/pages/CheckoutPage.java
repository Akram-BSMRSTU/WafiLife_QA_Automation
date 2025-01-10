package pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;
import com.microsoft.playwright.options.WaitForSelectorState;

public class CheckoutPage {

//    Page page;
    private final Page page;

    private String billing_name = "//input[@id='billing_first_name']";
    private String billing_phone = "//input[@id='billing_phone']";
    private String billing_email = "//input[@id='billing_email']";
    private String billin_address = "//textarea[@id='billing_address_1']";
    private String place_order = "//button[@id='place_order']";
//    private String billing_state = "//span[@id='select2-billing_state-container']";

//    ElementHandle billing_state =  page.querySelector("//span[@id='select2-billing_state-container']");

    public CheckoutPage(Page page) {
        if (page == null) { // Handle null page error gracefully
            throw new IllegalArgumentException("Page cannot be null");
        }
        this.page = page;
//     Example locator for a checkout button
    }

    public boolean selectByValue() throws InterruptedException {
        ElementHandle billing_state  = page.waitForSelector("#select2-billing_state-container",
                new Page.WaitForSelectorOptions().setState(WaitForSelectorState.VISIBLE));
        Thread.sleep(3000);
        billing_state.click();
        Thread.sleep(3000);
        // Wait for the dropdown options to be visible
        page.waitForSelector("//ul[@class='select2-results__options']");
        ElementHandle dinajpur = page.waitForSelector("//li[contains(text(), 'Dinajpur')]",
                new Page.WaitForSelectorOptions().setState(WaitForSelectorState.VISIBLE));;
        dinajpur.click();
        Thread.sleep(3000);
        System.out.println("is visible");
        return true;

    }

    public boolean selectBilling_area() throws InterruptedException {


        if (page.locator("#billing_area").isEnabled()) {
            page.locator("#billing_area").selectOption("413");
        } else {
            System.out.println("Dropdown is disabled");
        }

//        page.locator("#billing_area").click();
//        page.waitForSelector("//select[@id='billing_area']//option[@value='414'][contains(text(),'খানসামা')]"); // Wait for the option to appear
//        page.locator("#billing_area").selectOption("414");
        Thread.sleep(3000);
        return true;
    }

    public void fillAddress(){

        page.fill(billin_address,"12/1,C , Monesshor 1st lane ,Hazaribagh");
    }
}
