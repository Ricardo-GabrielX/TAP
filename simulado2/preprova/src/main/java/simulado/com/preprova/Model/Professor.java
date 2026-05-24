package simulado.com.preprova.model;



public class Professor extends Pessoa{
    private String especialidade;

    public Professor() {

    }

    public Professor(int id, String nome, String especialidade) {
        super(id, nome);
        especialidade = this.especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}