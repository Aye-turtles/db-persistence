package org.ayeturtles.dbpersistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Nests")
public class Nests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(unique = true)
    private String assignedID;

    private String latitude;
    private String longitude;

    @OneToOne
    private Sensors sensor;

    @ManyToOne
    private Organizations organization;

    @ManyToOne
    private Users responsible;

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
