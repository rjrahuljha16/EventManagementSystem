package com.event.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.app.domain.Company;
import com.event.app.domain.DemoIn;
import com.event.app.repository.CompanyTableDao;
import com.event.app.service.CompanyTableService;

@Service
public class CompanyTableServiceImpl implements CompanyTableService {
	
	
	@Autowired
	CompanyTableDao companydao;
	
	@Override
	public List<Company> getAllCompanyData() {
		// TODO Auto-generated method stub
		return companydao.findAll();
	}

	@Override
	public Company addCompanyDetails(Company c) {
		// TODO Auto-generated method stub
		return companydao.save(c);
	}

	@Override
	public Company updateCompanyDetails(Company c) {
		// TODO Auto-generated method stub
		return companydao.saveAndFlush(c);
	}

	@Override
	public void deleteCompanyDetails(Long id) {
		// TODO Auto-generated method stub
    companydao.deleteById(id);

	}

	@Override
	public Optional<Company> getByCompanyId(Long id) {
		// TODO Auto-generated method stub
		return companydao.findById(id);
	}

	@Override
	public List<Company> lastrows(Company c) {
		// TODO Auto-generated method stub
		return companydao.lastrows(c);
	}

	@Override
	public  List<DemoIn> cost(){
	return companydao.cost();
	}

	

}
