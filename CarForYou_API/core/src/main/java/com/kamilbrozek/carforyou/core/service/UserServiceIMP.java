package com.kamilbrozek.carforyou.core.service;


import com.kamilbrozek.carforyou.core.model.User;
import com.kamilbrozek.carforyou.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Converter;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIMP implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public List<User> getAllEntities() {

        return repo.findAll();
    }

    @Override
    public User getEntityByID(Long id) {
        return repo.getOne(id);
    }

    @Override
    public void addEntity(User entity) {
        repo.save(entity);
    }

    @Override
    public void deleteEntityByID(Long id) {

    }

    @Override
    public void deleteEntity(User entity) {
        repo.delete(entity);
    }

    @Override
    public void editEntity(Long id, User entity) {
        User usr = repo.getOne(id);
        usr.setPassword(entity.getPassword());
        usr.setEmail(entity.getEmail());
        usr.setLogin(entity.getLogin());
        repo.save(usr);

    }

    @Override
    public void activeUser(Long id) {
        User usr = repo.getOne(id);
        usr.setActive(true);
        repo.save(usr);
    }
}
