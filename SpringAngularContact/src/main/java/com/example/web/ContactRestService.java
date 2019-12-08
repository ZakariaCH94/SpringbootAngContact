package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Contact;
import com.example.metier.ContactMetierImplements;

@RestController
@CrossOrigin("*")
public class ContactRestService {
	
	@Autowired
	private ContactMetierImplements ContactMetierImplements; 
	
	
	
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<Contact> getAllContact() {
		
		return ContactMetierImplements.getAllContact();
		
	}
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.GET)
	public Contact getContact(@PathVariable Long id) {
		
		return ContactMetierImplements.getContact(id);
		
	}
	
	@RequestMapping(value="/contacts",method=RequestMethod.POST)
	public Contact saveContact(@RequestBody Contact c) {
		
		 return ContactMetierImplements.save_contact(c);
	
	}
	
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.DELETE)
	public boolean deleteContact(@PathVariable long id) {
		
		 ContactMetierImplements.supprimerContact(id);
		 return true;
	}
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.PUT)
	public Contact updateContact(@PathVariable long id,@RequestBody Contact c) {
		
		c.setId(id);
		return ContactMetierImplements.save_contact(c);
	
	}
	
	@RequestMapping(value="/chercherContacts",method=RequestMethod.GET)
	public Page<Contact> chercherContact(@RequestParam(name="mc",defaultValue="")String mc,
										 @RequestParam(name="page",defaultValue="")int page,
										 @RequestParam(name="size",defaultValue="")int size) {
		
			
		return ContactMetierImplements.getContactbymc("%"+mc+"%", page, size);
		
	}
	
	
	
	
	

}
