package com.fiap.servicocliente.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Atividade {
    @Id
    private String id;
    private String rm;
    private String nome;
    private String urlGithub;
    private Integer numeroAtividade;
}
