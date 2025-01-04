package pages;

import com.microsoft.playwright.Page;

public class LekhokPage extends CommonPage{

    Page page;
    private CommonPage commonPage;
    //    1.Locator
    private  String lekhokPagetitle = "//h1[contains(text(),'লেখক')]";
    private  String lekhokSearchBox = "//input[@id='cat_search']";
    private  String lekhokSearchButton = "//button[@class='btn btn-default']//i[@class='fa fa-search']";
    private  String lekhokname = "//h3[normalize-space()='Masudul Hasan Roni']";
    private  String booklink = "//div[@class='product_thumbnail_wrapper']//a";
    private  String lekhokh1 = "//h1[normalize-space()='Masudul Hasan Roni']";
    private  String nextpage = "//a[contains(text(),'→')]";

    //     2. Constructor
    public LekhokPage(Page page) {
        super(page);
        this.page = page;// Call the constructor of CommonPage
    }

    //     3.Page method

    public String getLekhokTitle(){

        String title = page.title();
        System.out.println("page title: "+ title);
        return title;
    }
    public String getLekhokUrl(){
        String URL = page.url();
        System.out.println("Page URL : "+URL);
        return URL;
    }

    public boolean islekhokHeading(){
        return page.isVisible(lekhokPagetitle);
    }

    public boolean Clicktowritter(){

//       Scroll Down and go to the Next Page
        scrollToAndClick(nextpage);
//      Select  Author masudul Roni
        page.click(lekhokname);
        if (page.isVisible(lekhokh1)){
            System.out.println("Masudul Hasan Roni is visible.");
            page.click(booklink);
            return true;
        }else
            System.out.println("lekhokh1 is not visible.");
            return false ;
    }

    }
