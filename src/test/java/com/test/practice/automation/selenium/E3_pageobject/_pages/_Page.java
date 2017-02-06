package com.test.practice.automation.selenium.E3_pageobject._pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author TPD_Auto
 */
public class _Page {

    public WebDriver driver;

    public _Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
