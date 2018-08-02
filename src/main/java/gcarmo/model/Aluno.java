package gcarmo.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Aluno {

    private UUID id;
    private String nome;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
