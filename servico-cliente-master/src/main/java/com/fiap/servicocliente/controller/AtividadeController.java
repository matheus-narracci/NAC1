package com.fiap.servicocliente.controller;

import com.fiap.servicocliente.model.Atividade;
import com.fiap.servicocliente.model.Cliente;
import com.fiap.servicocliente.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeRepository repository;

    @PostMapping()
    public ResponseEntity<Atividade> post(@RequestBody Atividade model ) {
        Atividade atividade =  repository.save( model);
        return new ResponseEntity<>(atividade, HttpStatus.CREATED) ;
    }

}
