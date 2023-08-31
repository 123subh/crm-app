package com.crm.service;

import java.util.List;

import com.crm.entities.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	List<Lead> getAllLeads();

	void deleteLead(Long id);

	Lead updateLead(Lead lead);

	Lead findLead(Long id);
}
