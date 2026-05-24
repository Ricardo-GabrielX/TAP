package simulado.com.preprova.model;

public class Turma {
    private String codigo;
    private String nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
