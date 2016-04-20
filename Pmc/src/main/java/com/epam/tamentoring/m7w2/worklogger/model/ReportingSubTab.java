package com.epam.tamentoring.m7w2.worklogger.model;

import org.openqa.selenium.By;

public enum ReportingSubTab {
    //hint: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html > see bottom (enum constructors)
    SUBTAB_TIME_JOURNAL(By.cssSelector(".item.this>a[href^='timejournal/list.do?projectId=']"));

    private By subTab;

    public By getSubTab() {
        return subTab;
    }

    ReportingSubTab(By subTab) {
        this.subTab = subTab;
    }
}
