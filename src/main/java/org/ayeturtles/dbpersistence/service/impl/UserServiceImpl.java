package org.ayeturtles.dbpersistence.service.impl;

import org.ayeturtles.dbpersistence.dto.User;
import org.ayeturtles.dbpersistence.entities.user.UserReq;
import org.ayeturtles.dbpersistence.entities.user.UserRes;
import org.ayeturtles.dbpersistence.mapper.UserMapper;
import org.ayeturtles.dbpersistence.repository.UserRepository;
import org.ayeturtles.dbpersistence.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper mapper;

    @Override
    public List<UserRes> getUsers() {
        return repository.findAll().stream().map(mapper::toRes).collect(Collectors.toList());
    }

    @Override
    public UserRes getUserById(Integer id) {
        return mapper.toRes(repository.findUserById(id));
    }

    @Override
    public UserRes createUser(UserReq userReq) {
        User res = repository.saveAndFlush(mapper.toDto(userReq));
        return mapper.toRes(res);
    }

    @Override
    public UserRes updateUser(UserReq userReq) {
        User res = repository.saveAndFlush(mapper.toDto(userReq));
        return mapper.toRes(res);
    }

    @Override
    public UserRes deleteUser(Integer id) {
        return mapper.toRes(repository.deleteUserById(id));
    }
}
