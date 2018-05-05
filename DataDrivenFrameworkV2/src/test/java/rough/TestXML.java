package rough;

import utils.XMLReader;

public class TestXML {

    public static void main(String[] args) {
        XMLReader xmlReader=new XMLReader(System.getProperty("user.dir")+"/DataDrivenFrameworkV2/src/test/resources/locators/OR.xml");
        System.out.println(xmlReader.getLocator("username.xpath"));

        //findElement *By.xpath(xml.getLocator("homePage.header.username.css"))).sendKeys("Test");

    }
}
