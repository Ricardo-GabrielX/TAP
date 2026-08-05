package prova1.com.uml.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private Motorista motorista;

    public Veiculo() {}

    public Veiculo(String placa, String modelo, Motorista motorista) {
        this.placa = placa;
        this.modelo = modelo;
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

     public void setMotorista(Motorista motorista) {
        if (motorista == null) throw new IllegalArgumentException("Veículo deve ter um motorista.");
        this.motorista = motorista;
    }
}
