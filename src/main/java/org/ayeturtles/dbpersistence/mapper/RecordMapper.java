package org.ayeturtles.dbpersistence.mapper;

import org.ayeturtles.dbpersistence.dto.Records;
import org.ayeturtles.dbpersistence.entities.records.RecordsReq;
import org.ayeturtles.dbpersistence.entities.records.RecordsRes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecordMapper {
    Records toDto(RecordsReq request);
    RecordsRes toRes(Records records);
}
