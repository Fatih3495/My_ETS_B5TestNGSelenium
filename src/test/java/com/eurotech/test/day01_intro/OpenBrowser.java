package com.eurotech.test.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {

    public static void main(String[] args) {


        //We have to enter this line every time we want to open chrome/firefox/safari...
        WebDriverManager.chromedriver().setup();


        //WEBDRIVER represent the browser
        //we are creating  driver for chrome browser

        WebDriver driver=new ChromeDriver(); // polymorphism   // --> this part will open chrome browser

            // firefox example
            // WebDriverManager.firefoxdriver().setup();
            //WebDriver driver=new FirefoxDriver();

        driver.get("https://www.eurotechstudy.com/");

    }

}
