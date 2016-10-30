package settings;
/**
 * Created by kwfm083 on 10/28/2016.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//public class DriverFactory {
//    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
//    public static WebDriver getDriver (String browserName) {
//        WebDriver driver = null;
//
//        switch (browserName) {
//            case "IE":
//                driver = drivers.get("IE");
//                if (driver == null) {
//                    System.setProperty("webdriver.ie.driver",
//                      "C:\\Users\\kwfm083\\Downloads\\IEDriverServer_x64_2.53.1.exe");
//                      driver = new InternetExplorerDriver();
//                    drivers.put("IE", driver);
//                }
//                break;
//            case "Chrome":
//                driver = drivers.get("Chrome");
//                if (driver == null) {
//                    System.setProperty("webdriver.chrome.driver",
//                            "C:/Users/kwfm083/chromedriver.exe");
//                    driver = new ChromeDriver();
//                    drivers.put("Chrome", driver);
//                }
//                break;
//        }
//        return driver;
//    }
//
//
//}


//public class DriverFactory {
//    private final static String CHROME = "chrome";
//    private final static String FIREFOX = "firefox";
//
//    public static WebDriver createProxyDriver(String type, Proxy proxy, String path) {
//        if (type.equalsIgnoreCase(CHROME)) return createChromeDriver(createProxyCapabilities(proxy), path);
//        else if (type.equalsIgnoreCase(FIREFOX)) return createFirefoxDriver(createProxyCapabilities(proxy));
//        throw new RuntimeException("Unknown WebDriver browser: "+type);
//    }
//
//    public static WebDriver createChromeDriver(DesiredCapabilities capabilities, String path) {
//        System.setProperty("webdriver.chrome.driver", path);
//        if (capabilities != null) {
//            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//            return new ChromeDriver(capabilities);
//        } else return new ChromeDriver();
//
//    }
//
//    public static WebDriver createFirefoxDriver(DesiredCapabilities capabilities) {
//        if (capabilities != null) {
//            return new FirefoxDriver(capabilities);
//        }
//
//        ProfilesIni allProfiles = new ProfilesIni();
//        FirefoxProfile myProfile = allProfiles.getProfile("WebDriver");
//        if (myProfile == null) {
//            File ffDir = new File(System.getProperty("user.dir")+ File.separator+"ffProfile");
//            if (!ffDir.exists()) {
//                ffDir.mkdir();
//            }
//            myProfile = new FirefoxProfile(ffDir);
//        }
//        myProfile.setAcceptUntrustedCertificates(true);
//        myProfile.setAssumeUntrustedCertificateIssuer(true);
//        myProfile.setPreference("webdriver.load.strategy", "unstable");
//        if (capabilities == null) {
//            capabilities = new DesiredCapabilities();
//        }
//        capabilities.setCapability(FirefoxDriver.PROFILE, myProfile);
//        return new FirefoxDriver(capabilities);
//    }
//
//    public static DesiredCapabilities createProxyCapabilities(Proxy proxy) {
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability("proxy", proxy);
//        return capabilities;
//    }
//
//}

//    private static ChromeDriver driverChrome;
//    private static OperaDriver driverOpera;
//    private static InternetExplorerDriver driverIExplorer;
//
//    private static ChromeDriver chrome() {
//        if (driverChrome == null) {
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-extensions");
//            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//            driverChrome = new ChromeDriver(capabilities);
//            driverChrome.manage().window().maximize();
//        }
//        return driverChrome;
//    }
//
//    private static OperaDriver opera() {
//        if (driverOpera == null) {
//            driverOpera = new OperaDriver();
//            driverOpera.manage().window().maximize();
//        }
//        return driverOpera;
//    }
//
//    ;
//
//    private static InternetExplorerDriver iExplorer() {
//        if (driverIExplorer == null) {
//            driverIExplorer = new InternetExplorerDriver();
//            driverIExplorer.manage().window().maximize();
//        }
//        return driverIExplorer;
//    }
//
//    public static WebDriver getDriver(String browserName){
//        switch (browserName.equals("chrome")){
//            return chrome();
//        } else if(browserName.equals("opera")){
//            return opera();
//        } else if (browserName.equals("iexplorer")) {
//            return iExplorer();
//        } else {
//            throw new InvalidArgumentException("Invalid browser name.");
//        }
//    }

public class DriverFactory {

    private static ChromeDriver driverChrome;
    private static OperaDriver driverOpera;
    private static InternetExplorerDriver driverIExplorer;


    private static ChromeDriver chrome(){
        if (driverChrome == null){
            System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY,options);
            driverChrome = new ChromeDriver(capabilities);
            driverChrome.manage().window().maximize();


        }
        return driverChrome;
    }

    private static OperaDriver opera(){
        if (driverOpera == null){
            driverOpera = new OperaDriver();
            driverOpera.manage().window().maximize();
        }
        return driverOpera;
    }
    private static InternetExplorerDriver iExplorer(){
        if (driverIExplorer ==null){
            driverIExplorer = new InternetExplorerDriver();
            driverIExplorer.manage().window().maximize();
        }
        return driverIExplorer;
    }
    public static WebDriver getDriver(String browserName){
        if (browserName.equals("chrome")){
            return chrome();
        } else if(browserName.equals("opera")){
            return opera();
        } else if (browserName.equals("iexplorer")) {
            return iExplorer();
        } else {
            throw new RuntimeException("Browser not recognized.");
        }

        //        switch (browserName) {
//            case "IE":
//                driver = drivers.get("IE");
//                if (driver == null) {
//                    System.setProperty("webdriver.ie.driver",
//                      "C:\\Users\\kwfm083\\Downloads\\IEDriverServer_x64_2.53.1.exe");
//                      driver = new InternetExplorerDriver();
//                    drivers.put("IE", driver);
//                }
//                break;
//            case "Chrome":
//                driver = drivers.get("Chrome");
//                if (driver == null) {
//                    System.setProperty("webdriver.chrome.driver",
//                            "C:/Users/kwfm083/chromedriver.exe");
//                    driver = new ChromeDriver();
//                    drivers.put("Chrome", driver);
//                }
//                break;
//        }
//        return driver;
    }

}