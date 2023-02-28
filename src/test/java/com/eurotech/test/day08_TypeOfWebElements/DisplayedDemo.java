package com.eurotech.test.day08_TypeOfWebElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");


        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        WebElement hello = driver.findElement(By.xpath("//*[text()='Hello World!']"));
        System.out.println("hello.isDisplayed() = " + hello.isDisplayed());

        Assert.assertFalse(hello.isDisplayed(), "verify that element is NOT displayed");
        startButton.click();

        Thread.sleep(5000);
        Assert.assertTrue(hello.isDisplayed(),"Verify that element is DISPLAYED");
        System.out.println("hello.getText() = " + hello.getText());


        driver.close();
    }
    @Test
    public void test2() throws InterruptedException {

        //https://the-internet.herokuapp.com/dynamic_loading

        //Homework

        //Example 2: Element rendered after the fact -->click
        //click that element
        //verify that hello world is not displayed
        //click start button
        //verify that hello element is displayed
        //and verify that "Hello World!" text is present


        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        Thread.sleep(6000);


        WebElement hello = driver.findElement(By.xpath("//*[text()='Hello World!']"));

        //Assert.assertFalse(hello.isDisplayed(),"Verify that element is NOT displayed");

        Assert.assertTrue(hello.isDisplayed(),"verify that element is displayed");

        driver.close();




    }





}
