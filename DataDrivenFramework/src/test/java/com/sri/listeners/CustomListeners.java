package com.sri.listeners;

import com.relevantcodes.extentreports.LogStatus;
import com.sri.base.TestBase;
import com.sri.utils.TestUtil;
import org.testng.*;

import java.io.IOException;

public class CustomListeners extends TestBase implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

        test=reports.startTest(iTestResult.getName().toUpperCase());
        //runmodes -Y

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        test.log(LogStatus.PASS,iTestResult.getName().toUpperCase()+" PASS");
        reports.endTest(test);
        reports.flush();
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.setProperty("org.uncommons.reportng.escape-output", "false");
        try {
            TestUtil.captureScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.log(LogStatus.FAIL,iTestResult.getName().toUpperCase()+" Failed with exception :"+iTestResult.getThrowable());
        test.log(LogStatus.FAIL,test.addScreenCapture(TestUtil.screenshotName));

        Reporter.log("Click to see Screenshot");
        Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">ScreenShot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=200 width=200></img></a>");

        reports.endTest(test);
        reports.flush();

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        test.log(LogStatus.SKIP,iTestResult.getName().toUpperCase()+" Skipped the runner test ");
        reports.endTest(test);
        reports.flush();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
