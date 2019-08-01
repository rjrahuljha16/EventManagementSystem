package com.event.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.app.domain.Company;
import com.event.app.domain.User;
import com.event.app.service.UserTableDetailsService;
import com.event.app.serviceimpl.CompanyTableServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	UserTableDetailsService userTableDetailsService;
	
	@Autowired
	CompanyTableServiceImpl companyserviceimpl;

	@GetMapping("/alluserdetails")
	public List<User> getUserDetails() {

		return userTableDetailsService.getAllUserDetails();

	}
	
	@GetMapping("/list")
	public List<Company> getAllCompanyData() {
		// TODO Auto-generated method stub
		return companyserviceimpl.getAllCompanyData();
	}

	
	@GetMapping("/listbyid/{id}")
	public Optional<Company> getByCompanyId(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		return companyserviceimpl.getByCompanyId(id);
	}
	
	@PostMapping("/insert")
	public Company addCompanyDetails(@RequestBody Company c) {
		// TODO Auto-generated method stub
		return companyserviceimpl.addCompanyDetails(c);
	}
	
	@PutMapping("/update")
	public Company updateCompanyDetails(@RequestBody Company c) {
		// TODO Auto-generated method stub
		return companyserviceimpl.updateCompanyDetails(c);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCompanyDetails(@RequestBody @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		companyserviceimpl.deleteCompanyDetails(id);

	}
	


}
