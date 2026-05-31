package com.company.enroller.e2e.playwright.authentication;

import com.company.enroller.e2e.BaseTests;
import com.company.enroller.e2e.Const;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.company.enroller.e2e.Const.*;


public class LoginTests extends BaseTests {
    private Playwright playwright;
    private Browser browser;
    private Page page;

    private LoginPage loginPage;

    @BeforeEach
    void setUp() {
        dbInit();
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        loginPage = new LoginPage(page);
        loginPage.get(HOME_PAGE);
    }

    @Test
    @DisplayName("[LOGOWANIE.1] No login, system should not confirm the user")
    void emptyLoginName() {
        this.loginPage.loginAs(USER_I_NAME);
    }

    @Test
    @DisplayName("[LOGOWANIE.2] The system should accept the login and display the meetings view. " +
            "The user should be able to see all meetings")
    void correctLoginName() {

    }

    @AfterEach
    void exit() {
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
