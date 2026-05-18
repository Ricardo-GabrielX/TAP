package simulado.com.preprova.Model;

public class Pessoa {
    private int id;
    private String nome;

    public Pessoa() { 

    }

    public Pessoa(int id, String nome) {
        id = this.id;
        nome = this.nome;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome;
    }



}
