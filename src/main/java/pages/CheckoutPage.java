package pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class CheckoutPage extends CommonPage {

    private final Page page;

    private String billing_name = "//input[@id='billing_first_name']";
    private String billing_phone = "//input[@id='billing_phone']";
    private String billing_email = "//input[@id='billing_email']";
    private String billin_address = "//textarea[@id='billing_address_1']";
    private String place_order = "//button[@id='place_order']";
    private  String payment_methods ="//ul[@class='payment_methods methods']";
    private String terms ="//input[@id='terms']";



    public CheckoutPage(Page page) {
//        if (page == null) { // Handle null page error gracefully
//            throw new IllegalArgumentException("Page cannot be null");
//        }
        super(page);
        this.page = page;
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
        Thread.sleep(3000);
        return true;
    }

    public void fillAddress(){
        page.fill(billin_address,"12/1,C , Monesshor 1st lane ,Hazaribagh");
    }

    public boolean clickplcaeorder(){
        Locator paymentMethods = page.locator(payment_methods);
        paymentMethods.scrollIntoViewIfNeeded();
        if (page.isVisible(payment_methods)){
            boolean isCashOnDeliveryChecked = page.isChecked("//input[@id='payment_method_cod']");
            // Ensure that exactly one radio button is checked
            boolean isBkashChecked = page.isChecked("//input[@id='payment_method_bkash']");
            boolean isRocketChecked = page.isChecked("//input[@id='payment_method_rocket']");
            boolean isNagadChecked = page.isChecked("//input[@id='payment_method_nagad']");
            boolean isBankCardChecked = page.isChecked("//input[@id='payment_method_sslcommerz']");


            if (isCashOnDeliveryChecked && !isBkashChecked && !isRocketChecked && !isNagadChecked  && !isBankCardChecked ) {
                System.out.println("Default radio button is correctly set to 'Cash on Delivery'.");
            } else {
                System.out.println("Default radio button is not set correctly.");
            }
            if (page.isChecked(terms)){
//                page.click(place_order);
                System.out.println("can perform place order successfully");
            }
            return true;
        }
        else
            System.out.println("Payment Method is not working properly");
        return false;

    }
    public void logout(){
        clicklogout();
    }

}
