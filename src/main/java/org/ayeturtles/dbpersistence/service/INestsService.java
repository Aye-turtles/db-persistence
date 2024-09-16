package org.ayeturtles.dbpersistence.service;

import org.ayeturtles.dbpersistence.entities.nests.NestsReq;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface INestsService {
    Page<NestsRes> getNests(Pageable pageable);
    NestsRes getNestById(Integer id);
    NestsRes createNest(NestsReq nestReq);
    NestsRes updateNest(NestsReq nestReq);
    void deleteNest(Integer id);
    List<NestsRes> getNests();
}
