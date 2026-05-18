package simulado.com.preprova.Model;

public class Aluno extends Pessoa {
    private int idMatricula;

    public Aluno() {

    }

    public Aluno(int id, String nome, int idMatricula) {
        super(id, nome);
        idMatricula = this.idMatricula;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

}
