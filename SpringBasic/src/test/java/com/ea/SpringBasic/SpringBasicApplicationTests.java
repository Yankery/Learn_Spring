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

@SpringBootTest
class SpringBasicApplicationTests {

	@Value("testing")
	private String environment;

	@Autowired
	private MainPage mainPage;
	@Test
	void contextLoads() {
		System.out.println(environment);
		//constructor injection
		mainPage.performLogin();
	}

}
