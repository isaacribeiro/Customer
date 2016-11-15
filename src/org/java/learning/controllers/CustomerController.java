package org.java.learning.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.java.learning.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

	private List<Customer> customersList = new ArrayList<Customer>();
	
	@RequestMapping("/")
	public String listCustomers(Model model){
		model.addAttribute("customers", customersList);
		return "listCustomers";
	}
	
	@RequestMapping(value = "/addNewCustomer", method = RequestMethod.GET)
	public String execute(Model model){
		model.addAttribute("customers", new Customer());
		return "createNewCustomer";
	}
	
	@RequestMapping(value = "/addNewCustomer", method = RequestMethod.POST )
	public String addCustomer(Customer customer, BindingResult result, Model model,
			RedirectAttributes redirectAttributes, HttpServletRequest request){
		customersList.add(customer);
		return "redirect:/";
	}
		
}
