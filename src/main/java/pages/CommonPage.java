package pages;

import com.microsoft.playwright.Page;

public class CommonPage {

    Page page;

//    1. Locator
    private  String lekhokLink = "//span[contains(text(),'লেখক')]";

    //     2. Constructor
    public CommonPage(Page page){

        this.page = page;
    }


    //     3.Page method

    public LekhokPage nevigateToLekhokPage(){
        page.click(lekhokLink);
        return new LekhokPage(page);
    }

    public void scrollToAndClick(String selector) {
        // Scroll the element into view
        page.locator(selector).scrollIntoViewIfNeeded();
        // Click the element after scrolling
        page.locator(selector).click();
    }
}


