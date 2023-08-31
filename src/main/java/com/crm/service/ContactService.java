package com.crm.service;

import java.util.List;

import com.crm.entities.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	List<Contact> listAll();

	Contact findById(long id);

}
