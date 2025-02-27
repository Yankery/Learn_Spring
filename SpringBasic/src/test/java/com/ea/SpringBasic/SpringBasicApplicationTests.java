package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import com.ea.SpringBasic.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBasicApplicationTests {

	@Test
	void contextLoads() {
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
//		LoginPage loginPage = page.clickLogin();
//		loginPage.clickLogin();
		MainPage mainPage = new MainPage(loginPage, homePage);
		mainPage.performLogin();
	}

}
