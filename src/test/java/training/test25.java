package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by kwfm083 on 10/10/2016.
 */
public class test25 {

    @Test
    public static void test26() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whatsmyua.com/");
        String text = driver.findElement(By.id("ua-link")).getText();
        Assert.assertTrue(text.contains("Chrome"));
        driver.close();
    }
}
