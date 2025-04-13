package org.myTest.pages;

import org.openqa.selenium.By;

public class ProductPageLocators {

    protected By productSizeList = By.cssSelector(".swatch-attribute.size .swatch-option.text");
    protected By productColorList = By.cssSelector(".swatch-attribute.color .swatch-option.color");
    protected By productQtyField = By.id("qty");
    protected By addToCartButton = By.id("product-addtocart-button");
    protected By noQtyMessage = By.cssSelector("div.message-error.error.message");
}