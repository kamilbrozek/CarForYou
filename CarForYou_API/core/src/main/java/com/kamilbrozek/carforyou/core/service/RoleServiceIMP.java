package com.kamilbrozek.carforyou.core.service;


import com.kamilbrozek.carforyou.core.model.Role;
import com.kamilbrozek.carforyou.core.model.User;
import com.kamilbrozek.carforyou.core.repository.RoleRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceIMP implements RoleService {
    private RoleRepository repo;

    @Override
    public List<Role> getAllEntities() {
        return repo.findAll();
    }

    @Override
    public Role getEntityByID(Long id) {
        return repo.getOne(id);
    }

    @Override
    public void addEntity(Role entity) {
        repo.save(entity);
    }

    @Override
    public void deleteEntityByID(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteEntity(Role entity) {
        repo.delete(entity);
    }

    @Override
    public void editEntity(Long id, Role entity) {
        Role role = repo.getOne(id);
        role.setRoleName(entity.getRoleName());
        repo.save(role);
    }
}
