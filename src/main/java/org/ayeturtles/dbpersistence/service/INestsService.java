package org.ayeturtles.dbpersistence.service;

import org.ayeturtles.dbpersistence.entities.nests.NestsReq;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface INestsService {
    List<NestsRes> getNests(Pageable pageable);
    NestsRes getNestById(Integer id);
    NestsRes createNest(NestsReq NestReq);
    NestsRes updateNest(NestsReq NestReq);
    NestsRes deleteNest(Integer id);
}
