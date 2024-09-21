package org.ayeturtles.dbpersistence.entities.sensors;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.dto.Organizations;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorsReq {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("softwareVersion")
    private String softwareVersion;
    @JsonProperty("hardwareVersion")
    private String hardwareVersion;
    @JsonProperty("components")
    private String components;
    @JsonProperty("isInUse")
    private Boolean isInUse;
    @JsonProperty("dateManufactured")
    private Timestamp dateManufactured;
    @JsonProperty("assignedID")
    private String assignedID;
    @JsonProperty("temperatureMinError")
    private Float temperatureMinError;
    @JsonProperty("temperatureMaxError")
    private Float temperatureMaxError;
    @JsonProperty("moistureMinError")
    private Float moistureMinError;
    @JsonProperty("moistureMaxError")
    private Float moistureMaxError;
    @JsonProperty("xMinError")
    private Float xMinError;
    @JsonProperty("xMaxError")
    private Float xMaxError;
    @JsonProperty("yMinError")
    private Float yMinError;
    @JsonProperty("yMaxError")
    private Float yMaxError;
    @JsonProperty("zMinError")
    private Float zMinError;
    @JsonProperty("z1MaxError")
    private Float z1MaxError;
    @JsonProperty("organization")
    private OrganizationsReq organization;
}
