package com.MicroserviciosTFG.GestorObras.repository;

import com.MicroserviciosTFG.GestorObras.entity.ObraEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ObraRepository extends MongoRepository <ObraEntity,Integer> {
}
