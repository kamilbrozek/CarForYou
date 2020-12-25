package com.kamilbrozek.carforyou.core.service;

import com.kamilbrozek.carforyou.core.model.User;

import java.util.List;

public interface UserService extends BaseService<User> {
    void activeUser(Long id);

}
