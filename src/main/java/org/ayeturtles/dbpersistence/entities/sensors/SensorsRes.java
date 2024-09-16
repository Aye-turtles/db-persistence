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

    @JsonProperty("softwareVersion")
    private String softwareVersion;

    @JsonProperty("hardwareVersion")
    private String hardwareVersion;

    @JsonProperty("components")
    private String components;

    @JsonProperty("temperatureOffset")
    private String temperatureOffset;

    @JsonProperty("moistureOffset")
    private String moistureOffset;

    @JsonProperty("isInUse")
    private Boolean isInUse;

    @JsonProperty("dateManufactured")
    private Timestamp dateManufactured;

    @JsonProperty("organization")
    private OrganizationsRes organization;
}
