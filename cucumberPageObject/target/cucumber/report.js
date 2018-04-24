$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 3,
  "name": "Acceptance testing to validate Search cars page is working",
  "description": "In order to validate that\r\nthe search cars page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 5194632059,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on the Home page \"http://www.carsguide.com.au\" of carsguide website",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I move to the Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 12
    },
    {
      "cells": [
        "Cars for Sale"
      ],
      "line": 13
    },
    {
      "cells": [
        "Sell My Car"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select carbrand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select carmodel as \"1 SERIES\" from SelectModel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select location as \"Australia\" from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select price as \"$1,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the page title should be \"Bmw 1 Series Cars Under 1000 for Sale | CarsGuide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_Home_page_of_carsguide_website(String)"
});
formatter.result({
  "duration": 6180092656,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_the_Menu(String\u003e)"
});
formatter.result({
  "duration": 253925229,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCarsSteps.click_on_link(String)"
});
formatter.result({
  "duration": 5536440273,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_carbrand_as_from_AnyMake_dropdown(String)"
});
formatter.result({
  "duration": 243862227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 SERIES",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_carmodel_as_from_SelectModel_dropdown(String)"
});
formatter.result({
  "duration": 314858035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_location_as_from_SelectLocation_dropdown(String)"
});
formatter.result({
  "duration": 251827990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 17
    }
  ],
  "location": "SearchCarsSteps.select_price_as_from_price_dropdown(String)"
});
formatter.result({
  "duration": 244989931,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 5934289547,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 88140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Cars Under 1000 for Sale | CarsGuide",
      "offset": 26
    }
  ],
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 10703523,
  "status": "passed"
});
formatter.after({
  "duration": 3346127656,
  "status": "passed"
});
formatter.uri("UsedCarsSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Search cars page is working",
  "description": "In order to validate that\r\nthe search cars page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Used-Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 3320560543,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate used search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working;validate-used-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Used-Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Home page \"http://www.carsguide.com.au\" of carsguide website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to the Menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "Cars for Sale"
      ],
      "line": 12
    },
    {
      "cells": [
        "Sell My Car"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on \"Used Search Cars\" link on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select carbrand as \"AUDI\" from AnyMake dropdown on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select car model on Used Search Car Page",
  "rows": [
    {
      "cells": [
        "carModel"
      ],
      "line": 17
    },
    {
      "cells": [
        "A4"
      ],
      "line": 18
    },
    {
      "cells": [
        "A3"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select location as \"SA - All\" from SelectLocation dropdown on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select price as \"$2,000\" from price dropdown on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on Find_My_Next_Car button on Used Search Car Page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see list of searched cars on Used Search Car Page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "the page title should be \"Audi A4 Cars Under 2000 for Sale SA | CarsGuide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_Home_page_of_carsguide_website(String)"
});
formatter.result({
  "duration": 6300287842,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_the_Menu(String\u003e)"
});
formatter.result({
  "duration": 338661148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Search Cars",
      "offset": 10
    }
  ],
  "location": "UsedCarsSteps.clickOnLinkOnUsedSearchCarPage(String)"
});
formatter.result({
  "duration": 4152218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUDI",
      "offset": 20
    }
  ],
  "location": "UsedCarsSteps.select_carbrand_as_from_AnyMake_dropdown_on_Used_Search_Car_Page(String)"
});
formatter.result({
  "duration": 402798974,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.select_car_model_on_Used_Search_Car_Page(String\u003e)"
});
formatter.result({
  "duration": 253349303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SA - All",
      "offset": 20
    }
  ],
  "location": "UsedCarsSteps.select_location_as_from_SelectLocation_dropdown_on_Used_Search_Car_Page(String)"
});
formatter.result({
  "duration": 266661394,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,000",
      "offset": 17
    }
  ],
  "location": "UsedCarsSteps.select_price_as_from_price_dropdown_on_Used_Search_Car_Page(String)"
});
formatter.result({
  "duration": 237950236,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.click_on_Find_My_Next_Car_button_on_Used_Search_Car_Page()"
});
formatter.result({
  "duration": 4359163253,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.i_should_see_list_of_searched_cars_on_Used_Search_Car_Page()"
});
formatter.result({
  "duration": 106854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi A4 Cars Under 2000 for Sale SA | CarsGuide",
      "offset": 26
    }
  ],
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 10033420,
  "status": "passed"
});
formatter.after({
  "duration": 3236699379,
  "status": "passed"
});
});