package org.myTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage extends CreateAccountLocators {
    WebDriver driver;
    WebDriverWait wait;

    public CreateAccountPage(WebDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getFirstName() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
    }

    public WebElement getLastName() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(lastName));
    }

    public WebElement getEmail() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(email));
    }

    public WebElement getPassword() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(password));
    }

    public WebElement getConfirmPassword() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(confirmPassword));
    }

    public WebElement getCreateAccountButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(createAccountButton));
    }

    public WebElement getConfirmationMessage() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(confirmationMessage));
    }

    public void registerUser(String firstName, String latName, String email, String password) {
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(latName);
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getConfirmPassword().sendKeys(password);
        getCreateAccountButton().click();
    }


}
