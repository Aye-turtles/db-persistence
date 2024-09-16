package org.ayeturtles.dbpersistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "Sensors")
public class Sensors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String softwareVersion;
    private String hardwareVersion;
    private String components;
    private String temperatureOffset;
    private String moistureOffset;
    private Boolean isInUse;
    private Timestamp dateManufactured;
    @ManyToOne
    private Organizations organization;
}
