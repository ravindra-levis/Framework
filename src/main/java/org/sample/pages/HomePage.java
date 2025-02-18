package org.sample.pages;

import locators.HomePageLoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sample.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super();
        this.driver=driver;
    }
    public void Login(){
        WebElement userName= driver.findElement(HomePageLoc.USERNAME);
        userName.sendKeys();
    }
}
