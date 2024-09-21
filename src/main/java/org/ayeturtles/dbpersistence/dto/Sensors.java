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

    @Column(unique = true)
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
    @ManyToOne
    private Organizations organization;
}
