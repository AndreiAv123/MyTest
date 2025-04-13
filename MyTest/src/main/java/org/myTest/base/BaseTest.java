package org.myTest.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
        protected WebDriver driver;
        protected WebDriverWait wait;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        }

        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    }

