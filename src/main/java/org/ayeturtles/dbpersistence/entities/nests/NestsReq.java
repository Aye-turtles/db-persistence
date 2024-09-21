package org.ayeturtles.dbpersistence.entities.nests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.user.UserReq;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NestsReq {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("assignedID")
    private String assignedID;

    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("sensor")
    private SensorsReq sensor;

    @JsonProperty("organization")
    private OrganizationsReq organization;

    @JsonProperty("responsible")
    private UserReq responsible;

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
