package simulado.com.preprova.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simulado.com.preprova.model.Aluno;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public AlunoController() {
        // id, nome, matricula

        Aluno a1 = new Aluno(1, "alex", "1", null);
        Aluno a2 = new Aluno(2, "junior", "2", null);
        Aluno a3 = new Aluno(3, "maria", "3", null);
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
    }
   

    @GetMapping
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    @PostMapping
    public String createAluno(@RequestBody Aluno aluno ) {
        alunos.add(aluno);
        return "Aluno adicionado com sucesso";
    }

    @DeleteMapping("/{id}")
    public String deleteAluno(@PathVariable int id) {
        boolean removed = alunos.removeIf(p -> p.getId() == id);

        if(removed) {
            return "Aluno com ID: " + id + " foi removido com sucesso.";
        } else {
            return "Aluno com ID: " + id + " não encontrado.";
        }
    }
    
}
