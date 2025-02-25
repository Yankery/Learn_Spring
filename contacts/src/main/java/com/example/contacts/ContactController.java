package com.example.contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactRepository repository;

    @GetMapping("/contacts")
    List<Contact> getAll() {
        return repository.findAll();
    }
}
