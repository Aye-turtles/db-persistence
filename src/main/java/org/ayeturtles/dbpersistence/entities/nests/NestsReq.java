package org.ayeturtles.dbpersistence.entities.nests;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.dto.Organizations;
import org.ayeturtles.dbpersistence.dto.Sensors;
import org.ayeturtles.dbpersistence.dto.User;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NestsReq {

    private Integer id;
    private String latitude;
    private String longitude;

    private Sensors sensor;

    private Organizations organization;

    private User responsible;

    private Boolean isActive;
    private Integer eggsQuantity;
    private Integer hatchlingsQuantity;
    private Integer depredatedEggsQuantity;
    private Integer infertileEggs;
    private Character zone;
    private Timestamp layingDate;
    private Timestamp collectionDate;
    private Timestamp monitoringStartDate;
    private Timestamp monitoringEndDate;
    private Timestamp firstHatchingRecordedDate;
    private Timestamp lastHatchingRecordedDate;
    private Timestamp nestCleaningDate;
    private String nestBehavior;

}
