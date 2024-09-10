package org.ayeturtles.dbpersistence.dto;

import com.sun.java.accessibility.util.EventID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "File_name", nullable = false, length = 255)
    private String fileName;

    @Column(name = "Days_active", nullable = false)
    private Integer daysActive;

    @Column(name = "Report_number", nullable = false)
    private Integer reportNumber;

    @Column(name = "Start_date_time", nullable = false)
    private LocalDateTime startDateTime;

    @Column(name = "Secs_per_record")
    private Integer secsPerRecord;

    @Column(name = "Number_of_records")
    private Integer numberOfRecords;

    @Column(name = "Average_magnitude")
    private Double averageMagnitude;

    @Column(name = "Highest_maximum")
    private Double highestMaximum;

    @Column(name = "Lowest_maximum")
    private Double lowestMaximum;

    @Column(name = "Highest_energy")
    private Double highestEnergy;

    @Column(name = "Lowest_energy")
    private Double lowestEnergy;

    @Column(name = "Average_temperature")
    private Double averageTemperature;

    @Column(name = "Highest_temperature")
    private Double highestTemperature;

    @Column(name = "Lowest_temperature")
    private Double lowestTemperature;
}
