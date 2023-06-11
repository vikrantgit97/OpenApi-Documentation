package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class contactController {
	
	@Autowired
	private contactService service;
	
	@PostMapping("/contact")
	ResponseEntity<String> contact (@RequestBody Contact contact){
		String status=service.upsert(contact);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}

	@GetMapping("/contacts")
	ResponseEntity<List<Contact>> getAllContacts( ){
		List<Contact> allcontact=service.getallContact();
		return new ResponseEntity<>(allcontact,HttpStatus.OK);
	}

	@GetMapping("/contact/{cid}")
	ResponseEntity<Contact> getContact(@PathVariable int cid){
		Contact contact=service.getContact(cid);
		return new ResponseEntity<>(contact,HttpStatus.OK);
	}

	@DeleteMapping("/contact/{cid}")
	ResponseEntity<String> deleteContact(@PathVariable int cid){
		String status=service.delete(cid);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}

	
}
