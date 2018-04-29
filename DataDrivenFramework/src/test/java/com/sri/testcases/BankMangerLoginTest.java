package com.sri.testcases;

import com.sri.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class BankMangerLoginTest extends TestBase {

    @Test
    public void bankManagerLoginTest() throws InterruptedException, IOException {

        verifyEquals("abc", "xyz");
        Thread.sleep(3000);

        log.debug("Inside Login Test");
        click("bmlBtn_CSS");
        sleep(3000);
        Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Login not Successfully");
        log.debug("Login page Opened Successfully");


    }
}
