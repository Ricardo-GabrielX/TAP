package simulado.com.preprova.model;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private String nome;
    ArrayList<Aluno> alunos = new ArrayList<>(); 
    private Professor professor;

    public Turma() {

    }

    public Turma(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
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

}
