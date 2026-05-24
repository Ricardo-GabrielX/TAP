package simulado.com.preprova.model;



public class Professor extends Pessoa{
    public String especialidade;

    public Professor() {

    }

    public Professor(int id, String nome, String especialidade) {
        super(id, nome);
        especialidade = this.especialidade;
    }
}