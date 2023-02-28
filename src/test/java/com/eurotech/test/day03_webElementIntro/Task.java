package com.eurotech.test.day03_webElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task {
    public static void main(String[] args) {
    /*
        -open Chrome browser
        -go to https://www.amazon.com
        -enter 'Java' in the search button
        -click on search  button
        -verify that title has changed
         */
        // -open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

       // -go to https://www.amazon.com
        driver.get("https://www.amazon.com.tr");

        //-enter 'Java' in the search button

       // -click on search  button

        // -verify that title has changed

    }
}
