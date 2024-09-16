package org.ayeturtles.dbpersistence.entities.org;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ayeturtles.dbpersistence.entities.user.UserRes;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganizationsRes {
    private Integer id;
    private String name;
    private Timestamp dateActive;
    private Timestamp dateInactive;
    private Boolean isActive;
    private UserRes contact;
    private List<UserRes> members;
}
