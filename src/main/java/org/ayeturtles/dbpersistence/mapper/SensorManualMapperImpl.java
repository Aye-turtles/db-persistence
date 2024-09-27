package org.ayeturtles.dbpersistence.mapper;

import org.ayeturtles.dbpersistence.dto.Sensors;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SensorManualMapperImpl implements SensorManualMapper {
    @Autowired
    private OrganizationMapper organizationMapper;
    @Override
    public Sensors toDto(SensorsReq request) {

        return Sensors.builder()
                .id(request.getId())
                .assignedID(request.getAssignedID())
                .softwareVersion(request.getSoftwareVersion())
                .hardwareVersion(request.getHardwareVersion())
                .components(request.getComponents())
                .temperatureError(request.getTemperatureError())
                .moistureMaxError(request.getMoistureMaxError())
                .moistureMinError(request.getMoistureMinError())
                .zerror(request.getZerror())
                .xerror(request.getXerror())
                .yerror(request.getYerror())
                .isInUse(request.getIsInUse())
                .dateManufactured(request.getDateManufactured())
                .organization(organizationMapper.toDto(request.getOrganization()))
                .nrSumar(request.getNrSumar())
                .timing(request.getTiming())
                .build();
    }

    @Override
    public SensorsRes toRes(Sensors dto) {
        return SensorsRes.builder()
                .id(dto.getId())
                .assignedID(dto.getAssignedID())
                .softwareVersion(dto.getSoftwareVersion())
                .hardwareVersion(dto.getHardwareVersion())
                .components(dto.getComponents())
                .temperatureError(dto.getTemperatureError())
                .moistureMaxError(dto.getMoistureMaxError())
                .moistureMinError(dto.getMoistureMinError())
                .zerror(dto.getZerror())
                .xerror(dto.getXerror())
                .yerror(dto.getYerror())
                .isInUse(dto.getIsInUse())
                .dateManufactured(dto.getDateManufactured())
                .organization(organizationMapper.toRes(dto.getOrganization()))
                .nrSumar(dto.getNrSumar())
                .timing(dto.getTiming())
                .build();
    }
}
