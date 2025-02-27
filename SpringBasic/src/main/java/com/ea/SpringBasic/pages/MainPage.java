package com.ea.SpringBasic.pages;

public class MainPage {
    private LoginPage loginPage;
    private HomePage homePage;

    public MainPage(LoginPage loginPage, HomePage homePage) {
        this.loginPage = loginPage;
        this.homePage = homePage;
    }

    public void performLogin() {
        homePage.clickLogin();
        loginPage.Login("admin", "adminpassword");
        loginPage.clickLogin();
    }
}
