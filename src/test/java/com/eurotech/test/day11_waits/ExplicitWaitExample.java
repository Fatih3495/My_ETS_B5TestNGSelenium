package com.eurotech.test.day11_waits;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {

    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setUp() {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,15);


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void explicitwait() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("#start>button")).click();

        WebElement helloText = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        //it will wait up to 15 seconds until hello element is visible
      wait.until(ExpectedConditions.visibilityOf(helloText));

        System.out.println("helloText.getText() = " + helloText.getText());

        Assert.assertEquals(helloText.getText(),"Hello World!");
    }

    @Test
    public void explicitwait2() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("(//button[@autocomplete='off'])[2]")).click();

        //How to wait explicitly?
        //Create an explicit object wait
        //  WebDriverWait wait=new WebDriverWait(driver,15);
        WebElement imputBox = driver.findElement(By.cssSelector("#input-example>input"));

        wait.until(ExpectedConditions.elementToBeClickable(imputBox));

        imputBox.sendKeys("Erotech");

        WebElement messageText = driver.findElement(By.cssSelector("#input-example>p"));

        System.out.println("messageText.getText() = " + messageText.getText());

        Assert.assertEquals(messageText.getText(),"It's enabled!");

    }

    @Test
    public void SeleniumVersion4() {
       //  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
       //  driver.findElement(By.tagName("button")).click();

             // used for selenium version 4
       //  WebElement helloText = new WebDriverWait(driver, Duration.ofSeconds(15))
       //    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));

       //  System.out.println("hello.getText() = " + helloText.getText());


    }
}
