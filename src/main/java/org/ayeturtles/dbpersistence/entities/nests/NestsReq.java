package org.ayeturtles.dbpersistence.entities.nests;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.dto.Organizations;
import org.ayeturtles.dbpersistence.dto.Sensors;
import org.ayeturtles.dbpersistence.dto.User;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.user.UserReq;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NestsReq {

    private Integer id;
    private String latitude;
    private String longitude;

    private SensorsReq sensor;

    private OrganizationsReq organization;

    private UserReq responsible;

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
