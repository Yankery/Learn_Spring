package com.ea.SpringBasic.pages;

import jakarta.annotation.PostConstruct;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage {
    @Autowired
    private WebDriver webDriver;
    @PostConstruct
    public void initLoginPage() {
        PageFactory.initElements(webDriver, this);
        System.out.println("In login page");
    }
    @FindBy(how= How.NAME, using = "UserName")
    public WebElement txtUserName;
    @FindBy(how= How.NAME, using = "Password")
    public WebElement txtPassword;
    @FindBy(how= How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void Login(String userName, String password) {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        System.out.println("Username and password: " + userName + " --- " + password);
    }

    public HomePage clickLogin() {
        btnLogin.click();
        System.out.println("Click login from login page");
        return new HomePage();
    }
}
