package org.ayeturtles.dbpersistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Battery_Levels")
public class BatteryLevels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
