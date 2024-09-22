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
                .temperatureMaxError(request.getTemperatureMaxError())
                .temperatureMinError(request.getTemperatureMinError())
                .moistureMaxError(request.getMoistureMaxError())
                .moistureMinError(request.getMoistureMinError())
                .z1MaxError(request.getZ1MaxError())
                .zMinError(request.getZMinError())
                .xMaxError(request.getXMaxError())
                .xMinError(request.getXMinError())
                .yMaxError(request.getYMaxError())
                .yMinError(request.getYMinError())
                .isInUse(request.getIsInUse())
                .dateManufactured(request.getDateManufactured())
                .organization(organizationMapper.toDto(request.getOrganization()))
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
                .temperatureMaxError(dto.getTemperatureMaxError())
                .temperatureMinError(dto.getTemperatureMinError())
                .moistureMaxError(dto.getMoistureMaxError())
                .moistureMinError(dto.getMoistureMinError())
                .z1MaxError(dto.getZ1MaxError())
                .zMinError(dto.getZMinError())
                .xMaxError(dto.getXMaxError())
                .xMinError(dto.getXMinError())
                .yMaxError(dto.getYMaxError())
                .yMinError(dto.getYMinError())
                .isInUse(dto.getIsInUse())
                .dateManufactured(dto.getDateManufactured())
                .organization(organizationMapper.toRes(dto.getOrganization()))
                .build();
    }
}
