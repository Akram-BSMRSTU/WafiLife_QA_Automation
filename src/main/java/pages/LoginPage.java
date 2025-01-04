package pages;
import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    
    //    1.Locator
    private String username = "//input[@id='username']";
    private String password = "//input[@id='password']";
    private String loginbutton = "//input[@name='login']";
    private String forgetpasswordLink = "//a[contains(text(),'আপনি কি পাসওয়ার্ড ভুলে গেছেন?')]";
    private String logoutLink = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']";


    //     2. Constructor
    public LoginPage(Page page){
        this.page = page;
    }

    //      3.Page Method/Actions

    public String getLoginPagetitile(){
        return page.title();
    }

    public boolean isforgetpasslinkisEsist(){
        return page.isVisible(forgetpasswordLink);
    }

    public boolean doLogin(String appUsername, String appPassword){
        System.out.println("App Username "+ appUsername + ":"+appPassword);
        page.fill(username,appUsername);
        page.fill(password,appPassword);
        page.click(loginbutton);
        if (page.isVisible(logoutLink)){
            return true;
        }
        return false;

    }
}
