package com.javasampleapproach.springmvc.thymeleaf.controller;

import com.javasampleapproach.springmvc.thymeleaf.model.Address;
import com.javasampleapproach.springmvc.thymeleaf.model.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	List<Customer> lstCustomers = new ArrayList<Customer>();
	
	@PostConstruct
    public void init() throws Exception {
		lstCustomers.add(new Customer(new Long(1), "Jack", 25, new Address("NANTERRE CT", "77471")));
		lstCustomers.add(new Customer(new Long(2), "Mary", 37, new Address("W NORMA ST", "77009")));
		lstCustomers.add(new Customer(new Long(3), "Peter", 18, new Address("S NUGENT AVE", "77571")));
		lstCustomers.add(new Customer(new Long(4), "Amos", 23, new Address("E NAVAHO TRL", "77449")));
		lstCustomers.add(new Customer(new Long(5), "Craig", 45, new Address("AVE N", "77587")));
		lstCustomers.add(new Customer(new Long(6), "Aries", 19, new Address("Broadway/Reade St, New York", "10007")));
		lstCustomers.add(new Customer(new Long(7), "Brice", 39, new Address("Columbus, OH 43215, USA", "43215")));
		lstCustomers.add(new Customer(new Long(8), "Cage", 24, new Address("Plano, TX 75074", "75074")));
		lstCustomers.add(new Customer(new Long(9), "Ellen", 41, new Address("Modesto, CA 95354", "95354")));
		lstCustomers.add(new Customer(new Long(10), "Brice", 32, new Address("Atlanta, GA 30334", "30334")));
		lstCustomers.add(new Customer(new Long(11), "Jack", 25, new Address("NANTERRE CT", "77471")));
		lstCustomers.add(new Customer(new Long(12), "Mary", 37, new Address("W NORMA ST", "77009")));
		lstCustomers.add(new Customer(new Long(13), "Peter", 18, new Address("S NUGENT AVE", "77571")));
		lstCustomers.add(new Customer(new Long(14), "Amos", 23, new Address("E NAVAHO TRL", "77449")));
		lstCustomers.add(new Customer(new Long(15), "Craig", 45, new Address("AVE N", "77587")));
		lstCustomers.add(new Customer(new Long(16), "Aries", 19, new Address("Broadway/Reade St, New York", "10007")));
		lstCustomers.add(new Customer(new Long(17), "Brice", 39, new Address("Columbus, OH 43215, USA", "43215")));
		lstCustomers.add(new Customer(new Long(18), "Cage", 24, new Address("Plano, TX 75074", "75074")));
		lstCustomers.add(new Customer(new Long(19), "Ellen", 41, new Address("Modesto, CA 95354", "95354")));
		lstCustomers.add(new Customer(new Long(20), "Brice", 32, new Address("Atlanta, GA 30334", "30334")));

	}

	@GetMapping
	public String index() {
		return "redirect:/customer";
	}
	
	@GetMapping("/customer")
    public String getCustomer(Model model) {
        model.addAttribute("customers", lstCustomers);
        return "customer/customer.table.html";
    }
}
