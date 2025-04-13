package org.myTest.pages;

import org.openqa.selenium.By;

public class ShippingPageLocators {

    protected By streetField = By.name("street[0]");
    protected By cityField = By.name("city");

    protected By stateList = By.name("region_id");

    protected By zipCodeField = By.name("postcode");

    protected By phoneNumber = By.name("telephone");

    protected By nextButton = By.cssSelector("button.button.action.continue.primary");

    protected By shippingMethod = By.cssSelector("td.col.col-method");

    protected By placeOrderButton = By.cssSelector("button.action.primary.checkout[title=\"Place Order\"]\n");

}
