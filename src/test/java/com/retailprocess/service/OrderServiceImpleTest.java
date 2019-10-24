package com.retailprocess.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.retailprocess.model.Product;
import com.retailprocess.model.User;
import com.retailprocess.utility.TestUtil;


@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImpleTest {

	OrderServiceImpl subject = new OrderServiceImpl();
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
    public void testProcessGroceryOrderForEmployee() {
       User employee = TestUtil.getUserAsEmployee();
       List<Product> list = TestUtil.getGroceryProductList();
       float expected = (float) ((float)(Math.round((115.60f + 150.00f)*100.0)/100.0) - (10.00));
       float result = subject.processOrder(employee, list);
       assertEquals(expected, result,0.001);
    }

	@Test
    public void testProcessNonGroceryOrderForEmployee() {
       User employee = TestUtil.getUserAsEmployee();
       List<Product> list = TestUtil.getNonGroceryProductList();
       float expected = (float) ((float)(Math.round((115.60f + 150.00f)*100.0)/100.0) - (89.68));
       float result = subject.processOrder(employee, list);
       assertEquals(expected, result,0.001);
    }
	
	@Test
    public void testProcessGroceryOrderForCustomer() {
       User customer = TestUtil.getUserAsCustomer();
       List<Product> list = TestUtil.getGroceryProductList();
       float expected = (float) ((float)(Math.round((115.60f + 150.00f)*100.0)/100.0) - (10.00));
       float result = subject.processOrder(customer, list);
       assertEquals(expected, result,0.001);
    }

	@Test
    public void testProcessOrderBothProductForCustomer() {
       User customer = TestUtil.getUserAsCustomer();
       List<Product> list = TestUtil.getAllProductList();
       float expected = (float) ((float)(Math.round((115.60f + 150.00f)*100.0)/100.0) - (17.5));
       float result = subject.processOrder(customer, list);
       assertEquals(expected, result,0.001);
    }
	
	@Test
    public void testProcessGroceryOrderForAffiliate() {
       User affiliate = TestUtil.getUserAsAffiliate();
       List<Product> list = TestUtil.getGroceryProductList();
       float expected = (float) ((float)(Math.round((115.60f + 150.00f)*100.0)/100.0) - (10.00));
       float result = subject.processOrder(affiliate, list);
       assertEquals(expected, result,0.001);
    }

	@Test
    public void testProcessOrderBothProductForAffiliate() {
       User affiliate = TestUtil.getUserAsAffiliate();
       List<Product> list = TestUtil.getAllProductList();
       float expected = (float) ((float)(Math.round((115.60f + 150.00f)*100.0)/100.0) - (25.0));
       float result = subject.processOrder(affiliate, list);
       assertEquals(expected, result,0.001);
    }
}


