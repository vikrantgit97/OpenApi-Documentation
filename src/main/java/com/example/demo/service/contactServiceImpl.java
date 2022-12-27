package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.repo.ContactRepository;

@Service
public class contactServiceImpl implements contactService {

	@Autowired
	private ContactRepository repository;
	
	@Override
	public String upsert(Contact contact) {
		Contact save=repository.save(contact);
		return "SUCESS";
	}

	@Override
	public String delete(int cid) {
		repository.deleteById(cid);;
		return "sucess delete....";
	}

	@Override
	public List<Contact> getallContact() {
		
		return repository.findAll();
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> findById=repository.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

}
