package com.example.metier;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.contactRepository;
import com.example.entities.Contact;

@Service
@Transactional
public class ContactMetierImplements implements IContactMetier{

	@Autowired
	contactRepository contactrepository;
	
	@Override
	public Contact save_contact(Contact contact) {
		
		return contactrepository.save(contact);
		
	}

	@Override
	public List<Contact> getAllContact() {
		
		return contactrepository.findAll();
	}

	@Override
	public Contact getContact(long id) {

		Optional<Contact> c1= contactrepository.findById(id);
		Contact contact=c1.get();
		return contact;
	}

	@Override
	public void supprimerContact(long id) {

		contactrepository.deleteById(id);
	}

	@Override
	public Page<Contact> getContactbymc(String mc, int page, int size) {

		Page<Contact> pages= contactrepository.chercherContact(mc, new PageRequest(page, size));
		
		return pages;

	}


}
