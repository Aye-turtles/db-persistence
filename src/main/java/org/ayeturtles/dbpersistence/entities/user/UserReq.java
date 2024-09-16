package org.ayeturtles.dbpersistence.entities.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserReq {
    private Integer id;
    private String name;
    private String lastName;
    private Boolean isActive;
    private String title;
    private String phone;
    private String email;
    private String password;
    private String tempPassword;
    private Boolean isAdministrator;
}
