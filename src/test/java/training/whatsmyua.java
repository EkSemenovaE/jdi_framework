package training;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
/**
 * Created by kwfm083 on 10/10/2016.
 */
public class whatsmyua {

    @Test
    public static void test1() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
        options.addArguments("user-data-dir=C:/Users/kwfm083/AppData/Local/Google/Chrome/UserData");
        options.addArguments("--user-agent = Mozilla/5.0 (iPhone; CPU iPhone OS 7_0 like Mac OS X; en-us) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53");
        options.addArguments("start-maximized");
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WINDOWS);
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        ChromeDriver driver = new ChromeDriver(caps);
        driver.get("www.whatsmyua.com/");
    }

}

