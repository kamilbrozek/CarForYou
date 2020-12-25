package com.kamilbrozek.carforyou.core.service;

import java.util.List;

public interface BaseService <T> {

    List<T> getAllEntities();
    T getEntityByID(Long id);
    void addEntity(T entity);
    void deleteEntityByID(Long id);
    void deleteEntity(T entity);
    void editEntity(Long id, T entity);

}
