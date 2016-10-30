package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by kwfm083 on 10/8/2016.
 */
public class openchrome {

    @Test
    public static void test1()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.epam.com");

    }

}

