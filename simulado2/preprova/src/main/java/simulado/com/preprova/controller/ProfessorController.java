package simulado.com.preprova.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simulado.com.preprova.model.Professor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/professores")
public class ProfessorController {
    
    private ArrayList<Professor> professores = new ArrayList<>();

    @PostMapping
    public String createProfessor(@RequestBody Professor professor) {
        professores.add(professor);
        return "professor adicionado com sucesso!!";
    }

    // @GetMapping
    // public ArrayList<Professor> getProfesores() {
    //     return professores;
    // }
    
}
