package com.epam.tamentoring.m7w2.worklogger.pageobjects;

import com.epam.tamentoring.m7w2.worklogger.model.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PmcLoginPage extends Page {

    public PmcLoginPage(WebDriver driver) {
        // --- hw ---
        this.driver = driver;
    }

    // --- hw ---
    private By userIdField = By.cssSelector("[name=username]");
    private By passwordField = By.cssSelector("[name=password]");
    private By loginButton = By.className("btButton");
    // --- hw ---

    public PmcLoginPage open() {
        // --- hw ---
        driver.get("https://pmcmsq.epam.com/pmc/login.do");
        // --- /hw ---
        return this;
    }

    public PmcMainPage login(Credentials credentials) {

        // --- hw ---
        driver.findElement(userIdField).sendKeys(credentials.getUsername());
        driver.findElement(passwordField).sendKeys(credentials.getPassword());
        driver.findElement(loginButton).click();
        // --- hw ---

        return new PmcMainPage(driver);
    }
}
