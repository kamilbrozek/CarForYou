package com.kamilbrozek.carforyou.core.service;

import com.kamilbrozek.carforyou.core.model.Car;
import com.kamilbrozek.carforyou.core.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceIMP implements CarService {

    private CarRepository repo;

    @Override
    public List<Car> getAllEntities() {
        return repo.findAll();
    }

    @Override
    public Car getEntityByID(Long id) {
        return repo.getOne(id);
    }

    @Override
    public void addEntity(Car entity) {
        repo.save(entity);
    }

    @Override
    public void deleteEntityByID(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteEntity(Car entity) {
        repo.delete(entity);
    }

    @Override
    public void editEntity(Long id, Car entity) {
        Car car = repo.getOne(id);
        car.setAirConditioned(entity.getAirConditioned());
        car.setCarMake(entity.getCarMake());

    }
}
