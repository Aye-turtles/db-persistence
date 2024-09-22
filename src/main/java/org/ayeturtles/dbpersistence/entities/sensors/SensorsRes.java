package org.ayeturtles.dbpersistence.entities.sensors;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.dto.Organizations;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorsRes {
    @JsonProperty("id")
    private Integer id;

    private String assignedID;

    private String softwareVersion;
    private String hardwareVersion;

    private String components;
    private Float temperatureMinError;
    private Float temperatureMaxError;
    private Float moistureMinError;
    private Float moistureMaxError;
    private Float xMinError;
    private Float xMaxError;
    private Float yMinError;
    private Float yMaxError;
    private Float zMinError;
    private Float z1MaxError;

    private Boolean isInUse;
    private Timestamp dateManufactured;

    private OrganizationsRes organization;
}
