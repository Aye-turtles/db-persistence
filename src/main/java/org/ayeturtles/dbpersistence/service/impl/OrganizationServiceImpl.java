package org.ayeturtles.dbpersistence.service.impl;

import org.ayeturtles.dbpersistence.dto.Organizations;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.ayeturtles.dbpersistence.mapper.OrganizationMapper;
import org.ayeturtles.dbpersistence.repository.OrganizationRepository;
import org.ayeturtles.dbpersistence.service.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrganizationServiceImpl implements IOrganizationService {
    @Autowired
    private OrganizationRepository repository;

    @Autowired
    private OrganizationMapper mapper;

    @Override
    public Page<OrganizationsRes> getOrganizations(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toRes);
    }

    @Override
    public OrganizationsRes getOrganizationById(Integer id) {
        return mapper.toRes(repository.getReferenceById(id));
    }

    @Override
    public OrganizationsRes createOrganization(OrganizationsReq organizationsReq) {
        Organizations res = repository.saveAndFlush(mapper.toDto(organizationsReq));
        return mapper.toRes(res);
    }

    @Override
    public OrganizationsRes updateOrganization(OrganizationsReq organizationsReq) {
        Organizations res = repository.saveAndFlush(mapper.toDto(organizationsReq));
        return mapper.toRes(res);
    }

    @Override
    public void deleteOrganization(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<OrganizationsRes> getOrganizations() {
        return repository.findAll().stream().map(org -> mapper.toRes(org)).collect(Collectors.toList());
    }
}
