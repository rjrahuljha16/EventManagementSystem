package com.event.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.event.app.domain.Company;
import com.event.app.domain.DemoIn;

@Repository
public interface CompanyTableDao extends JpaRepository<Company, Long> {

	@Query(value="select * from company order by c_id DESC limit 2", nativeQuery=true)
	List<Company> lastrows(Company c);
	
	
	@Query(value="select company from company", nativeQuery=true)
	List<DemoIn> cost();
}	
