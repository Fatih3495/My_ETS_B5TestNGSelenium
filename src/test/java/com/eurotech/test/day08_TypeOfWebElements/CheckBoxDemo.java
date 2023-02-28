package com.eurotech.test.day08_TypeOfWebElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {


    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sports=driver.findElement(By.cssSelector("[id='hobbies-checkbox-1']"));
        Assert.assertFalse(sports.isSelected()); // assert: false, condition: false, test: PASS

        WebElement reading=driver.findElement(By.cssSelector("[id='hobbies-checkbox-2']"));
        Assert.assertFalse(reading.isSelected()); // assert: false, condition: false, test: PASS

        WebElement music=driver.findElement(By.cssSelector("[id='hobbies-checkbox-3']"));
        Assert.assertFalse(music.isSelected()); // assert: false, condition: false, test: PASS

        // Class Task
        // complete the task
        // click all the checkbox
        // than assert that is selected or not


        WebElement sportsCheckBox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));

        Thread.sleep(2000);
        sportsCheckBox.click();
        Thread.sleep(2000);

        Assert.assertTrue(sportsCheckBox.isSelected(),"verify that sports is selected");


        driver.close();




    }

    @Test
    public void test2() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox2= driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        WebElement checkBox1= driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        Assert.assertTrue(checkBox2.isSelected(),"verify that checkbox 2 is selected");
        Assert.assertFalse(checkBox1.isSelected(),"verify that checkbox 1 is NOT selected");

        Thread.sleep(2000);
        checkBox1.click();

        Thread.sleep(2000);
        checkBox2.click();

        Assert.assertFalse(checkBox2.isSelected());
        Assert.assertTrue(checkBox1.isSelected());

        Thread.sleep(2000);

        driver.close();




    }





}
