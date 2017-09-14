package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class FlatFeeBillingRecordTests {
	
	@Test
    public void test_FlatFeeBillingRecord_getters_and_setters_using_MeanBean() {
        BeanTester beanTester = new BeanTester();
        Configuration configuration = new ConfigurationBuilder()
                .ignoreProperty("createdOn")
                .build();
        beanTester.testBean(FlatFeeBillingRecord.class, configuration);
    }
	
	@Test
	 public void check_that_getTotal_returns_amount() {
        //Arrange
        FlatFeeBillingRecord record = new FlatFeeBillingRecord();
        record.setAmount(5l);
        
        //Act
        double amount = record.getTotal();
        
        //Assert
        assertThat(amount).isEqualTo(5l);
    }

}
