package org.ayeturtles.dbpersistence.entities.org;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.entities.user.UserReq;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganizationsReq {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dateActive")
    private LocalDate dateActive;
    @JsonProperty("dateInactive")
    private LocalDate dateInactive;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("contact")
    private UserReq contact;
    @JsonProperty("members")
    private List<UserReq> members;
}
