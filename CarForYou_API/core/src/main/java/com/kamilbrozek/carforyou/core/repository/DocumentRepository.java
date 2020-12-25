package com.kamilbrozek.carforyou.core.repository;

import com.kamilbrozek.carforyou.core.model.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {

}
