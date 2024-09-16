package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.Nests;
import org.ayeturtles.dbpersistence.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NestsRepository extends JpaRepository<Nests, Integer> {
    List<Nests> findAll();

    Nests findNestsById(Integer id);

    Nests deleteNestsById(Integer id);
}
