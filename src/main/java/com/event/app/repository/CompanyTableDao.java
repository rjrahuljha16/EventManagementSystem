package com.event.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.app.domain.Company;

@Repository
public interface CompanyTableDao extends JpaRepository<Company, Long> {

}
