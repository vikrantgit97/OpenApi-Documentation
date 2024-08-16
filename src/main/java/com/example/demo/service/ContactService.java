package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Contact;

public interface ContactService {

    //'upsert' = 'update' and 'insert
    String upsert(Contact contact);

    String delete(int cid);

    List<Contact> getAllContact();

    Contact getContact(int cid);
}
