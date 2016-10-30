package training;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/**
 * Created by kwfm083 on 10/7/2016.
 */
public class example1 {
    @Test
    public  void test1(){
        System.out.println("first test");
    }

//    @Test
//    public  void tes2(){
//        ChromeDriver driver = new ChromeDriver();
//
//    }
@Test
public void testGoogleSearch() {
    // Optional, if not specified, WebDriver will search your path for chromedriver.
    ChromeDriver driver = new ChromeDriver();
//    driver.get("http://www.google.com/xhtml");
//    Thread.sleep(5000);  // Let the user actually see something!
//    WebElement searchBox = driver.findElement(By.name("q"));
//    searchBox.sendKeys("ChromeDriver");
//    searchBox.submit();
//    Thread.sleep(5000);  // Let the user actually see something!
//    driver.quit();
}

//    ChromeOptions options = new ChromeOptions();
//    options.setBinary("c:\\Program Files (x86)\\Opera\\29.0.1795.47\\opera.exe");
//    ChromeDriver driver = new ChromeDriver(options);
}