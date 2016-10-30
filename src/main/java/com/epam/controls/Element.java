package com.epam.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kwfm083 on 10/17/2016.
 */
public class Element {


    By locator;
    WebElement element;
    WebDriver driver;

    public Element(WebDriver driver,By locator){
        this.driver = driver;
        this.locator = locator;
    }
    protected WebElement getElement(){
        if (element == null) {
            element = driver.findElement(locator);
        }
        return element;
    }

    public String getText(){
        return getElement().getText();
    }
    public boolean isEnabled(){
        return getElement().isEnabled();
    }
}