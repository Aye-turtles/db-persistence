package org.ayeturtles.dbpersistence.controllers;


import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.ayeturtles.dbpersistence.entities.records.RecordsReq;
import org.ayeturtles.dbpersistence.entities.records.RecordsRes;
import org.ayeturtles.dbpersistence.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordsController {

    @Autowired
    private IRecordService service;
    @GetMapping("/nest/{nestID}")
    public ResponseEntity<List<RecordsRes>> getRecordsByNestID(@PathVariable String nestID){
        List<RecordsRes> res = service.getRecordsByNestID(nestID);
        if (res.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(res);
    }
    @GetMapping("/last/{nestID}")
    public ResponseEntity<RecordsRes> getLastRecordByNestID(@PathVariable String nestID){
        RecordsRes res = service.getLastRecordByNestID(nestID);
        if (res==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(res);
    }

    @GetMapping()
    public ResponseEntity<Page<RecordsRes>> getRecords(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<RecordsRes> result = service.getRecords(pageable);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/recent")
    public ResponseEntity<Page<RecordsRes>> getRecordsMostRecent() {
        Pageable pageable = PageRequest.of(1, 8);
        Page<RecordsRes> result = service.getRecords(pageable);
        return ResponseEntity.ok(result);
    }


    // Obtener todos los nidos
    @GetMapping("/all")
    public ResponseEntity<List<RecordsRes>> getAllRecords() {
        List<RecordsRes> result = service.getRecords();
        return ResponseEntity.ok(result);
    }

    // Obtener nido por ID
    @GetMapping("/{id}")
    public ResponseEntity<RecordsRes> getRecordById(@PathVariable("id") Integer id) {
        RecordsRes result = service.getRecordById(id);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar nido por ID
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteRecordByID(@PathVariable("id") Integer id) {
        service.deleteRecord(id);
        return ResponseEntity.noContent().build();
    }

    // Actualizar nido por ID
    @PutMapping(value = "/{id}")
    public ResponseEntity<RecordsRes> updateRecordByID(@PathVariable("id") Integer id,
                                                   @RequestBody RecordsReq body) {
        body.setId(id);
        RecordsRes updatedRecord = service.updateRecord(body);
        if (updatedRecord != null) {
            return ResponseEntity.ok(updatedRecord);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear un nuevo nido
    @PostMapping
    public ResponseEntity<RecordsRes> createRecord(
            @Parameter(in = ParameterIn.DEFAULT, description = "Record object that needs to be added",
                    required = true, schema = @Schema()) @Valid @RequestBody RecordsReq body) {
        RecordsRes createdRecord = service.createRecord(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRecord);
    }
}
