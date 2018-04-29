package com.sri.testcases;

import com.sri.base.TestBase;
import com.sri.utils.TestUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class AddCustomerTest extends TestBase {

    @Test(dataProviderClass = TestUtil.class,dataProvider = "dp")
    public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException {

        if(!data.get("runmode").equalsIgnoreCase("Y"))
        {
            throw new SkipException("Skipping the test as the Run mode is N");
        }

        click("addCustBtn_CSS");
        type("firstname_CSS",data.get("firstname"));
        type("lastname_XPATH",data.get("lastname"));
        type("postcode_CSS",data.get("postcode"));
        click("addBtn_CSS");
        Alert alert=wait.until(alertIsPresent());
        Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
    }

}
