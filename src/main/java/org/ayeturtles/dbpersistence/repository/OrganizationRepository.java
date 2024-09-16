package org.ayeturtles.dbpersistence.repository;

import org.ayeturtles.dbpersistence.dto.Organizations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organizations, Integer> {
    Page<Organizations> findAll(Pageable pageable);
}
