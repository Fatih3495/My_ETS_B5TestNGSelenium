package com.eurotech.test.day07_testNG_intro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {
 /*  -open chrome browser
   -go to https://www.facebook.com/
   -enter fake username
   -enter fake password
   -click login button
   -verify not that login successfully
   */

    WebDriver driver;
   @BeforeMethod
   public void setup(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();

   }
   @AfterMethod
    public void tearDown(){
       driver.close();
   }
   @Test
    public void facebookLogin() throws InterruptedException {
       driver.get("https://www.facebook.com/");
       driver.findElement(By.id("email")).sendKeys("absc@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("123456hj");
       driver.findElement(By.name("login")).click();

     String expectedMessage="Bu senin hesabın mı?";
     Thread.sleep(2000);
     String actualMessage=driver.findElement(By.className("_9kpn")).getText();
     System.out.println("actualMessage = " + actualMessage);

     Assert.assertEquals(actualMessage,expectedMessage);

   }


}
