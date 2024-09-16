package org.ayeturtles.dbpersistence.controllers;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.ayeturtles.dbpersistence.entities.nests.NestsReq;
import org.ayeturtles.dbpersistence.entities.nests.NestsRes;
import org.ayeturtles.dbpersistence.service.INestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nest")
public class NestsController {

    @Autowired
    private INestsService nestService;

    @GetMapping()
    public ResponseEntity<Page<NestsRes>> getNests(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<NestsRes> result = nestService.getNests(pageable);
        return ResponseEntity.ok(result);
    }

    // Obtener todos los nidos
    @GetMapping("/all")
    public ResponseEntity<List<NestsRes>> getAllNests() {
        List<NestsRes> result = nestService.getNests();
        return ResponseEntity.ok(result);
    }

    // Obtener nido por ID
    @GetMapping("/{id}")
    public ResponseEntity<NestsRes> getNestById(@PathVariable("id") Integer id) {
        NestsRes result = nestService.getNestById(id);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar nido por ID
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteNestByID(@PathVariable("id") Integer id) {
        nestService.deleteNest(id);
        return ResponseEntity.noContent().build();
    }

    // Actualizar nido por ID
    @PutMapping(value = "/{id}")
    public ResponseEntity<NestsRes> updateNestByID(@PathVariable("id") Integer id,
                                                   @RequestBody NestsReq body) {
        body.setId(id);
        NestsRes updatedNest = nestService.updateNest(body);
        if (updatedNest != null) {
            return ResponseEntity.ok(updatedNest);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear un nuevo nido
    @PostMapping
    public ResponseEntity<NestsRes> createNest(
            @Parameter(in = ParameterIn.DEFAULT, description = "Nest object that needs to be added",
                    required = true, schema = @Schema()) @Valid @RequestBody NestsReq body) {
        NestsRes createdNest = nestService.createNest(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdNest);
    }
}