package prova1.com.uml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prova1.com.uml.model.Motorista;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/motoristas")
public class MotoristaController {
    
    private ArrayList<Motorista> motoristas = new ArrayList<>();
    
    @GetMapping
    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    @PostMapping
    public String postMethodName(@RequestBody Motorista motorista) {
        motoristas.add(motorista);
        return "Motorista adicionado com sucesso!";
    }
    
    @DeleteMapping("/{id}")
    public String deleteGerente(@PathVariable int id) {
        boolean removed = motoristas.removeIf(p -> p.getId() == id);

        if(removed) {
            return "Motorista com ID: " + id + " foi removido com sucesso.";
        } else {
            return "Motista com ID: " + id + " não encontrado.";
        }
    }

    
}
