package com.kamilbrozek.carforyou.core.repository;


import com.kamilbrozek.carforyou.core.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
