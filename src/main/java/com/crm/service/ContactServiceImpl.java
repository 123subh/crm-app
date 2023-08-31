package com.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Contact;
import com.crm.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> listAll() {
		List<Contact> allContact = contactRepo.findAll();
		return allContact;
	}

	@Override
	public Contact findById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
