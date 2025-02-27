package com.ea.SpringBasic.pages;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MainPage {
    public MainPage() {
        System.out.println("In main page");
    }
    @Autowired
    private LoginPage loginPage;
    @Autowired
    private HomePage homePage;

//    public MainPage(LoginPage loginPage, HomePage homePage) {
//        this.loginPage = loginPage;
//        this.homePage = homePage;
//    }

    public void performLogin() {
        homePage.clickLogin();
        loginPage.Login("admin", "adminpassword");
        loginPage.clickLogin();
    }
}
