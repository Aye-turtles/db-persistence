package org.ayeturtles.dbpersistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Nest_Alerts")
public class NestAlerts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
