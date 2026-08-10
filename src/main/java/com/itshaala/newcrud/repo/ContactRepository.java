package com.itshaala.newcrud.repo;

import com.itshaala.newcrud.model.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Query("SELECT c FROM Contact c WHERE " +
            "LOWER(c.name) LIKE LOWER(CONCAT('%', :q, '%')) OR " +
            "LOWER(c.email) LIKE LOWER(CONCAT('%', :q, '%')) OR " +
            "LOWER(c.phone) LIKE LOWER(CONCAT('%', :q, '%'))")
    Page<Contact> search(@Param("q") String q, Pageable pageable);
}
