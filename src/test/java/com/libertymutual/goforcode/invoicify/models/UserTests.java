package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;
import org.springframework.security.core.GrantedAuthority;

public class UserTests {

	
	@Test
    public void test_User_getters_and_setters_using_MeanBean() {
        BeanTester beanTester = new BeanTester();
        Configuration configuration = new ConfigurationBuilder()
                .ignoreProperty("createdOn")
                .build();
        beanTester.testBean(User.class, configuration);
    }
	
    @Test
    public void test_that_isAccountNonExpired_is_true() {
        User user = new User();
        boolean nonExpired = user.isAccountNonExpired();
        assertThat(nonExpired).isTrue();
    }
    
    @Test
    public void test_that_isAccountNonLocked_returns_true() {
        User user = new User();
        boolean nonLocked = user.isAccountNonLocked();
        assertThat(nonLocked).isTrue();
    }
    
    @Test
    public void test_that_isCredentialsNonExpired_returns_true() {
        User user = new User();
        boolean nonExpired = user.isCredentialsNonExpired();
        assertThat(nonExpired).isTrue();
    }
    
    @Test
    public void test_that_isEnabled_returns_true() {
        User user = new User();
        boolean enabled = user.isEnabled();
        assertThat(enabled).isTrue();
    }
    
    @Test
    public void test_that_getAuthorities_returns_correct_authorities() {
        User user = new User();
        List<UserRole> roles = new ArrayList<UserRole>();
        roles.add(new UserRole("ACCOUNTANT", user));
        roles.add(new UserRole("CLERK", user));
        user.setRoles(roles);
        List<? extends GrantedAuthority> actualRoles = user.getAuthorities().stream().collect(Collectors.toList());
        assertThat(actualRoles.get(0).getAuthority()).isEqualTo("ROLE_ACCOUNTANT");
        
    }
	
}