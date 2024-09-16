package org.ayeturtles.dbpersistence.entities.sensors;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.dto.Organizations;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorsReq {


    private Integer id;
    private String softwareVersion;
    private String hardwareVersion;
    private String components;
    private String temperatureOffset;
    private String moistureOffset;
    private Boolean isInUse;
    private Timestamp dateManufactured;
    private Organizations organization;
}
