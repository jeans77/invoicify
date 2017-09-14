package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class RateBasedBillingRecordTests {
	@Test
    public void test_RateBasedBillingRecord_getters_and_setters_using_MeanBean() {
        BeanTester beanTester = new BeanTester();
        Configuration configuration = new ConfigurationBuilder()
                .ignoreProperty("createdOn")
                .build();
        beanTester.testBean(RateBasedBillingRecord.class, configuration);
    }
	
	@Test
	public void test_getTotal() {
		double rate = 5;
		double quantity = 4;
		
		RateBasedBillingRecord rbbr = new RateBasedBillingRecord();
		rbbr.setQuantity(quantity);
		rbbr.setRate(rate);
		assertThat(rbbr.getTotal()).isEqualTo(20);
		
		
	}
}
