package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.Nests;
import org.ayeturtles.dbpersistence.dto.Sensors;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NestsRepository extends JpaRepository<Nests, Integer> {
    Page<Nests> findAll(Pageable pageable);
    Nests findByAssignedID(String assignedID);
    Nests findBySensorAndIsActive(Sensors sensor, boolean isInUse);
    List<Nests> findByAssignedIDIsNotNullOrderById();
}
