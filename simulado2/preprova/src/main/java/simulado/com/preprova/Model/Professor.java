package simulado.com.preprova.model;

import java.util.ArrayList;
public class Professor extends Pessoa{
    private String especialidade;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Professor() {}

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

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}