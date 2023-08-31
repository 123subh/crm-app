package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Lead;
import com.crm.service.LeadService;


@Controller
@RequestMapping("leads")
public class leadsController {
	
	@Autowired
	private LeadService leadService; 
	
	@RequestMapping(path="/viewLeadPage")
	public String viewSaveLeadPage() {
		return "new_lead";
	}

	@RequestMapping(path="/saveLead")
	public String saveLead(@ModelAttribute Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("msg", "Your Lead is saved!");
		return "new_lead";
	}
	
	@RequestMapping(path="/listAll")
	public String listAll(ModelMap model) {
		List<Lead> allLeads = leadService.getAllLeads();
		model.addAttribute("leads",allLeads);
		return"allLeads";
	}
	
	@RequestMapping(path="/delete")
	public String deleteOneLead(@RequestParam("id")Long id,ModelMap model) {
		leadService.deleteLead(id);
		List<Lead> allLeads = leadService.getAllLeads();
		model.addAttribute("leads",allLeads);
		return"redirect:/leads/listAll";
	}
	
	@RequestMapping(path="/update")
	public String updateLead(@RequestParam("id")Long id,ModelMap model) {
		Lead lead = leadService.findLead(id);
		model.addAttribute("lead",lead);
		return  "update_lead";	
	}
	
	@RequestMapping(path="/updateLead")
	public String saveUpdatedLead(@ModelAttribute Lead lead,ModelMap model) {
		Lead updateLead = leadService.updateLead(lead);
		leadService.saveLead(updateLead);
		model.addAttribute("msg","Your lead Is Updated");
		List<Lead> allLeads = leadService.getAllLeads();
		model.addAttribute("leads",allLeads);
		return "allLeads";
	}
	@RequestMapping(path="/leadInfo")
	public String getLeadInfo(@RequestParam("id")Long id,ModelMap model) {
		Lead lead = leadService.findLead(id);
		model.addAttribute("lead",lead);
		return "lead_Info";
	}
}
