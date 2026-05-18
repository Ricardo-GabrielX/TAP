package ricardogabriel.com.preprova.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ricardogabriel.com.preprova.model.Gerente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/gerentes")
public class GerenteController {
    
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    @GetMapping
    public ArrayList<Gerente> getGerente() {
        return gerentes;
    }

    public GerenteController() {
        gerentes.add(new Gerente(1, "Zezinho Gerente", 5000.00, "Gerente de Projetos"));
        gerentes.add(new Gerente(2, "Libano Gerente", 4500.00, "Gerente de TI"));
        gerentes.add(new Gerente(3, "Dolores Gerente", 4000.00, "Gerente de Suporte"));
    }


    @GetMapping("/{id}")
    public Gerente getGerente(@PathVariable int id) {
        return gerentes.stream()
                .filter(g -> g.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    @PostMapping
    public String adicionarGerente(@RequestBody Gerente gerente) {
        gerentes.add(gerente);
        return "Gerente adicionado com sucesso";
    }
    
    @PutMapping("/{id}")
    public String putGerente(@PathVariable int id, @RequestBody Gerente gerente) {
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getId() == id) {
                gerentes.set(i, gerente);
                return "Gerente atualizado com sucesso";
            }
        }
        return "Gerente não encontrado";
    }
    
    
}
