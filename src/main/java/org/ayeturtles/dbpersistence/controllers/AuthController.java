package org.ayeturtles.dbpersistence.controllers;

import org.ayeturtles.dbpersistence.entities.user.LoginReq;
import org.ayeturtles.dbpersistence.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginReq req) {
        return userService.loginUser(req);
    }

}
