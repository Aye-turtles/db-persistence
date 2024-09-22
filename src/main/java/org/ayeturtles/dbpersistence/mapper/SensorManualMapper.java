package org.ayeturtles.dbpersistence.mapper;


import org.ayeturtles.dbpersistence.dto.Sensors;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsRes;

public interface SensorManualMapper {
    Sensors toDto(SensorsReq request);
    SensorsRes toRes(Sensors sensors);
}
