package org.ayeturtles.dbpersistence.service;

import org.ayeturtles.dbpersistence.entities.user.UserReq;
import org.ayeturtles.dbpersistence.entities.user.UserRes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {
    Page<UserRes> getUsers(Pageable pageable);
    UserRes getUserById(Integer id);
    UserRes createUser(UserReq userReq);
    UserRes updateUser(UserReq userReq);
    UserRes deleteUser(Integer id);
}
