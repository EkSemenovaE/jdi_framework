package com.epam.controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import settings.Configuration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Created by kwfm083 on 10/28/2016.
 */
public class LoginForm {
    private WebDriver driver;
    private WebElement loginFailed, profileName;
    private Button logo, profileButton, loginSubmitButton, logoutSubmitButton;
    private TextField loginField,passwordField;

    public LoginForm(WebDriver driver){
        this.driver = driver;

        String loginUrl = Configuration.getInstance().getLoginPageURL();
        driver.get(loginUrl);
        new WebDriverWait(driver,2).until(visibilityOfElementLocated(By.id("epam_logo")));
        initElements();

        profileButton.click();
    }
    public void typeUsername(String login) {
        loginField.setValue(login);
    }

    public void typePassword(String password) {
        passwordField.setValue(password);
    }
    public void submitLoginForm(){
        loginSubmitButton.click();
    }

    public boolean loginResultEquals(String loginResult){
        return loginFailed.getText().equals(loginResult);
    }

    public boolean profileNameEquals(String expectedName){
        return profileName.getText().equals(expectedName);
    }

    public boolean logoutAvailable(){
        return logoutSubmitButton.isEnabled();
    }

    private void initElements() {
        logo = new Button(driver,"//div[contains(@id, 'epam_logo')]");
        profileButton = new Button(driver, "//div[contains(@class, 'profile-photo')]");
        loginField = new TextField(driver,"//input[contains(@id, 'Login')]");
        passwordField = new TextField(driver,"//input[contains(@id, 'Password')]");
        loginSubmitButton = new Button(driver,"//button[contains(@type, 'submit')]");
        logoutSubmitButton = new Button(driver,"//div[contains(@class, 'logout')]");
        loginFailed = driver.findElement(By.xpath("//span[contains(@class, 'login-txt')]"));
        profileName = driver.findElement(By.xpath("//div[contains(@class, 'profile-photo')]/span"));
    }

}
