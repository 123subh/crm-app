package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Lead;
import com.crm.repo.LeadRepo;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepo leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);	
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteLead(Long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public Lead findLead(Long id) {
		Lead lead = leadRepo.findById(id).get();
		return lead;
	}

	@Override
	public Lead updateLead(Lead lead) {
		Lead lead2 = leadRepo.findById(lead.getId()).get();
		lead2.setFirstName(lead.getFirstName());
		lead2.setLastName(lead.getLastName());
		lead2.setMobile(lead.getMobile());
		lead2.setEmail(lead.getEmail());
		Lead save = leadRepo.save(lead2);
		return save;
		
	}


	


	
}
