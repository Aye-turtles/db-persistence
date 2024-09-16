package org.ayeturtles.dbpersistence.service.impl;

import org.ayeturtles.dbpersistence.dto.Nests;
import org.ayeturtles.dbpersistence.entities.nests.NestsReq;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;
import org.ayeturtles.dbpersistence.mapper.NestsMapper;
import org.ayeturtles.dbpersistence.repository.NestsRepository;
import org.ayeturtles.dbpersistence.service.INestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class NestsServiceImpl implements INestsService {
    @Autowired
    private NestsRepository repository;
    @Autowired
    private NestsMapper mapper;

    @Override
    public Page<NestsRes> getNests(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toRes);
    }

    @Override
    public NestsRes getNestById(Integer id) {
        return mapper.toRes(repository.findNestsById(id));
    }

    @Override
    public NestsRes createNest(NestsReq NestsReq) {
        Nests res = repository.saveAndFlush(mapper.toDto(NestsReq));
        return mapper.toRes(res);
    }

    @Override
    public NestsRes updateNest(NestsReq NestsReq) {
        Nests res = repository.saveAndFlush(mapper.toDto(NestsReq));
        return mapper.toRes(res);
    }

    @Override
    public NestsRes deleteNest(Integer id) {
        return mapper.toRes(repository.deleteNestsById(id));
    }
}
