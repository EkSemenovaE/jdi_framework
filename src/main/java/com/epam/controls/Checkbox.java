package com.epam.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kwfm083 on 10/17/2016.
 */
public class Checkbox extends  Element {
    public Checkbox(WebDriver driver, String text){

        super(driver,By.xpath(text));
    }

    public boolean isChecked(){

        return getElement().isSelected();
    }
    public void check(){

        if (!isChecked()) getElement().click();
    }
    public void uncheck(){

        if (isChecked()) getElement().click();
    }
}

//label[contains(., 'Water']