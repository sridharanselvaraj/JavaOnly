package com.sri.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));

        //Read file
        Properties config=new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/DataDrivenFramework/src/test/resources/properties/Config.properties");
        config.load(fis);
        System.out.println(config.getProperty("browser"));

        fis =new FileInputStream(System.getProperty("user.dir")+"/DataDrivenFramework/src/test/resources/properties/OR.properties");
        config.load(fis);
        System.out.println(config.getProperty("bmlBtn"));
    }
}
