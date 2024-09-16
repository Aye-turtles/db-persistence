package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.Records;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Records, Integer> {
    Page<Records> findAll(Pageable pageable);
}
