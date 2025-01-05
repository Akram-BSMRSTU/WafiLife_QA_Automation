package pages;

import com.microsoft.playwright.Page;

public class CommonPage {

    Page page;
//    1. Locator

    private  String ordersomponnokorun = "//span[contains(text(),'অর্ডার সম্পন্ন করুন')]";
    private  String arokinun = "//span[contains(text(),'আরো কিনুন')]";
    private String orderkorun = "//div[@class='body-wrapper']//button[2]";

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


}


