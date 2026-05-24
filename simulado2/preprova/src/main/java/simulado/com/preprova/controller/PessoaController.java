package simulado.com.preprova.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simulado.com.preprova.model.Pessoa;

@RestController
@RequestMapping
public class PessoaController {
    
    private ArrayList<Pessoa> pessoas = new ArrayList();

    public PessoaController() {
        Pessoa p1 = new Pessoa(1, "alex");
    }
}
