package org.ayeturtles.dbpersistence.service;

import org.ayeturtles.dbpersistence.dto.User;
import org.ayeturtles.dbpersistence.entities.user.UserReq;
import org.ayeturtles.dbpersistence.entities.user.UserRes;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IUserService {
    List<User> getUsers();
    UserRes getUserById(Integer id);
    UserRes createUser(UserReq userReq);
    UserRes updateUser(UserReq userReq);
    UserRes deleteUser(Integer id);
}
