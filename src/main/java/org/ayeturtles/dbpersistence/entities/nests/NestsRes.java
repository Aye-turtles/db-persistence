package org.ayeturtles.dbpersistence.entities.nests;

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
    private Integer id;
    private String latitude;
    private String longitude;

    private SensorsRes sensor;
    private OrganizationsRes organization;
    private UserRes responsible;

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
