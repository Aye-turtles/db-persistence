package org.ayeturtles.dbpersistence.service;

import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IOrganizationService {
    Page<OrganizationsRes> getOrganizations(Pageable pageable);

    OrganizationsRes getOrganizationById(Integer id);

    OrganizationsRes createOrganization(OrganizationsReq organizationsReq);

    OrganizationsRes updateOrganization(OrganizationsReq organizationsReq);

    void deleteOrganization(Integer id);

    List<OrganizationsRes> getOrganizations();
}
