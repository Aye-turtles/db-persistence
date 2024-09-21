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
@Table(name = "Records")
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    private Nests nest;
    private Timestamp samplingDateTime;
    private Float temperature;
    private Float humidityPercentage;
    private Float energy;
    private Float x;
    private Float y;
    private Float z;
    private Integer timing;
    private Boolean isTesting;
    private Integer recordNumber;
    private Float day;
}
