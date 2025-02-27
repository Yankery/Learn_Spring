package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class HomePage {
    public HomePage() {
        System.out.println("In home page");
    }
    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement linkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement linkEmployeeList;

    public LoginPage clickLogin() {
//        linkLogin.click();
        System.out.println("Click the homepage login");
        return new LoginPage();
    }

    public void clickEmployeeList() {
        linkEmployeeList.click();
    }
}
