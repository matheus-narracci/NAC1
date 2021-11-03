package com.fiap.servicocliente.repository;

import com.fiap.servicocliente.model.Atividade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AtividadeRepository extends MongoRepository<Atividade, String> {
}
