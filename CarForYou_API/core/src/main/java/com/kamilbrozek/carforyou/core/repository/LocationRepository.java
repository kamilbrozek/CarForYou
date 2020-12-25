package com.kamilbrozek.carforyou.core.repository;

import com.kamilbrozek.carforyou.core.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location,Long> {
}
