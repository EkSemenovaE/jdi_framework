//package com.epam.uitest;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.chrome.ChromeDriverService;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import java.util.List;
//import org.testng.Assert;
///**
// * Created by kwfm083 on 10/8/2016.
// */
//public class login {
//
//    @Test
//    public static void test1()
//    {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/kwfm083/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://login.epam.com/");
//        WebElement submitButton = driver.findElement(By.name("SignInSubmit"));
//        submitButton.click();
//        WebElement userNameInputBox = driver.findElement(By.name("UserName"));
//        userNameInputBox.sendKeys("ekaterina_semenova@epam.com");
//        WebElement userPasswordBox = driver.findElement(By.name("Password"));
//        userPasswordBox.sendKeys("Skp4652129!*-5");
//        WebElement submitButtonLogin = driver.findElement(By.id("submitButton"));
//        submitButtonLogin.click();
////        WebElement submitSignInGo = driver.findElement(By.id("idp_RelyingPartyDropDownList"));
////        submitSignInGo.click();
//////        Select dropdown = new Select(driver.findElement(By.id("idp_RelyingPartyDropDownList")));
//////        dropdown.selectByVisibleText("KB");
////
//////        WebElement select = driver.findElement(By.id("idp_RelyingPartyDropDownList"));
//////        List<WebElement> options = select.findElements(By.tagName("CTC"));
//////
//////        for (WebElement option : options) {
//////
//////            if("CTC".equals(option.getText().trim()))
//////
//////                option.click();
//////        }
////
////        WebElement selectopt = driver.findElement(By.partialLinkText("KB"));
////        selectopt.sendKeys("KB");
//
//        Select opt = new Select(driver.findElement(By.id("idp_RelyingPartyDropDownList")));
//        opt.selectByVisibleText("KB");
//
//        WebElement submitSignInGo = driver.findElement(By.name("SignInGo"));
//        submitSignInGo.click();
//
////        WebElement element = driver.getCurrentUrl();
//        System.out.print("CurrentUrl = " + driver.getCurrentUrl());
//        Assert.assertEquals(driver.getCurrentUrl(), "https://kb.epam.com/index.action");
//        driver.close();
//
//    }
//
//
//
//}
//
//
//
