package com.example.opneapi3.controller;

import com.example.opneapi3.model.Contact;
import com.example.opneapi3.service.ContactService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contact")
@Tag(name = "Contact", description = "Contact management APIs")
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

    @Operation(
            summary = "Retrieve a Contact by Id",
            description = "Get a Contact by specifying its id. The response is Contact object with id, title, description and published status."
            //, tags = { "contact", "get" }
            )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Contact.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Contact not found", content = @Content),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) })
    })
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
