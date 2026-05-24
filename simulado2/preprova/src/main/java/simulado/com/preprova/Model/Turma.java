package simulado.com.preprova.model;

public class Turma {
    private String codigo;
    public String nome;
    private Aluno aluno;

    public Turma() {

    }

    public Turma(String codigo, String nome, Aluno aluno) {
        this.codigo = codigo;
        this.nome = nome;
        this.aluno = aluno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
