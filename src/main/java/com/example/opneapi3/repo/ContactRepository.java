package com.example.opneapi3.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.opneapi3.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {}