package com.epam.tamentoring.m7w2.worklogger.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TimeJournalSubTab extends Page {

    public TimeJournalSubTab(WebDriver driver) {
        this.driver = driver;
    }

    private By dayOfTheWeek;
    private By saveChangesButton = By.id("buttonSaveBottom");

    public void report(int... days) {
        for (int i = 0; i < days.length; i++) {
            dayOfTheWeek = By.cssSelector("[name=formTimeJournal" + (i + 2) + "][assignmentId = '4000741400036864170']");
            WebElement cell = driver.findElement(dayOfTheWeek);
            cell.clear();
            cell.sendKeys(Integer.toString(days[i]));
        }
    }

    public void save() {
        driver.findElement(saveChangesButton).click();
    }
}
