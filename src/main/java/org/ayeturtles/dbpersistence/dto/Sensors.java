package org.ayeturtles.dbpersistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    private Float temperatureError;
    private Float moistureMinError;
    private Float moistureMaxError;
    private Float xerror;
    private Float yerror;
    private Float zerror;
    private Boolean isInUse;
    private LocalDate dateManufactured;
    @ManyToOne
    private Organizations organization;
    private Float nrSumar;
    private Integer timing;
}
