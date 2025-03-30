package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class CommonPage {

    Page page;
//    1. Locator
    private String loginlink = "//div[@class='login-links']//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'আমার অ্যাকাউন্ট')]";
    private  String ordersomponnokorun = "//span[contains(text(),'অর্ডার সম্পন্ন করুন')]";
    private  String arokinun = "//span[contains(text(),'আরো কিনুন')]";
    private String orderkorun = "//div[@class='body-wrapper']//button[2]";
    private String logoutButton = "//a[contains(text(),'লগআউট')]";

    public CommonPage(Page page){

        this.page = page;
    }
    public void scrollToAndClick(String selector) {
        page.locator(selector).scrollIntoViewIfNeeded();
        page.locator(selector).click();
    }
    public void clickorder() {
        page.locator(orderkorun).click();
    }
    public void ordersomponnokorunORarokinun(String orderORaro){
        if (orderORaro == "orderSomponnokorun"){
            page.click(ordersomponnokorun);
        }
        else
            page.click(arokinun);

    }
    public void clicklogout(){
        Locator amarAccount = page.locator(loginlink).first();;
        amarAccount.waitFor(new Locator.WaitForOptions().setTimeout(20000).setState(WaitForSelectorState.VISIBLE)); // 10 seconds
//        amarAccount.scrollIntoViewIfNeeded();
//        amarAccount.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        amarAccount.click();
        page.click(logoutButton);
    }


}


