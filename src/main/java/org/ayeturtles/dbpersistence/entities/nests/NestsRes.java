package org.ayeturtles.dbpersistence.entities.nests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsRes;
import org.ayeturtles.dbpersistence.entities.user.UserRes;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NestsRes {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("assignedID")
    private String assignedID;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("sensor")
    private SensorsRes sensor;
    @JsonProperty("organization")
    private OrganizationsRes organization;
    @JsonProperty("responsible")
    private UserRes responsible;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("eggsQuantity")
    private Integer eggsQuantity;
    @JsonProperty("hatchlingsQuantity")
    private Integer hatchlingsQuantity;
    @JsonProperty("depredatedEggsQuantity")
    private Integer depredatedEggsQuantity;
    @JsonProperty("infertileEggs")
    private Integer infertileEggs;
    @JsonProperty("zone")
    private Character zone;
    @JsonProperty("layingDate")
    private Timestamp layingDate;
    @JsonProperty("collectionDate")
    private Timestamp collectionDate;
    @JsonProperty("monitoringStartDate")
    private Timestamp monitoringStartDate;
    @JsonProperty("monitoringEndDate")
    private Timestamp monitoringEndDate;
    @JsonProperty("firstHatchingRecordedDate")
    private Timestamp firstHatchingRecordedDate;
    @JsonProperty("lastHatchingRecordedDate")
    private Timestamp lastHatchingRecordedDate;
    @JsonProperty("nestCleaningDate")
    private Timestamp nestCleaningDate;
    @JsonProperty("nestBehavior")
    private String nestBehavior;

}
