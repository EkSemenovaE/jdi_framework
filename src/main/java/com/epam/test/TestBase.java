package com.epam.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by kwfm083 on 10/28/2016.
 */
public class TestBase {
    boolean takescreenshot = true;
    protected String url;
    private WebDriver driver;
    private String browser;

    @BeforeSuite
    public void setup() {

        driver.manage().window().maximize();

    }


//        url = "";
//        takescreenshot = true;
//        switch (browser){
//            case "chrome":
//                driver = new ChromeDriver();
//                break;
//            default:
//                driver = new ChromeDriver();
//                break;
//        }
//        openSite();
//    }
    public void openSite(){
        driver.navigate().to(url);
    }
    @AfterSuite
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
