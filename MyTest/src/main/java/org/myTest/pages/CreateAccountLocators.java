package org.myTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountLocators {
    private WebDriver driver;

    protected By firstname = By.id("firstname");
    protected By lastName = By.id("lastname");
    protected By email = By.id("email_address");
    protected By password = By.id("password");
    protected By confirmPassword = By.id("password-confirmation");

    protected By createAccountButton = By.xpath("//button[@title='Create an Account']");
    protected By confirmationMessage = By.cssSelector("//div[@id=\"maincontent\"]//div[contains(text(), 'Thank you for registering with Main Website Store.')]\n");


}
