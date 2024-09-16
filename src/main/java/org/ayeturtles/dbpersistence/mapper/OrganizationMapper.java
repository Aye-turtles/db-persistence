package org.ayeturtles.dbpersistence.mapper;

import org.ayeturtles.dbpersistence.dto.Organizations;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {
    Organizations toDto(OrganizationsReq req);
    OrganizationsRes toRes(Organizations organizations);
}
