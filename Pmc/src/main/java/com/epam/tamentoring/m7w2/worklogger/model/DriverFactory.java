package com.epam.tamentoring.m7w2.worklogger.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
