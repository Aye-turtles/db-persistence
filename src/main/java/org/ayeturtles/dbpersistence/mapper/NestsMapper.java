package org.ayeturtles.dbpersistence.mapper;

import org.ayeturtles.dbpersistence.dto.Nests;
import org.ayeturtles.dbpersistence.entities.nests.NestsReq;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NestsMapper {
    Nests toDto(NestsReq request);
    NestsRes toRes(Nests response);
}
