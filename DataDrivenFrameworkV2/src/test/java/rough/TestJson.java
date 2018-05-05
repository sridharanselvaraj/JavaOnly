package rough;

import utils.JsonReader;

import java.io.IOException;

public class TestJson {
    public static void main(String[] args) throws IOException {
        JsonReader jsonReader=new JsonReader(System.getProperty("user.dir")+"/DataDrivenFrameworkV2/src/test/resources/locators/OR.json");
        System.out.println(jsonReader.getLocator("locators.homepage.username.css"));

    }
}
