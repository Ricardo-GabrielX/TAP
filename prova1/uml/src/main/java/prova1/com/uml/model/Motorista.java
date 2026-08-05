package prova1.com.uml.model;

import java.util.ArrayList;

public class Motorista extends Funcionario {
    private String cnh;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public Motorista() {}

    public Motorista(int id, String nome, String cnh) {
        super(id, nome);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
