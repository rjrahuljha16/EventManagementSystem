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
import com.event.app.domain.DemoIn;
import com.event.app.domain.User;
import com.event.app.service.CompanyTableService;
import com.event.app.service.UserTableDetailsService;

@RestController
public class MainController {
	
	@Autowired
	UserTableDetailsService userTableDetailsService;
	
	@Autowired
	CompanyTableService companyserviceimpl;

	@GetMapping("/user")
	public List<User> getUserDetails() {

		return userTableDetailsService.allUser();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getById(@PathVariable Long id){
		return userTableDetailsService.getById(id);
		
	}
	
	@DeleteMapping("/user{id}")
	public void delete(Long id) {
		userTableDetailsService.delete(id);
	}
	
	@PutMapping("/user")
	public User update(@RequestBody User user) {
		return userTableDetailsService.update(user);
	}
	
	@PostMapping("/user")
	public User add(@RequestBody User user) {
		return userTableDetailsService.insert(user);
	}
	
	@GetMapping("/Company")
	public List<Company> getAllCompanyData() {
		// TODO Auto-generated method stub
		return companyserviceimpl.getAllCompanyData();
	}

	
	@GetMapping("/Company/{id}")
	public Optional<Company> getByCompanyId(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		return companyserviceimpl.getByCompanyId(id);
	}
	
	@PostMapping("/Company")
//	@ResponseStatus(HttpStatus.CREATED)
	public Company addCompanyDetails(@RequestBody Company c) {
		// TODO Auto-generated method stub
		return companyserviceimpl.addCompanyDetails(c);
	}
	
	@PutMapping("/Company")
	public Company updateCompanyDetails(@RequestBody Company c) {
		// TODO Auto-generated method stub
		return companyserviceimpl.updateCompanyDetails(c);
	}
	
	@DeleteMapping("/Company/{id}")
	public void deleteCompanyDetails(@RequestBody @PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		companyserviceimpl.deleteCompanyDetails(id);

	}
	
//	@GetMapping("/lastrow")
//	public List<Company> lastrows(Company c){
//		return companyserviceimpl.lastrows(c);
//	}
//
//	@GetMapping("/cost")
//	public List<DemoIn> cost() {	
//	return companyserviceimpl.cost();
//		
//	}
	


}
