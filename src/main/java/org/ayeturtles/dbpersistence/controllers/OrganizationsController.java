package org.ayeturtles.dbpersistence.controllers;


import org.ayeturtles.dbpersistence.entities.org.OrganizationsReq;
import org.ayeturtles.dbpersistence.entities.org.OrganizationsRes;
import org.ayeturtles.dbpersistence.service.IOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org")
public class OrganizationsController {

    @Autowired
    private IOrganizationService service;

    @GetMapping
    public ResponseEntity<Page<OrganizationsRes>> getOrgs(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.getOrganizations(
                PageRequest.of(page, size)
        ));
    }
    @GetMapping("/{id}")
    public ResponseEntity<OrganizationsRes> getOrgbyID(@PathVariable String id){
        return ResponseEntity.ok(service.getOrganizationById(Integer.valueOf(id)));
    }


    @GetMapping("/all")
    public ResponseEntity<List<OrganizationsRes>> getAllOrganizations(){
        return ResponseEntity.ok(service.getOrganizations());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrgByID(@PathVariable Integer id){
        service.deleteOrganization(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrganizationsRes> updateOrgByID(@PathVariable Integer id, @RequestBody OrganizationsReq body){
        body.setId(id);
        OrganizationsRes res = service.updateOrganization(body);
        if (res != null){
            return ResponseEntity.ok(res);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<OrganizationsRes> createOrg(@RequestBody OrganizationsReq req){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createOrganization(req));
    }
}
