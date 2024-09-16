package org.ayeturtles.dbpersistence.controllers;

import org.ayeturtles.dbpersistence.entities.nests.NestsRes;

import java.util.List;

public interface NestService {
    List<NestsRes> getNests();
}
