package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.CarSearchPage;
import pages.utils.SeleniumDriver;

public class CarsSearchPageActions {

    CarSearchPage carsSearchPage=null;

    public CarsSearchPageActions() {
        this.carsSearchPage=new CarSearchPage();
        PageFactory.initElements(SeleniumDriver.getDriver(),carsSearchPage);
    }
    public void selectCarMake(String carBrand)
    {
        Select selectCarMaker=new Select(carsSearchPage.carMakeDropDown);
        selectCarMaker.selectByVisibleText(carBrand);
    }
    public void selectCarModel(String carModel)
    {
        Select selectCarMaker=new Select(carsSearchPage.selectModelDropDown);
        selectCarMaker.selectByVisibleText(carModel);
    }
    public void selectCarLocation(String carLocation)
    {
        Select selectCarMaker=new Select(carsSearchPage.selectLocationDropDown);
        selectCarMaker.selectByVisibleText(carLocation);
    }
    public void selectCarPrice(String carPrice)
    {
        Select selectCarMaker=new Select(carsSearchPage.priceDropDown);
        selectCarMaker.selectByVisibleText(carPrice);
    }

    public void clickOnFindMyNextCarButton()
    {
        carsSearchPage.searchSubmit.click();
    }

}
