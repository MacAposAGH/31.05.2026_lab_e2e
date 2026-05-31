package com.company.enroller.e2e.playwright;


import com.microsoft.playwright.Page;

public class BasePage {

    protected Page page;

    protected BasePage(Page page) {
        this.page = page;
    }

    public void get(String url) {
        page.navigate(url);
    }
}
