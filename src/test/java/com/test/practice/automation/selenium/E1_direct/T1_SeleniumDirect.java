package com.test.practice.automation.selenium.E1_direct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.BrowserConfig;

/**
 * Created by TPD_Auto on 20/01/2017.
 */
public class T1_SeleniumDirect {

    public static final String C_SELENIUM_LOCATION = "C:\\Selenium\\";

    public static void main(String[] args){

        /**
         * @todo Aim: Goto TFL website and verify the title of the page is correct, use InternetExplorer driver
         *
         * 1. Open InternetExplorer browser
         * 2. Go to tfl website : https://tfl.gov.uk
         * 3. Verify the heading is correct
         * 4. Close the browser
         */
        System.setProperty("webdriver.ie.driver", C_SELENIUM_LOCATION + "ie32\\IEDriverServer.exe");
    }
}
