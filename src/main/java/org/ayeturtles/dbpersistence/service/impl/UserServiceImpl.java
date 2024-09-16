package org.ayeturtles.dbpersistence.service.impl;

import org.ayeturtles.dbpersistence.dto.Users;
import org.ayeturtles.dbpersistence.entities.user.LoginReq;
import org.ayeturtles.dbpersistence.entities.user.UserReq;
import org.ayeturtles.dbpersistence.entities.user.UserRes;
import org.ayeturtles.dbpersistence.mapper.UserMapper;
import org.ayeturtles.dbpersistence.repository.UserRepository;
import org.ayeturtles.dbpersistence.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;


    @Override
    public Page<UserRes> getUsers(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toRes);
    }

    @Override
    public List<UserRes> getUsers() {
        return repository.findAll().stream().map(mapper::toRes).collect(Collectors.toList());
    }

    @Override
    public UserRes getUserById(Integer id) {
        return mapper.toRes(repository.getReferenceById(id));
    }

    @Override
    public UserRes createUser(UserReq userReq) {
        Users res = repository.saveAndFlush(mapper.toDto(userReq));
        return mapper.toRes(res);
    }

    @Override
    public UserRes updateUser(UserReq userReq) {
        Users res = repository.saveAndFlush(mapper.toDto(userReq));
        return mapper.toRes(res);
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Boolean loginUser(LoginReq req) {
        Users user = repository.findByEmail(req.getEmail());
        return user != null && (Objects.equals(req.getPassword(), user.getPassword()) || (Objects.equals(req.getPassword(), user.getTempPassword())));
    }

    @Override
    public Users findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
