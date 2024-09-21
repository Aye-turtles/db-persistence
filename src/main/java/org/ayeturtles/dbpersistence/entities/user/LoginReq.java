package org.ayeturtles.dbpersistence.entities.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginReq {

    @JsonProperty("id")
    private String email;
    @JsonProperty("id")
    private String password;
}
