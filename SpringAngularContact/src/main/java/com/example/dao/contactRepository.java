package com.example.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Contact;

public interface contactRepository extends JpaRepository<Contact, Long> {

	@Query("select c from Contact c where c.prenom like :x ")
	public Page<Contact> chercherContact (@Param("x") String mc,Pageable pageable);
}
