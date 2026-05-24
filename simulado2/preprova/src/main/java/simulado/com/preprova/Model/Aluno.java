package simulado.com.preprova.model;

public class Aluno extends Pessoa {
    private String matricula;
    private Turma turma;

    public Aluno() {
        super();
    }

    public Aluno(int id, String nome, String matricula, Turma turma) {
        super(id, nome);

        if(turma == null) {
            throw new IllegalArgumentException("Aluno deve ter uma turma");
        }
        this.matricula = matricula;
        this.turma = turma;
    }

    public Turma getTurma() { 
        return turma;
    }

    public void setTurma(Turma turma) {
        if(turma == null) {
            throw new IllegalArgumentException("Aluno deve ter uma turma.");
        }
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
