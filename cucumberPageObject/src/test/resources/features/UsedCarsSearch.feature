@Used-Search-Cars
Feature: Acceptance testing to validate Search cars page is working
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate used search cars page
    Given I am on the Home page "http://www.carsguide.com.au" of carsguide website
    When I move to the Menu
      |Menu|
      |Cars for Sale|
      |Sell My Car  |
    And click on "Used Search Cars" link on Used Search Car Page
    And select carbrand as "AUDI" from AnyMake dropdown on Used Search Car Page
    And select car model on Used Search Car Page
    | carModel |
    | A4       |
    | A3        |
    And select location as "SA - All" from SelectLocation dropdown on Used Search Car Page
    And select price as "$2,000" from price dropdown on Used Search Car Page
    And click on Find_My_Next_Car button on Used Search Car Page
    Then I should see list of searched cars on Used Search Car Page
    And the page title should be "Audi A4 Cars Under 2000 for Sale SA | CarsGuide"