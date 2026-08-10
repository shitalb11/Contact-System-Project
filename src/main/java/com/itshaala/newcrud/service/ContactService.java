package com.itshaala.newcrud.service;

import com.itshaala.newcrud.dao.ContactDao;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import com.itshaala.newcrud.model.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.itshaala.newcrud.repo.ContactRepository;

@Service
@RequiredArgsConstructor

public class ContactService {
    private final ContactRepository repository;

    public Contact create(ContactDao dao) {
        Contact contact = Contact.builder()
                .name(dao.getName())
                .email(dao.getEmail())
                .phone(dao.getPhone())
                .address(dao.getAddress())
                .build();
        return repository.save(contact);
    }

    public Contact update(Long id, ContactDao dao) {
        Contact existing = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contact not found with id " + id));
        existing.setName(dao.getName());
        existing.setEmail(dao.getEmail());
        existing.setPhone(dao.getPhone());
        existing.setAddress(dao.getAddress());
        return repository.save(existing);
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Contact not found with id " + id);
        }
        repository.deleteById(id);
    }

    public Contact getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contact not found with id " + id));
    }

    public Page<Contact> search(String q, int page, int size) {
        if (q == null || q.isBlank()) {
            return repository.findAll(PageRequest.of(page, size));
        }
        return repository.search(q.trim(), PageRequest.of(page, size));
    }
}
