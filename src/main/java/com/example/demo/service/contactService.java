package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Contact;

public interface contactService {
	 String upsert (Contact contact);
	 String delete(int cid);
	 List<Contact> getallContact();
	 Contact getContact(int cid);
}
