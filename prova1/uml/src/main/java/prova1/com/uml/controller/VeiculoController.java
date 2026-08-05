package prova1.com.uml.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prova1.com.uml.model.Veiculo;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    @GetMapping
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    @PostMapping
    public String createVeiculo(@RequestBody Veiculo veiculo) {
        veiculos.add(veiculo);
        return "Veículo adicionado com sucesso!";
    }
    
    @DeleteMapping("/{placa}")
    public String deleteVeiculo(@PathVariable String placa) {
        boolean removed = veiculos.removeIf(p -> p.getPlaca().equals(placa));

        if(removed) {
            return "Veículo com placa: " + placa + " foi removido com sucesso.";
        } else {
            return "Veículo com placa: " + placa + " não encontrado.";
        }
    }
}
