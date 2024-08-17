package com.example.opneapi3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.opneapi3.model.Contact;
import com.example.opneapi3.repo.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    @Override
    public String upsert(Contact contact) {
        repository.save(contact);
        return "SUCCESS";
    }

    @Override
    public String delete(int cid) {
        repository.deleteById(cid);
        return "success delete....";
    }

    @Override
    public List<Contact> getAllContact() {
        return repository.findAll();
    }

    @Override
    public Contact getContact(int cid) {
        Optional<Contact> optional = repository.findById(cid);
        return optional.orElse(null);
    }

}
