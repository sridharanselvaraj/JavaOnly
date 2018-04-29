package com.sri.testcases;

import com.sri.base.TestBase;
import com.sri.utils.TestUtil;
import org.openqa.selenium.Alert;

import org.testng.annotations.Test;

import java.util.Hashtable;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class OpenAccountTest extends TestBase {


    @Test(dataProviderClass = TestUtil.class,dataProvider = "dp")
    public void openAccountTest(Hashtable<String,String> data) throws InterruptedException
    {


        click("openaccount_CSS");
        select("customer_CSS",data.get("customer"));
        select("currency_CSS",data.get("currency"));
        click("process_CSS");
        Thread.sleep(2000);
        Alert alert=wait.until(alertIsPresent());
        alert.accept();

    }



}
