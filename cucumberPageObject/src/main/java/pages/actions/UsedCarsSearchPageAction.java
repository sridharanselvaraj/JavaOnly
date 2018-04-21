package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.UsedCarSearchPage;
import pages.utils.SeleniumDriver;

public class UsedCarsSearchPageAction {

    public static UsedCarSearchPage usedCarSearchPage=null;

    public UsedCarsSearchPageAction()
    {
        this.usedCarSearchPage=new UsedCarSearchPage();
        PageFactory.initElements(SeleniumDriver.getDriver(),usedCarSearchPage);
    }

    public void selectCarMake(String carBrand)
    {
        Select selectCarMaker=new Select(usedCarSearchPage.carMakeDropDown);
        selectCarMaker.selectByVisibleText(carBrand);
    }
    public void selectCarModel(String carModel)
    {
        Select selectCarMaker=new Select(usedCarSearchPage.selectModelDropDown);
        selectCarMaker.selectByVisibleText(carModel);
    }
    public void selectCarLocation(String carLocation)
    {
        Select selectCarMaker=new Select(usedCarSearchPage.selectLocationDropDown);
        selectCarMaker.selectByVisibleText(carLocation);
    }
    public void selectCarPrice(String carPrice)
    {
        Select selectCarMaker=new Select(usedCarSearchPage.priceDropDown);
        selectCarMaker.selectByVisibleText(carPrice);
    }

    public void clickOnFindMyNextCarButton()
    {
        usedCarSearchPage.searchSubmit.click();
    }

}

