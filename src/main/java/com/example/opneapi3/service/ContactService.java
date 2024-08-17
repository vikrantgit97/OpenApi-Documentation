package com.example.opneapi3.service;

import java.util.List;
import com.example.opneapi3.model.Contact;

public interface ContactService {

    //'upsert' = 'update' and 'insert
    String upsert(Contact contact);

    String delete(int cid);

    List<Contact> getAllContact();

    Contact getContact(int cid);
}
