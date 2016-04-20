package com.epam.tamentoring.m7w2.worklogger.pageobjects;

import com.epam.tamentoring.m7w2.worklogger.model.ReportingSubTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportingTab extends Page {

    public ReportingTab(WebDriver driver) {
        this.driver = driver;
    }

    public TimeJournalSubTab selectSubTab(ReportingSubTab reportingSubTab) {
        if (driver.findElements(reportingSubTab.getSubTab()).size() != 0) {
            driver.findElement(By.cssSelector(".item.this>a")).click();
        }
        return new TimeJournalSubTab(driver);
    }
}
