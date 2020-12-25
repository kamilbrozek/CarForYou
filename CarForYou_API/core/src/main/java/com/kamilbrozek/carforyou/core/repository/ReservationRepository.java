package com.kamilbrozek.carforyou.core.repository;


import com.kamilbrozek.carforyou.core.model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
