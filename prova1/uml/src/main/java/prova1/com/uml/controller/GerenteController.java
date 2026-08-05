package prova1.com.uml.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prova1.com.uml.model.Gerente;

@RestController
@RequestMapping("/gerentes")
public class GerenteController {
    private ArrayList<Gerente> gerentes = new ArrayList<>();
    
    
    @GetMapping
    public ArrayList<Gerente> getMotoristas() {
        return gerentes;
    }

    @PostMapping
    public String createMotorista(@RequestBody Gerente gerente) {
        gerentes.add(gerente);
        return "Gerente adicionado com sucesso!";
    }
    
    @DeleteMapping("/{id}")
    public String deleteGerente(@PathVariable int id) {
        boolean removed = gerentes.removeIf(p -> p.getId() == id);

        if(removed) {
            return "Gerente com ID: " + id + " foi removido com sucesso.";
        } else {
            return "Gerente com ID: " + id + " não encontrado.";
        }
    }



}
