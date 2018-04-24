$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("carSearch.feature");
formatter.feature({
  "line": 1,
  "name": "validation of car search page",
  "description": "In order to validate car search\r\nas a buyer\r\nI navigate http://www.carsguild.co.au",
  "id": "validation-of-car-search-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4858194926,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Searching for a new car",
  "description": "",
  "id": "validation-of-car-search-page;searching-for-a-new-car",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the home page http://www.carsguild.co.au of carsguide website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I move to Car for Sale Menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Search Cars",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select Make as \"BMW\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Model as \"1 SERIES\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select location as \"Australia\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select price as \"$10,000\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Find My Next Car button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see list of searched cars from \"BMW\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the page title should be \"Bmw 1 Series Cars Under 10000 for Sale | CarsGuide\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.i_am_on_the_home_page_http_www_carsguild_co_au_of_carsguide_website()"
});
formatter.result({
  "duration": 13721262883,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.i_move_to_Car_for_Sale_Menu()"
});
formatter.result({
  "duration": 106638599,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.i_click_on_Search_Cars()"
});
formatter.result({
  "duration": 8084360421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 18
    }
  ],
  "location": "CarSearchSteps.i_select_Make_as(String)"
});
formatter.result({
  "duration": 150092003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 SERIES",
      "offset": 19
    }
  ],
  "location": "CarSearchSteps.i_select_Model_as(String)"
});
formatter.result({
  "duration": 3171046880,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 22
    }
  ],
  "location": "CarSearchSteps.i_select_location_as(String)"
});
formatter.result({
  "duration": 254595330,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$10,000",
      "offset": 19
    }
  ],
  "location": "CarSearchSteps.i_select_price_as(String)"
});
formatter.result({
  "duration": 191429455,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.i_click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 8271364183,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 41
    }
  ],
  "location": "CarSearchSteps.i_should_see_list_of_searched_cars(String)"
});
formatter.result({
  "duration": 69475099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Cars Under 10000 for Sale | CarsGuide",
      "offset": 26
    }
  ],
  "location": "CarSearchSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 10758459,
  "status": "passed"
});
formatter.after({
  "duration": 1438476176,
  "status": "passed"
});
});