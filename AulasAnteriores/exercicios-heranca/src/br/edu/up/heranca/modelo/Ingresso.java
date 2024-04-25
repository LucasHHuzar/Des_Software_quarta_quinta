package br.edu.up.heranca.modelo;

public class Ingresso {

    private Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "valor=" + valor +
                '}';
    }
}
