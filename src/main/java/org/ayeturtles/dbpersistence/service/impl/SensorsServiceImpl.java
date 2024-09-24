package org.ayeturtles.dbpersistence.service.impl;

import org.ayeturtles.dbpersistence.dto.Sensors;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsRes;
import org.ayeturtles.dbpersistence.mapper.SensorManualMapper;
import org.ayeturtles.dbpersistence.repository.SensorRepository;
import org.ayeturtles.dbpersistence.service.ISensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SensorsServiceImpl implements ISensorService {
    @Autowired
    private SensorRepository repository;
    @Autowired
    private SensorManualMapper mapper;

    @Override
    public Page<SensorsRes> getSensors(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toRes);
    }

    @Override
    public List<SensorsRes> getSensors() {
        return repository.findAll().stream().map(mapper::toRes).collect(Collectors.toList());
    }

    @Override
    public SensorsRes getSensorById(Integer id) {
        return mapper.toRes(repository.getReferenceById(id));
    }

    @Override
    public SensorsRes createSensor(SensorsReq SensorsReq) {
        Sensors dto = mapper.toDto(SensorsReq);
        dto.setNrSumar(calulateNrSuma(dto.getTiming()));
        Sensors res = repository.saveAndFlush(dto);
        return mapper.toRes(res);
    }

    private Float calulateNrSuma(Integer timing) {
        float s = (float) timing /1000;
        float m = s/60;
        float CRH = m/60;
        float CRD = CRH * 24;
        return 1/CRD;
    }

    @Override
    public SensorsRes updateSensor(SensorsReq SensorsReq) {
        Sensors res = repository.saveAndFlush(mapper.toDto(SensorsReq));
        return mapper.toRes(res);
    }

    @Override
    public void deleteSensor(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Sensors getSensorByAssignedID(String sensorAssignedID) {
        return repository.findByAssignedIDAndIsInUse(sensorAssignedID, true);
    }
}