package com.javanalta.agendadortarefa.infastructure.repository;

import com.javanalta.agendadortarefa.infastructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
