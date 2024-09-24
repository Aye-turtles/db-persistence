package org.ayeturtles.dbpersistence.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "Organizations")
public class Organizations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private LocalDateTime dateActive;
    private LocalDateTime dateInactive;
    private Boolean isActive;
    @OneToOne
    private Users contact;
    @ManyToMany
    private List<Users> members;
}
