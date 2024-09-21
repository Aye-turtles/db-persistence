package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.Sensors;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensors, Integer> {
    Page<Sensors> findAll(Pageable pageable);

    Sensors findByAssignedIDAndIsInUse(String assignedID, boolean isInUse);
}
