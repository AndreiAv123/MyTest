package org.myTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage extends ShippingPageLocators{
    WebDriverWait wait;

    public ShippingPage(WebDriverWait wait) {
        this.wait = wait;
    }

    public void addStreetAddress(String streetAddress) {
        wait.until(ExpectedConditions.presenceOfElementLocated(streetField)).sendKeys(streetAddress);
    }

    public void addCityField(String city) {
        wait.until(ExpectedConditions.presenceOfElementLocated(cityField)).sendKeys(city);
    }

    public WebElement stateList() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(stateList));
    }

    public void addZipCode(String zipCode) {
        wait.until(ExpectedConditions.presenceOfElementLocated(zipCodeField)).sendKeys(zipCode);
    }

    public void addPhoneNumber(String telephoneNumber) {
        wait.until(ExpectedConditions.presenceOfElementLocated(phoneNumber)).sendKeys(telephoneNumber);
    }

    public void clickOnNextButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(nextButton)).click();
    }

    public void clickOnShippingMethod() {
        wait.until(ExpectedConditions.presenceOfElementLocated(shippingMethod)).click();
    }

    public void clickOnPlaceOrder() {
        wait.until(ExpectedConditions.presenceOfElementLocated(placeOrderButton)).click();
    }
}
