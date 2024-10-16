package org.ayeturtles.dbpersistence.mapper;

import org.ayeturtles.dbpersistence.dto.Users;
import org.ayeturtles.dbpersistence.entities.user.UserReq;
import org.ayeturtles.dbpersistence.entities.user.UserRes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    Users toDto(UserReq request);
    UserRes toRes(Users users);
}
