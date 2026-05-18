package ricardogabriel.com.preprova.model;

public class Gerente extends Funcionario {
    
    private String area;

    public Gerente(int id, String nome, double salario, String cargo) {
        super(id, nome, salario, cargo);
    }

    public String getArea() {
        return area;
    }

    public String setArea(String area) {
        return this.area = area;
    }

}
