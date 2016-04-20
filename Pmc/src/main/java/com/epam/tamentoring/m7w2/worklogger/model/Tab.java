package com.epam.tamentoring.m7w2.worklogger.model;

import org.openqa.selenium.By;


public enum Tab {
    //hint: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html > see bottom (enum constructors)

    REPORTING(By.id("menuDropdownTab4"));

    private By tab;
    public By getTab() {
        return tab;
    }

    Tab(By tabId) {
        this.tab = tabId;
    }
}
