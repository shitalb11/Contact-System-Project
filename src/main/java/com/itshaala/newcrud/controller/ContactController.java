package com.itshaala.newcrud.controller;

import com.itshaala.newcrud.dao.ContactDao;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import com.itshaala.newcrud.model.Contact;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.itshaala.newcrud.service.ContactService;

@CrossOrigin(origins = "http://localhost:5173")  // React dev server URL
@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor

public class ContactController {
    private final ContactService service;

    @PostMapping
    public ResponseEntity<Contact> createContact(@Valid @RequestBody ContactDao dao) {
        Contact created = service.create(dao);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long id, @Valid @RequestBody ContactDao dao) {
        Contact updated = service.update(id, dao);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<Page<Contact>> searchContacts(
            @RequestParam(required = false) String search,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size
    ) {
        Page<Contact> results = service.search(search, page, size);
        return ResponseEntity.ok(results);
    }
}
