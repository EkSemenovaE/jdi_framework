package com.epam.controls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Created by kwfm083 on 10/28/2016.
 */
public class TextField extends  Element{
    public TextField(WebDriver driver, String text) {

        super(driver, By.xpath(text));
    }
    public void setValue(String value){
        getElement().sendKeys(value);
    }

}
