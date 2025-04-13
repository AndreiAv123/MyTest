package org.myTest.tests;

import org.myTest.base.BaseTest;
import org.myTest.pages.CreateAccountPage;
import org.myTest.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends BaseTest {
    String email = Utils.generateSecureRandomString(10) + "@gmail.com";
    String password = Utils.generateSecureRandomString(10);

    @Test(priority = 1)
    public void createAccountWithValidCredentials(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        CreateAccountPage createAccountPage = new CreateAccountPage(driver, wait);


        createAccountPage.getFirstName().sendKeys("Andrei");
        createAccountPage.getLastName().sendKeys("Avarvarii");
        createAccountPage.getEmail().sendKeys(email);
        createAccountPage.getPassword().sendKeys(password);
        createAccountPage.getConfirmPassword().sendKeys(password);
        createAccountPage.getCreateAccountButton().click();
        Assert.assertEquals(createAccountPage.getConfirmationMessage().getText(),"Thank you for registering with Main Website Store.");
    }



}
