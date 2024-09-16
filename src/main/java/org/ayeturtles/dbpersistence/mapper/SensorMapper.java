package org.ayeturtles.dbpersistence.mapper;

import org.ayeturtles.dbpersistence.dto.Sensors;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsRes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SensorMapper {
    Sensors toDto(SensorsReq request);
    SensorsRes toRes(Sensors sensors);
}
