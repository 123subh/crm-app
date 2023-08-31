package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.entities.Lead;
import com.crm.service.ContactService;
import com.crm.service.LeadService;

@Controller
@RequestMapping("contact")
public class ContactController {
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/convert")
	public String convertLeadToContact(@RequestParam("id")Long id,ModelMap model) {
		try {
			Lead lead = leadService.findLead(id);
			
			Contact contact = new Contact();
			contact.setFirstName(lead.getFirstName());
			contact.setLastName(lead.getLastName());
			contact.setEmail(lead.getEmail());
			contact.setMobile(lead.getMobile());
			
			contactService.saveContact(contact);
			
			leadService.deleteLead(id);
			List<Contact> contacts = contactService.listAll();
			model.addAttribute("contacts", contacts);
		} catch (Exception e) {
			List<Contact> contacts = contactService.listAll();
			model.addAttribute("contacts", contacts);
		}
		return "list_of_contacts";
	}

	@RequestMapping("listOfContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listAll();
		model.addAttribute("contacts", contacts);
		return "list_of_contacts";
	}
	@RequestMapping("contactInfo")
	public String getInfo(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
}
