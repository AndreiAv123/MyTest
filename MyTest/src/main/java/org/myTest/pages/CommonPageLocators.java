package org.myTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPageLocators {

    private WebDriver driver;

    protected By websiteLogo = By.xpath("//a[@class='logo']");
    protected By cartButton = By.cssSelector("a.action.showcart");
    protected By checkoutButton = By.id("top-cart-btn-checkout");

}
