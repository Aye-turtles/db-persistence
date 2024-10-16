package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Page<Users> findAll(Pageable pageable);
    Users findByEmail(String email);
}
