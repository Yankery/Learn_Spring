package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import com.ea.SpringBasic.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
class SpringBasicApplicationTests {

	@Value("${app.url}")
	private String appUrl;
	@Value("chrome, firefox, edge")
	private List<String> browsers;
	@Autowired
	private MainPage mainPage;
	@Test
	void performLoginTest() {
		mainPage.performLogin();
	}

}
