package org.ayeturtles.dbpersistence.entities.records;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecordsRes {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nest")
    private NestsRes nest;
    @JsonProperty("samplingDateTime")
    private LocalDateTime samplingDateTime;
    @JsonProperty("temperature")
    private Float temperature;
    @JsonProperty("humidityPercentage")
    private Float humidityPercentage;
    @JsonProperty("energy")
    private Float energy;
    @JsonProperty("x")
    private Float x;
    @JsonProperty("y")
    private Float y;
    @JsonProperty("z")
    private Float z;
    @JsonProperty("isTesting")
    private Boolean isTesting;
    @JsonProperty("recordNumber")
    private Integer recordNumber;
    @JsonProperty("day")
    private Float day;
}
