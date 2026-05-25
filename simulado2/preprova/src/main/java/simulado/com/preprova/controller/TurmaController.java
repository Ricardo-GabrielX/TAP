package simulado.com.preprova.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simulado.com.preprova.model.Turma;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    
    private ArrayList<Turma> turmas = new ArrayList<>();

    @GetMapping
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    @PostMapping
    public String createTurma(@RequestBody Turma turma) {
        turmas.add(turma);
        return "Turma adicionada com sucesso";
    }
}
