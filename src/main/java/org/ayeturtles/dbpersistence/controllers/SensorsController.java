package org.ayeturtles.dbpersistence.controllers;

import org.ayeturtles.dbpersistence.entities.sensors.SensorsReq;
import org.ayeturtles.dbpersistence.entities.sensors.SensorsRes;
import org.ayeturtles.dbpersistence.service.ISensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sensors")
public class SensorsController {
    @Autowired
    private ISensorService service;

    @GetMapping
    public ResponseEntity<Page<SensorsRes>> getSensors(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.getSensors(
                PageRequest.of(page, size)
        ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SensorsRes> getSensorByID(@PathVariable String id){
        return ResponseEntity.ok(service.getSensorById(Integer.valueOf(id)));
    }

    @GetMapping("/all")
    public ResponseEntity<List<SensorsRes>> getAllSensors(){
        return ResponseEntity.ok(service.getSensors());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSensorByID(@PathVariable Integer id){
        service.deleteSensor(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<SensorsRes> updateSensorByID(@PathVariable Integer id, @RequestBody SensorsReq body){
        body.setId(id);
        SensorsRes res = service.updateSensor(body);
        if (res != null){
            return ResponseEntity.ok(res);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<SensorsRes> createSensor(@RequestBody SensorsReq req){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createSensor(req));
    }
}
