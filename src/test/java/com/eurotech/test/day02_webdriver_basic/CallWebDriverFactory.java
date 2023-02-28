package com.eurotech.test.day02_webdriver_basic;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.facebook.com");

        Thread.sleep(2000);

        driver.close();


        /**
         * Task
         * go to devEX website
         * expected title = DevEX
         * get title and verify that title is devEX
         */




    }
}
