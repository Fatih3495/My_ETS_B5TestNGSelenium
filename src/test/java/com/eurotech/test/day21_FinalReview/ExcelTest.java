package com.eurotech.test.day21_FinalReview;

import com.eurotech.pages.LoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest extends TestBase {

    /**Class Task
     * create test data with Swag labs user credentials and Product page for verify by using Excel
     * and execute this data set with extendReports
     * Hint :  use product page title to verify
     */

    @DataProvider
    public Object[][] dataUser() {
        ExcelUtil testData = new ExcelUtil("src/test/resources/Mappe3.xlsx", "Tabelle1");
        return testData.getDataArrayWithoutFirstRow();
    }

    @Test(dataProvider = "dataUser")
    public void testDemo(String username, String password) {


        LoginPage loginPage = new LoginPage();
        extentLogger = report.createTest( username+"'s Login Test");


        extentLogger.info("Click Understand button");
        loginPage.understandButton_loc.click();

        extentLogger.info("Enter username");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter password");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click login button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify that Page");
        Assert.assertEquals(loginPage.productsText.getText(),"PRODUCTS");

        extentLogger.pass("PASSED");

    }

}
