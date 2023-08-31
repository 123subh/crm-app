package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Bill;
import com.crm.entities.Contact;
import com.crm.service.BillService;
import com.crm.service.ContactService;
import com.crm.utility.PdfGenerator;

@Controller
@RequestMapping("bill")
public class BillingContorller {
	String filePath="C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\CRM\\src\\tickets\\bill";
	@Autowired
	private PdfGenerator pdfGenerator; 
	
	@Autowired
	private ContactService  contactService;
	
	@Autowired
	private BillService billService;
	
	@RequestMapping(value="/billing",method = RequestMethod.GET)
	public String billing(@RequestParam("id") long id,ModelMap model) {
	Contact contact = contactService.findById(id);
	model.addAttribute("contact", contact);
	return "create_bill";
	}

	@RequestMapping(value="/generateBill",method = RequestMethod.POST)
	public String generateBill(@ModelAttribute Bill bill, ModelMap model) {
		Bill saveBill = billService.saveBill(bill);
		pdfGenerator.generatePDF(filePath+bill.getId()+".pdf", bill.getFirstName(), bill.getLastName(), bill.getEmail(),bill.getMobile(),
				bill.getModel(),bill.getAmount());
		model.addAttribute("bill", bill);
		return "print_bill";
	}
}
