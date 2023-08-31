package com.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long> {

}
