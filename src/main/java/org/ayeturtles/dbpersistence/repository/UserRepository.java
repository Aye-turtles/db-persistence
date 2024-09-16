package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Page<User> findAll(Pageable pageable);

    User findUserById(Integer id);

    User deleteUserById(Integer id);
}
