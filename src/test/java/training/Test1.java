//package com.epam.uitest;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.openqa.selenium.Keys;
//import org.testng.annotations.AfterTest;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.AssertJUnit;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;
//
//
//public class Test1 {
//
//    @Test(dataProviderClass=LoginData.class, dataProvider = "login")
//    public void loginTest(boolean positive, String login, String password){
//        login(positive,login,password);
//        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://login.epam.com/");
//        WebElement submitButton = driver.findElement(By.name("SignInSubmit"));
//        submitButton.click();
//        WebElement userNameInputBox = driver.findElement(By.name("UserName"));
//        userNameInputBox.sendKeys(login);
//        WebElement userPasswordBox = driver.findElement(By.name("Password"));
//        userPasswordBox.sendKeys(password);
//        WebElement submitButtonLogin = driver.findElement(By.id("submitButton"));
//        submitButtonLogin.click();
//    }
//
//    @BeforeTest
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://jdi-framework.github.io/tests/index.htm");
//    }
//
//
//
//    @Test(dataProviderClass = Datas.class, dataProvider = "LoginEpam")
//    public void Test1() {
//
//        }
//
//    }
//
//
//
