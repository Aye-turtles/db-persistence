package org.ayeturtles.dbpersistence.service;

import org.ayeturtles.dbpersistence.dto.Sensors;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsRes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISensorService {
    Page<SensorsRes> getSensors(Pageable pageable);
    List<SensorsRes> getSensors();
    SensorsRes getSensorById(Integer id);
    SensorsRes createSensor(SensorsReq nestReq);
    SensorsRes updateSensor(SensorsReq nestReq);
    void deleteSensor(Integer id);

    Sensors getSensorByAssignedID(String sensorAssignedID);
}
