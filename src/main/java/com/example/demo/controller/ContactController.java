package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    ResponseEntity<String> contact(@RequestBody Contact contact) {
        String status = service.upsert(contact);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = service.getAllContact();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/{cid}")
    ResponseEntity<Contact> getContact(@PathVariable int cid) {
        Contact contact = service.getContact(cid);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @DeleteMapping("/{cid}")
    ResponseEntity<String> deleteContact(@PathVariable int cid) {
        String status = service.delete(cid);
        return new ResponseEntity<String>(status, HttpStatus.OK);
    }

}
