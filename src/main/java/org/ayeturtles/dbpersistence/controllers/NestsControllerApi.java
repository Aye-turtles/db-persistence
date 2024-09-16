package org.ayeturtles.dbpersistence.controllers;


import org.ayeturtles.dbpersistence.entities.nests.NestsReq;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class NestsControllerApi implements NestController {
    private static final Logger log = LoggerFactory.getLogger(OrganizationsApiController.class);


    @Autowired
    private NestService nestService;

    @Override
    public ResponseEntity<List<NestsRes>> getNests() {
        return new ResponseEntity<List<NestsRes>>(nestService.getNests(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<NestsRes>> getNestById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteNestByID(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<NestsRes> updateNestByID(Integer id, NestsReq body) {
        return null;
    }

    @Override
    public ResponseEntity<NestsRes> createNest(NestsReq body) {
        return null;
    }
}
