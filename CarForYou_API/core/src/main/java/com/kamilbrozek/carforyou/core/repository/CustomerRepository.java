package com.kamilbrozek.carforyou.core.repository;


import com.kamilbrozek.carforyou.core.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
