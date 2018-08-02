package gcarmo.controller;

import gcarmo.model.Aluno;
import gcarmo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/aluno")
public class AlunoController {


    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public Aluno inserirAluno(@RequestParam String nome){
        return alunoService.inserirAluno(nome);
    }

}
