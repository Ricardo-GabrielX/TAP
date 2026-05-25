package simulado.com.preprova.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simulado.com.preprova.model.Aluno;
import simulado.com.preprova.model.Turma;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
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
    private ArrayList<Turma> turmas;


    public AlunoController(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
   
    @GetMapping
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    @PostMapping
    public ResponseEntity<String> createAluno(@RequestBody Aluno aluno ) {
        if (aluno.getTurma() == null || aluno.getTurma().getCodigo() == null ) {
            return ResponseEntity.badRequest().body("Aluno deve pertencer a uma turma.");
        }

        String codigoTurma = aluno.getTurma().getCodigo();
        Turma turma = turmas.stream()
                .filter(t -> t.getCodigo().equals(codigoTurma))
                .findFirst()
                .orElse(null);

        if (turma == null) {
            return ResponseEntity.badRequest().body("turma com código " + codigoTurma + " não encontrada.");
        }

        turma.adicionarAluno(aluno);
        alunos.add(aluno);
        return ResponseEntity.ok("Aluno adiconando com sucesso");
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
