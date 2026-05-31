package com.company.enroller.e2e.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumSmokeTest {

    @Test
    public void test() throws InterruptedException, IOException {
        String page_url = "https://www.saucedemo.com/";

        WebDriver driver = new FirefoxDriver();
        driver.get(page_url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        String cart = driver.findElement(By.id("shopping_cart_container")).getText();
        assertThat(cart).isEqualTo("1");

        By id = By.id("react-burger-menu-btn");
        driver.findElement(id).click();
        wait.until(ExpectedConditions.elementToBeClickable(id));
        driver.findElement(By.id("logout_sidebar_link")).click();

        driver.close();
    }
}
