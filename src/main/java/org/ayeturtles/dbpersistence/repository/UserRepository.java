package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();

    User findUserById(Integer id);

    User deleteUserById(Integer id);
}
