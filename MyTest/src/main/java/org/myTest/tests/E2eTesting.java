package org.myTest.tests;

import org.myTest.base.BaseTest;
import org.myTest.pages.*;
import org.myTest.utils.UserData;
import org.myTest.utils.UserDataFactory;
import org.myTest.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E2eTesting extends BaseTest {
    UserData userData = UserDataFactory.generateRandomUser();


    @Test(priority = 1)
    public void registerPurchaseFlow() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        CreateAccountPage createAccountPage = new CreateAccountPage(driver, wait);
        CommonPage commonElements = new CommonPage(driver, wait);
        HomePage homePage = new HomePage(driver, wait);
        ProductPage productPage = new ProductPage(driver, wait);
        ShippingPage shippingPage = new ShippingPage(wait);
        Actions actions = new Actions(driver);

        createAccountPage.registerUser(userData.getFirstName(), userData.getLastName(), userData.getEmail(), userData.getPassword());
        commonElements.goToHomePage();
        Assert.assertEquals(homePage.getHomePageMainText().getText(), "Home Page");

        WebElement randomProduct = Utils.getRandomElementFromList(homePage.getProductList());
        actions.moveToElement(randomProduct).pause(100).perform();
        randomProduct.findElement(By.cssSelector(".action.tocart")).click();

        if (!productPage.getProductSizeList().isEmpty()) {
            Utils.getRandomElementFromList(productPage.getProductSizeList()).click();
        }
        if (!productPage.getProductColorList().isEmpty()) {
            Utils.getRandomElementFromList(productPage.getProductColorList()).click();
        }
        productPage.getQtyField().clear();
        productPage.getQtyField().sendKeys(Utils.getRandomInd(5));
        if (productPage.getNoQtyMessage().equals("The requested qty is not available")) {
            driver.navigate().back();
        } else {
            productPage.clickOnAddToCartButton();
            driver.navigate().back();
        }

        randomProduct = Utils.getRandomElementFromList(homePage.getProductList());
        actions.moveToElement(randomProduct).pause(100).perform();
        randomProduct.findElement(By.cssSelector(".action.tocart")).click();

        if (!productPage.getProductSizeList().isEmpty()) {
            Utils.getRandomElementFromList(productPage.getProductSizeList()).click();
        }
        if (!productPage.getProductColorList().isEmpty()) {
            Utils.getRandomElementFromList(productPage.getProductColorList()).click();
        }
        productPage.getQtyField().clear();
        productPage.getQtyField().sendKeys(Utils.getRandomInd(5));
        if (productPage.getNoQtyMessage().equals("The requested qty is not available")) {
            driver.navigate().back();
        } else {
            productPage.clickOnAddToCartButton();
        }
        commonElements.goToCart().click();
        commonElements.clickOnCheckoutButton();

        shippingPage.addCityField(Utils.generateSecureRandomString(5));
        shippingPage.addStreetAddress(Utils.generateSecureRandomString(5));
        shippingPage.addZipCode(Utils.generateSecureRandomString(5));
        int index = Integer.valueOf((String) Utils.getRandomInd(10));
        Select select = new Select(shippingPage.stateList());
        select.selectByIndex(index);
        shippingPage.addPhoneNumber("1232312312");
        shippingPage.clickOnShippingMethod();
        shippingPage.clickOnNextButton();
        shippingPage.clickOnPlaceOrder();

        Thread.sleep(5000);
    }
}
