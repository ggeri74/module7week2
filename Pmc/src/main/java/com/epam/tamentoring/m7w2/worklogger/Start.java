package com.epam.tamentoring.m7w2.worklogger;

import com.epam.tamentoring.m7w2.worklogger.model.Credentials;
import com.epam.tamentoring.m7w2.worklogger.model.DriverFactory;
import com.epam.tamentoring.m7w2.worklogger.model.Tab;
import com.epam.tamentoring.m7w2.worklogger.pageobjects.TimeJournalSubTab;
import com.epam.tamentoring.m7w2.worklogger.pageobjects.PmcLoginPage;
import com.epam.tamentoring.m7w2.worklogger.pageobjects.PmcMainPage;
import com.epam.tamentoring.m7w2.worklogger.model.ReportingSubTab;
import com.epam.tamentoring.m7w2.worklogger.pageobjects.ReportingTab;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Start {
    private static Credentials credentials;

    public static void main(String[] args) {
        credentials = Credentials.readFromConsole();
        new Start().start();
    }

    private void start() {
        WebDriver driver = DriverFactory.getDriver();
        try {
            pmcTest(driver);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.quit();
        }
    }

    private void pmcTest(WebDriver driver) throws InterruptedException {
        // --- hw ---
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // --- hw ---

        PmcLoginPage loginPage = new PmcLoginPage(driver).open();
        PmcMainPage mainPage = loginPage.login(credentials);
        ReportingTab reportingTab = mainPage.selectTab(Tab.REPORTING);
        TimeJournalSubTab timeJournalSubTab = reportingTab.selectSubTab(ReportingSubTab.SUBTAB_TIME_JOURNAL);
        timeJournalSubTab.report(8, 8, 8, 8, 8);
        timeJournalSubTab.save();
    }
}
