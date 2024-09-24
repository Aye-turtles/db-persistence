package org.ayeturtles.dbpersistence.controllers;

import org.ayeturtles.dbpersistence.entities.user.UserReq;
import org.ayeturtles.dbpersistence.entities.user.UserRes;
import org.ayeturtles.dbpersistence.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllers {
    @Autowired
    private IUserService service;

    @GetMapping
    public ResponseEntity<Page<UserRes>> getUsers(
            @RequestParam Integer page,
            @RequestParam Integer size
    ) {
        return ResponseEntity.ok(service.getUsers(
                PageRequest.of(page, size)
        ));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserRes>> getAllUsers(){
        return ResponseEntity.ok(service.getUsers());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsersByID(@PathVariable Integer id){
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserRes> updateUsersByID(@PathVariable Integer id, @RequestBody UserReq body){
        body.setId(id);
        UserRes res = service.updateUser(body);
        if (res != null){
            return ResponseEntity.ok(res);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<UserRes> createUsers(@RequestBody UserReq req){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(req));
    }
}
