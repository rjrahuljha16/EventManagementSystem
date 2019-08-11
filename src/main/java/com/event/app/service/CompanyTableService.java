package com.event.app.service;

import java.util.List;
import java.util.Optional;

import com.event.app.domain.Company;
import com.event.app.domain.DemoIn;

public interface CompanyTableService{

	List<Company> getAllCompanyData();
	Company addCompanyDetails(Company c);
	Company updateCompanyDetails(Company c);
	void deleteCompanyDetails(Long id);
	Optional<Company> getByCompanyId(Long id);
	List<Company> lastrows(Company c);
	List<DemoIn> cost();
}
