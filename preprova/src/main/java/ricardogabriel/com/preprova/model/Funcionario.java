package ricardogabriel.com.preprova.model;


// - id
// - nome
// - salario
// - cargo
public class Funcionario {
    
    private int id;
    private String nome;
    private double salario;
    private String cargo;


    public Funcionario(int id, String nome, double salario, String cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public double setSalario(double salario) {
        return this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }


    public String setCargo(String cargo) {
        return this.cargo = cargo;
    }
    
    
}
