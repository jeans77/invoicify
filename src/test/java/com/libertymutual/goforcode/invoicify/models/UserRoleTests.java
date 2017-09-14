package com.libertymutual.goforcode.invoicify.models;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class UserRoleTests {
	@Test
    public void test_UserRole_getters_and_setters_using_MeanBean() {
        BeanTester beanTester = new BeanTester();
        Configuration configuration = new ConfigurationBuilder()
                .ignoreProperty("createdOn")
                .build();
        beanTester.testBean(UserRole.class, configuration);
    }
}
