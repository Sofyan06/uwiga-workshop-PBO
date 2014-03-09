package org.uwiga.dao;

import java.util.ArrayList;
import java.util.List;

import org.uwiga.model.Customer;

public class App {

	public App(){
		CustomerDao customerDao = new CustomerDaoImpl();
		
		//memasukkan data
		Customer cust1 = new Customer();
		cust1.setIdCustomer("011");
		cust1.setName("Sofyan");
		customerDao.saveOrUpdate(cust1);
		
		Customer cust2 = new Customer();
		cust2.setIdCustomer("002");
		cust2.setName("Ibu Sofyan");
		customerDao.saveOrUpdate(cust2);
		
		//menampilkan data
		List<Customer> customers = new ArrayList<>();
		customers = customerDao.findAll();
		for (Customer item : customers){
			System.out.println(item);
		}
		
		
		
	}
	

public static void main(String[] args) {
	App f = new App();
}
}
