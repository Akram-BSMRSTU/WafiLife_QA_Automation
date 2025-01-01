package pages;

import com.microsoft.playwright.Page;

public class HomePage {


    Page page;
    //    1.Locator


    private String Searchbox = "//div[@class='header_search']//input[@id='freeSearchBoxWeb']";
    private String searchButton = "//div[@class='header_search']//i[@class='fa fa-search']";
    public String searchPageHeader = "//h1[contains(text(),'অনুসন্ধানের ফলাফল')]";
    public String searchresultValidate = "//*[contains(text(), 'Nabab')]";
    private String loginlink = "//a[@title='আমার অ্যাকাউন্ট']";


    //     2. Constructor
    public HomePage(Page page){
        this.page = page;
    }

    //     3.Page method

    public String getHomepageTitle(){

        String title = page.title();
        System.out.println("page title: "+ title);
        return title;
    }
    public String getHomepageUrl(){
       String URL = page.url();
       System.out.println("Page URL : "+URL);
       return URL;
    }

    public String doSearch(String productname){
        page.fill(Searchbox,productname);
        page.click(searchButton);
        String pageheader =  page.textContent(searchPageHeader);
        System.out.println("search header: "+pageheader);
        return pageheader;

    }

    public LoginPage nevigateToLoginPage(){
        page.click(loginlink);
        return new LoginPage(page);
    }

}

