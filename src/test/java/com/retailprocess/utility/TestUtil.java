package com.retailprocess.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.retailprocess.enums.ProductType;
import com.retailprocess.enums.UserType;
import com.retailprocess.model.Affiliate;
import com.retailprocess.model.Customer;
import com.retailprocess.model.Employee;
import com.retailprocess.model.Product;
import com.retailprocess.model.User;
import com.retailprocess.util.ApplicationUtil;

public class TestUtil {

	public static  User getUserAsEmployee() {
		User user = Employee.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withAddress("New Delhi")
				.withCreationDate(new Date())
				.withManagerId(1)
				.withName("Aabid Husain")
				.withUserType(UserType.Employee.name())
				.build();
		return user;
	}
	
	public static  User getUserAsCustomer() {
		@SuppressWarnings("deprecation")
		User user = Customer.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withAddress("New Delhi")
				.withCreationDate(new Date("06/24/2017"))
				.withName("Aabid Husain")
				.withUserType(UserType.Customer.name())
				.build();
		return user;
	}
	public static  User getUserAsAffiliate() {
		User user = Affiliate.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withAddress("New Delhi")
				.withCreationDate(new Date())
				.withName("Aabid Husain")
				.withUserType(UserType.Affiliate.name())
				.build();
		return user;
	}

	public static List<Product> getGroceryProductList(){
		Product product = Product.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withName("Rice")
				.withType(ProductType.GROCERY.name())
				.withPrice(115.60f)
				.build();
		List<Product> list = new ArrayList<>();
		list.add(product);
		product = Product.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withName("Bread")
				.withType(ProductType.GROCERY.name())
				.withPrice(150.00f)
				.build();
		list.add(product);
		return list;
	}
	public static List<Product> getNonGroceryProductList(){
		Product product = Product.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withName("Paracetamol")
				.withType(ProductType.MEDICINE.name())
				.withPrice(115.60f)
				.build();
		List<Product> list = new ArrayList<>();
		list.add(product);
		product = Product.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withName("Avil 25")
				.withType(ProductType.MEDICINE.name())
				.withPrice(150.00f)
				.build();
		list.add(product);
		return list;
	}
	
	public static List<Product> getAllProductList(){
		Product product = Product.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withName("Rice")
				.withType(ProductType.GROCERY.name())
				.withPrice(115.60f)
				.build();
		List<Product> list = new ArrayList<>();
		list.add(product);
		product = Product.builder()
				.withId(ApplicationUtil.getUniqueId())
				.withName("Avil 25")
				.withType(ProductType.MEDICINE.name())
				.withPrice(150.00f)
				.build();
		list.add(product);
		return list;
	}

}
