package com.test.practice.automation.selenium.E3_pageobject._pages.tfl;

import com.test.practice.automation.selenium.E3_pageobject._pages._Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author TPD_Auto
 */

public class TFLHomePage extends _Page {

    @FindBy(id="InputFrom")
    WebElement fromStation;

    @FindBy(id="InputTo")
    WebElement toStation;

    @FindBy(css=".stop-name")
    WebElement aStop;

    @FindBy(css=".stop-name")
    List<WebElement> listOfStops;

    public TFLHomePage(WebDriver driver) {
        super(driver);
    }

    public TFLHomePage gotoJourneyPlannerPage() {
        driver.get("https://tfl.gov.uk/plan-a-journey/");
        return new TFLHomePage(driver);
    }

    public void selectFromAutoSuggestions(boolean isFromStation, String stationName) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(fromStation));
        fromStation.sendKeys(stationName);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(fromStation));
        if(isFromStation){
            Actions ac = new Actions(driver);
            ac.moveToElement(driver.findElement(By.linkText(stationName))).click().build().perform();
        }else {
            Actions ac = new Actions(driver);
            ac.moveToElement(driver.findElement(By.linkText(stationName))).click().build().perform();
        }
        System.out.println();
    }



    public void selectFromAutoSuggestionsDD(boolean isFromStation, String stationName) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(fromStation));

        if(isFromStation) {
            fromStation.sendKeys(stationName);
        }else {
            toStation.sendKeys(stationName);
        }

        //Wait for stations to appear
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(aStop));
        WebElement toClick = null;
        for(WebElement el: listOfStops){
            if (el.getText().contains(stationName)) {
                toClick = el;
                break;
            }
        }

        toClick.click();
        System.out.println();
    }
}
