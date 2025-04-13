
package org.myTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends CommonPageLocators {

    WebDriver driver;
    WebDriverWait wait;


    public CommonPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goToHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(websiteLogo)).click();
    }

    public WebElement goToCart() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(cartButton));
    }

    public void clickOnCheckoutButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(checkoutButton)).click();
    }
}
