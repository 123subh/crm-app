package com.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {

}
