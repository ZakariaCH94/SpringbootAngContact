package com.example.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.entities.Contact;

public interface IContactMetier {

	public Contact save_contact(Contact contact);
	public List<Contact> getAllContact();
	public Contact getContact(long id);
	public void supprimerContact(long id); 
	public Page<Contact> getContactbymc(String mc,int page,int size); 
}
