package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.CarsGuideHomePage;
import pages.utils.SeleniumDriver;

public class CarsGuideHomePageAction {

    CarsGuideHomePage carsGuideHomePage = null;

    public CarsGuideHomePageAction() {
        this.carsGuideHomePage = new CarsGuideHomePage();
        PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePage);
    }

    public void moveToCarsForSaleMenu() {

        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(carsGuideHomePage.carsForSaleLink).perform();
    }

    public void clickOnSearchCarsMenu() {
        carsGuideHomePage.searchCarsLink.click();
    }

    public void clickOnUsedCarsSearchMenu() {
        // carsGuideHomePage.u
    }

    public void moveToSellMyCarMenu() {
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(carsGuideHomePage.sellMyCarLink).perform();
    }
}
