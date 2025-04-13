package org.myTest.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

public class ProductPage extends ProductPageLocators {

    WebDriver driver;
    WebDriverWait wait;
    private static final Logger logger = LoggerFactory.getLogger(ProductPage.class);


    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public List<WebElement> getProductSizeList() {
        try {
            return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productSizeList));
        } catch (TimeoutException e) {
            logger.warn("Size options not found, skipping...", e);
            return Collections.emptyList();
        }
    }

    public List<WebElement> getProductColorList() {
        try {
            return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productColorList));
        } catch (TimeoutException e) {
            logger.warn("Size options not found, skipping...", e);
            return Collections.emptyList();
        }
    }

    public WebElement getQtyField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(productQtyField));
    }

    public void clickOnAddToCartButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCartButton)).click();
    }

    public String getNoQtyMessage() {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(noQtyMessage)).getText();
        } catch (TimeoutException e) {
            return "There is enough QTY";
        }

    }



}
