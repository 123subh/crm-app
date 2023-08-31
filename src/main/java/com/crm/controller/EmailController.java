package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.utility.EmailService;

@Controller
@RequestMapping("mail")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/sendEmail")
	public String sendMail(@RequestParam("email")String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}

	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("to") String to,
			@RequestParam("sub") String sub,
			@RequestParam("body") String body, ModelMap model) {
		emailService.sendSimpleMessage(to, sub, body);
		model.addAttribute("msg", "Email Sent!!");
		return "compose_email";
	}
}
