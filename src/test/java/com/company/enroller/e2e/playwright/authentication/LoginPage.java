package com.company.enroller.e2e.playwright.authentication;

import com.company.enroller.e2e.Const;
import com.company.enroller.e2e.playwright.BasePage;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import lombok.Getter;

public class LoginPage extends BasePage {

    private final Locator loginBtn;
    private final Locator loginInput;
//    private final Locator loginLabel;
//    private final Locator welcomeLabel;


    public LoginPage(Page page) {
        super(page);
        this.loginBtn = page.locator("button[type='button']");
        this.loginInput = page.locator("input[type='text']");
    }

    public void loginAs(String user){}


}
