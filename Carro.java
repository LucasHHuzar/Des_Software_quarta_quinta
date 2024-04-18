package br.edu.up.relacoes.Agregacao.Modelos;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo = '" + modelo + '\'' +
                ", motor = " + motor.getPotencia() +
                '}';
    }

}
