package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    public static Properties prop;
    public static WebDriver driver;

    public BasePage() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties"); // Relative path
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void initialization() {
        if (prop == null) {
            new BasePage();
        }
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
    }
}
