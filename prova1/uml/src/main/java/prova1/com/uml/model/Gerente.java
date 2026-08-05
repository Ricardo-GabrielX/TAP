package prova1.com.uml.model;

public class Gerente extends Funcionario {
    private String setor;
    
    public Gerente() {}

    public Gerente(int id, String nome, String setor) {
        super(id, nome);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
