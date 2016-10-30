package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by kwfm083 on 10/8/2016.
 */
public class loginJDI {

    @Test
    public static void test30()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jdi-framework.github.io/tests/index.htm");
        driver.findElement(By.xpath("//*[@class='profile-photo']")).click();
        driver.findElement(By.id("Login")).sendKeys("epam");
        driver.findElement(By.id("Password")).sendKeys("1234");
        driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);




    }



}



