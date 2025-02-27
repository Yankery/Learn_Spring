package com.ea.SpringBasic.pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MainPage {
    public MainPage() {
        System.out.println("In main page");
    }
    @Value("${app.url}")
    private String appUrl;
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver webDriver;

//    public MainPage(LoginPage loginPage, HomePage homePage) {
//        this.loginPage = loginPage;
//        this.homePage = homePage;
//    }

    public void performLogin() {
        webDriver.navigate().to(appUrl);
        homePage.clickLogin();
        loginPage.Login("admin", "adminpassword");
        loginPage.clickLogin();
    }
}
