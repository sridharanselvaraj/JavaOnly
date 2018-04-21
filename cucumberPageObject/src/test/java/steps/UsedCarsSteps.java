package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.actions.CarsGuideHomePageAction;
import pages.actions.CarsSearchPageActions;
import pages.actions.UsedCarsSearchPageAction;
import pages.locators.UsedCarSearchPage;

import java.util.List;

public class UsedCarsSteps {

    CarsGuideHomePageAction carsGuideHomePageAction=new CarsGuideHomePageAction();
    UsedCarsSearchPageAction usedCarsSearchPageAction=new UsedCarsSearchPageAction();



    @And("^click on \"([^\"]*)\" link on Used Search Car Page$")
    public void clickOnLinkOnUsedSearchCarPage(String arg0) throws Throwable {
      carsGuideHomePageAction.clickOnUsedCarsSearchMenu();
    }

    @And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown on Used Search Car Page$")
    public void select_carbrand_as_from_AnyMake_dropdown_on_Used_Search_Car_Page(String carBrand) throws Throwable {
        usedCarsSearchPageAction.selectCarMake(carBrand);
    }

    @And("^select car model on Used Search Car Page$")
    public void select_car_model_on_Used_Search_Car_Page(List<String> list) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        String menu=list.get(1);
        usedCarsSearchPageAction.selectCarModel(menu);
    }

    @And("^select location as \"([^\"]*)\" from SelectLocation dropdown on Used Search Car Page$")
    public void select_location_as_from_SelectLocation_dropdown_on_Used_Search_Car_Page(String location) throws Throwable {
        usedCarsSearchPageAction.selectCarLocation(location);
    }

    @And("^select price as \"([^\"]*)\" from price dropdown on Used Search Car Page$")
    public void select_price_as_from_price_dropdown_on_Used_Search_Car_Page(String price) throws Throwable {
      usedCarsSearchPageAction.selectCarPrice(price);
    }

    @And("^click on Find_My_Next_Car button on Used Search Car Page$")
    public void click_on_Find_My_Next_Car_button_on_Used_Search_Car_Page() throws Throwable {
      usedCarsSearchPageAction.clickOnFindMyNextCarButton();
    }

    @Then("^I should see list of searched cars on Used Search Car Page$")
    public void i_should_see_list_of_searched_cars_on_Used_Search_Car_Page() throws Throwable {
        System.out.println("Used car list populated");
    }


}
