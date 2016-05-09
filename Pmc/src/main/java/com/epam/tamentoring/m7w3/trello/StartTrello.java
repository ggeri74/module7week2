package com.epam.tamentoring.m7w3.trello;

import com.epam.tamentoring.m7w2.worklogger.model.*;
import com.epam.tamentoring.m7w3.trello.model.ScreenShotMaker;
import com.epam.tamentoring.m7w3.trello.pageobjects.TrelloLoginPage;
import com.epam.tamentoring.m7w3.trello.pageobjects.TrelloMainPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StartTrello {

    private void start() {
        WebDriver driver = DriverFactory.getDriver();
        try {
            trelloTest(driver);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
    public static void main(String[] args) {
        new StartTrello().start();
    }

    private void trelloTest(WebDriver driver)  {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TrelloMainPage mainPage = new TrelloMainPage(driver);
        TrelloLoginPage loginPage = mainPage.clickLoginButton();
        loginPage.loginToTrello();
        mainPage.addCard();
        ScreenShotMaker ssmaker = new ScreenShotMaker(driver);
        ssmaker.takeScreenshot();
        mainPage.moveCardToDoneColumn();
        ssmaker.takeScreenshot();
    }
}
