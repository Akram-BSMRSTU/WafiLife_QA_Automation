package Factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    Playwright playwright;
    Browser browser;
    BrowserContext browserContext ;
    Page page ;




    public Page initBrowser(String browsername){
        System.out.println("Starting"+browsername);
        playwright= Playwright.create();

        switch (browsername.toLowerCase()){
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;

            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;

            case "safari":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;

            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
                break;

            default:
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
        }
        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate("https://www.wafilife.com/");

        return page;
    }


}
