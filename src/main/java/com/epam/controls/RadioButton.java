package com.epam.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kwfm083 on 10/30/2016.
 */
public class RadioButton extends Element {
    public RadioButton(WebDriver driver, String text) {

        super(driver, By.xpath(text));
    }

    public boolean isChecked(){

        return getElement().isSelected();
    }
    public void check(){

        if (!isChecked()) getElement().click();
    }
}
