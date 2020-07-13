package com.example.processAPI.endpoints;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@RequestMapping("/api")
@RestController
public class EndPointsRestService {

	private List<Customer> theList;

	@PostConstruct
	public void loadData() {

		theList = new ArrayList();
		theList.add(new Customer(1, "Anirudh", "Chaganty"));
		theList.add(new Customer(2, "Gone", "Mahesh"));
		theList.add(new Customer(3, "Sonu", "Sood"));
	}

	@GetMapping("/customer")
	public List getCustomer() {
		return theList;
	}

	@GetMapping("/customer/{customerid}")
	public Customer getCustomer(@PathVariable int customerid) {
		customerid-=1;

		return theList.get(customerid);
	}
}
