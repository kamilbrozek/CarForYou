package com.kamilbrozek.carforyou.core.controller;


import com.kamilbrozek.carforyou.core.model.User;
import com.kamilbrozek.carforyou.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/user")
public class UserController {

    @Autowired
    private UserService svc;

    @GetMapping(value = "/all",produces = "application/json")
    public List<User> getUsers() {
        return svc.getAllEntities();
    }

    @GetMapping(value = "/{ID}",produces = "application/json")
    public User getUserByID(@PathVariable("ID") Long id){
        return svc.getEntityByID(id);
    }

    @PostMapping(value = "/signup")
    public void createUser(@Valid @RequestBody User user) {
        svc.addEntity(user);
    }

    @PostMapping(value = "/update/{ID}")
    public void updateUser(@PathVariable("ID") Long id, @Valid @RequestBody User user) {
        svc.editEntity(id,user);
    }

    @PostMapping(value = "/delete/{ID}")
    public void deleteUser(@PathVariable("ID") Long id){

    }



}
