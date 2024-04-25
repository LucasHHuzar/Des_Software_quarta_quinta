package br.edu.up.heranca.modelo;

public class Carro extends Veiculo {
    private String porta;
    public Carro(String marca, String modelo, String porta) {
        super(marca, modelo);
        this.porta = porta;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", porta='" + this.porta + '\'' +
                '}';
    }
}
