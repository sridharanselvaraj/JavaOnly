package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePage {

    @FindBy(how=How.LINK_TEXT,using = "Cars For Sale")
    public WebElement carsForSaleLink;

    @FindBy(how =How.LINK_TEXT,using = "Sell My Car")
    public WebElement sellMyCarLink;

    @FindBy(how =How.LINK_TEXT,using = "Car Reviews")
    public WebElement carReviewsLink;

//    @FindBy(how =How.LINK_TEXT,using = "Car Reviews")
//    public WebElement carReviewsLink;

    @FindBy(how =How.LINK_TEXT,using = "Search Cars")
    public WebElement searchCarsLink;





}
