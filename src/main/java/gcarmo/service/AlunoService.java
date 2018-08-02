package gcarmo.service;

import gcarmo.model.Aluno;
import gcarmo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno inserirAluno(String nome){

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setId(UUID.randomUUID());

        return alunoRepository.save(aluno);

    }
}
