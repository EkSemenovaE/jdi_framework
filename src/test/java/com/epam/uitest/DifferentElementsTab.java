package com.epam.uitest;
import com.epam.controls.Checkbox;
import com.epam.controls.LoginForm;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import settings.Configuration;
import org.testng.annotations.Test;

/**
 * Created by kwfm083 on 10/30/2016.
 */
public class DifferentElementsTab {
    private WebDriver driver;
    private  Checkbox waterCheckbox;
    private  Checkbox earthCheckbox;
    private  Checkbox windCheckbox;
    private  Checkbox fireCheckbox;

    @BeforeClass
    public void before(){
        Configuration config = Configuration.getInstance();
        driver = config.getWebDriver();
        LoginForm authorization = new LoginForm(driver);
        authorization.typeUsername("epam");
        authorization.typePassword("1234");
        authorization.submitLoginForm();
        driver.get(config.getLoginPageURL());

    }

    @Test(testName = "CheckboxCheckEnabledTest")
    public void CheckboxTest(){
        waterCheckbox.isEnabled();
        earthCheckbox.isEnabled();
        windCheckbox.isEnabled();
        fireCheckbox.isEnabled();
    }
//
//    @BeforeMethod
//    public void beforeMethod() throws InterruptedException {
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//        initCheckboxes();
//    }
//
//    @Test(testName = "CheckboxSelectedTest", dataProviderClass = Provider.class, dataProvider = "checkboxTest")
//    public void SelectedTest(boolean water, boolean earth, boolean wind, boolean fire){
//
//        waterCheckbox.toggleCheckbox(water);
//        earthCheckbox.toggleCheckbox(earth);
//        windCheckbox.toggleCheckbox(wind);
//        fireCheckbox.toggleCheckbox(fire);
//
//        Assert.assertEquals(water, waterCheckbox.isChecked());
//        Assert.assertEquals(earth, earthCheckbox.isChecked());
//        Assert.assertEquals(wind, windCheckbox.isChecked());
//        Assert.assertEquals(fire, fireCheckbox.isChecked());
//    }
//
//    private void initCheckboxes(){
//        waterCheckbox = new Checkbox(driver,"//label[contains(., 'Water')]//input[@type='checkbox']");
//        earthCheckbox = new Checkbox(driver,"//label[contains(., 'Earth')]//input[@type='checkbox']");
//        windCheckbox = new Checkbox(driver,"//label[contains(., 'Wind')]//input[@type='checkbox']");
//        fireCheckbox = new Checkbox(driver,"//label[contains(., 'Fire')]//input[@type='checkbox']");
//    }
}
