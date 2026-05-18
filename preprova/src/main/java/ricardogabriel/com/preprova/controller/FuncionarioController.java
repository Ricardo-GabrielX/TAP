package ricardogabriel.com.preprova.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ricardogabriel.com.preprova.model.Funcionario;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    

    public FuncionarioController() {
        funcionarios.add(new Funcionario(1, "Ricardo", 5000.00, "Desenvolvedor"));
        funcionarios.add(new Funcionario(2, "Maria", 4500.00, "Analista de Sistemas"));
        funcionarios.add(new Funcionario(3, "João", 4000.00, "Suporte Técnico"));
    }

    @GetMapping
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    @GetMapping("{id}")
    public Funcionario getFuncionario(@PathVariable int id) {
        return funcionarios.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public String adicionarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarios.add(funcionario);
        return "Funcionário adicionado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String deletarFuncionario(@PathVariable int id) {
        Funcionario funcionario = funcionarios.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            return "Funcionário deletado com sucesso!";
        } else {
            return "Funcionário não encontrado.";
        }
    }


    
    

}
