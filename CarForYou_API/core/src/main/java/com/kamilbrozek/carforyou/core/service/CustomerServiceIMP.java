package com.kamilbrozek.carforyou.core.service;


import com.kamilbrozek.carforyou.core.model.Car;
import com.kamilbrozek.carforyou.core.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceIMP implements CustomerService {

    @Override
    public List<Customer> getAllEntities() {
        return null;
    }

    @Override
    public Customer getEntityByID(Long id) {
        return null;
    }

    @Override
    public void addEntity(Customer entity) {

    }

    @Override
    public void deleteEntityByID(Long id) {

    }

    @Override
    public void deleteEntity(Customer entity) {

    }

    @Override
    public void editEntity(Long id, Customer entity) {

    }
}
