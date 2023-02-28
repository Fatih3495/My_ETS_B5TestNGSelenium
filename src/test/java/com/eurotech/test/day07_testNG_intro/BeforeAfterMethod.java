package com.eurotech.test.day07_testNG_intro;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----AFTER CLASS-----");

    }
    //run once before each method @Test
    @BeforeMethod
    public void setup(){

        System.out.println("Opening The Browser");

    }
    //run once after each method @Test Annotations
    @AfterMethod
    public void tearDown(){

        System.out.println("Closing Browser");

    }
   @Test
    public void test3(){
        System.out.println("Test Case 3");
    }

    @Test
    public void test1(){

        System.out.println("First Test Case");

    }

    @Test
    public void test2(){

        System.out.println("Test Case 2");
    }

    @BeforeClass
    public void SetupClass(){
        System.out.println("------BEFORE CLASSS-----");
        System.out.println("her class da bir defa çalışır");

    }



    @Ignore @Test
    public void test4(){

        System.out.println("İgnore");
    }




}
