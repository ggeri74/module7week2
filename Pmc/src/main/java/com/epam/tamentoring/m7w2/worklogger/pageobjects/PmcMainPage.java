package com.epam.tamentoring.m7w2.worklogger.pageobjects;

import com.epam.tamentoring.m7w2.worklogger.model.Tab;
import org.openqa.selenium.*;

public class PmcMainPage extends Page {

    public PmcMainPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://pmcmsq.epam.com/pmc/task/list.do");
    }

    public ReportingTab selectTab(Tab tab) {
        if (driver.findElements(tab.getTab()).size() != 0) {
            driver.findElement(tab.getTab()).click();
        }
        return new ReportingTab(driver);
    }
}
