package com.libertymutual.goforcode.invoicify.controllers;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.invoicify.repositories.UserRepository;

public class HomeControllerTests {
	
	private UserRepository userRepository;
	private HomeController controller;
	private PasswordEncoder encoder;
	
	
	@Before
	public void setup()  {
		userRepository = mock(UserRepository.class);
		controller = new HomeController(userRepository, encoder);
	}
	
	@Test
	public void test_that_home_returns_default_view() {
		HomeController controller = new HomeController(userRepository, encoder);
		String view =controller.home();
		assertThat(view).isEqualTo("/home/default");
		
	}
	
	@Test
	public void test_that_signup_returns_signup_view() {
		HomeController controller = new HomeController(userRepository, encoder);
		String view =controller.signup();
		assertThat(view).isEqualTo("home/signup");
		
	}
	
}
