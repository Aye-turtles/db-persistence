package org.ayeturtles.dbpersistence.entities.sensors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorsRes {
    private Integer id;
    private String assignedID;
    private String softwareVersion;
    private String hardwareVersion;
    private String components;
    private Float temperatureError;
    private Float moistureMinError;
    private Float moistureMaxError;
    private Float xerror;
    private Float yerror;
    private Float zerror;
    private Boolean isInUse;
    private LocalDate dateManufactured;
    private OrganizationsRes organization;
    private Float nrSumar;
    private Integer timing;
}
