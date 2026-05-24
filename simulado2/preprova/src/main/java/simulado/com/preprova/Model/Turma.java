package simulado.com.preprova.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    private String codigo;
    private String nome;
    List<Aluno> alunos = new ArrayList<>(); 
    private Professor professor;

    public Turma() {

    }

    public Turma(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return Collections.unmodifiableList(alunos);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            aluno.setTurma(this);
        }
    }    

    public void removerAluno(Aluno aluno){
        if(alunos.remove(aluno)) {
            aluno.setTurma(null);
        }
    }
}
