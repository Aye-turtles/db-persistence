package org.ayeturtles.dbpersistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity()
@Table(name = "Events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long eventId;

    @Column(name = "Event_type", nullable = false, length = 1)
    private String eventType;

    @Column(name = "Event_date_time", nullable = false)
    private LocalDateTime eventDateTime;

    @Column(name = "Org_ID", nullable = false)
    private Long orgId;

    @Column(name = "Parameter_change", nullable = false)
    private Boolean parameterChange;

    @Column(name = "Parameters_ID")
    private Long parametersId;

    @Column(name = "Nest_ID")
    private Long nestId;

    @Column(name = "Report_ID")
    private Long reportId;

    @Column(name = "Sensor_ID")
    private Long sensorId;

    @Column(name = "Comm_ID")
    private Long commId;

    @Column(name = "Reset", nullable = false)
    private Boolean reset;

    @Column(name = "Shutdown", nullable = false)
    private Boolean shutdown;

    @Column(name = "Battery_level")
    private Integer batteryLevel;

    @Column(name = "Percent_capacity", nullable = false)
    private Integer percentCapacity;

    @ManyToMany(mappedBy = "eventId")
    private Collection<Report> reports;

    public Collection<Report> getReports() {
        return reports;
    }

    public void setReports(Collection<Report> reports) {
        this.reports = reports;
    }
}
