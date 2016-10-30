package settings;

import org.openqa.selenium.WebDriver;
/**
 * Created by kwfm083 on 10/28/2016.
 */
public class Configuration {
    private String browserName = "chrome";
    private String loginPageURL = "https://jdi-framework.github.io/tests/";
    private static Configuration instance;

    private Configuration(){

    }
    public static Configuration getInstance(){
        if (instance == null){
            instance = new Configuration();
        }
        return instance;
    }
    public String getLoginPageURL(){

        return loginPageURL;
    }
    public String getBrowserName(){
        return browserName;
    }

    public WebDriver getWebDriver() {

        return DriverFactory.getDriver(browserName);
    }
}
