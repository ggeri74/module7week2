package com.epam.tamentoring.m7w2.worklogger.pageobjects;

import com.epam.tamentoring.m7w2.worklogger.model.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PmcLoginPage extends Page {

    public PmcLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userIdField = By.cssSelector("[name=username]");
    private By passwordField = By.cssSelector("[name=password]");
    private By loginButton = By.className("btButton");

    public PmcLoginPage open() {
        driver.get("https://pmcmsq.epam.com/pmc/login.do");
        return this;
    }

    public PmcMainPage login(Credentials credentials) {
        driver.findElement(userIdField).sendKeys(credentials.getUsername());
        driver.findElement(passwordField).sendKeys(credentials.getPassword());
        driver.findElement(loginButton).click();
        return new PmcMainPage(driver);
    }
}
