package org.ayeturtles.dbpersistence.entities.records;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.dto.Nests;
import org.ayeturtles.dbpersistence.entities.nests.NestsReq;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecordsReq {

    private Integer id;
    private NestsReq nest;
    private Timestamp samplingDateTime;
    private Float temperature;
    private Float humidityPercentage;
    private Float energy;
    private Float x;
    private Float y;
    private Float z;
    private Integer recordNumber;
    private Float day;
}
