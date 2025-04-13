package org.myTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends HomePageLocators {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public WebElement getHomePageMainText() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(homePageMainText));
    }

    public List<WebElement> getProductList() {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productList));
    }


}
