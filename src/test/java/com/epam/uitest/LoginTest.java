package com.epam.uitest;
import com.epam.controls.LoginForm;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import settings.Configuration;

/**
 * Created by kwfm083 on 10/28/2016.
 */
public class LoginTest {
    private WebDriver driver;
    private LoginForm loginForm;

    @BeforeSuite
    public void before(){
        driver = Configuration.getInstance().getWebDriver();
    }

    @Test(testName = "loginTest",dataProviderClass = Provider.class, dataProvider = "loginTest")
    public void loginTest(boolean key, String login, String pass, String result) throws InterruptedException {

        LoginForm authorization = new LoginForm(driver);
        authorization.typeUsername(login);
        authorization.typePassword(pass);
        authorization.submitLoginForm();

        if (key) {
            Assert.assertTrue(authorization.logoutAvailable());
            Assert.assertTrue(authorization.profileNameEquals(result));
        } else {
            Assert.assertTrue(authorization.loginResultEquals(result));
        }
    }

}
