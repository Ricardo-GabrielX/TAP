package simulado.com.preprova.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    private String codigo;
    private String nome;
    List<Aluno> alunos = new ArrayList<>(); 


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

    // public Aluno getAluno() {
    //     return aluno;
    // }

    // public void setAluno(Aluno aluno) {
    //     this.aluno = aluno;
    // }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
