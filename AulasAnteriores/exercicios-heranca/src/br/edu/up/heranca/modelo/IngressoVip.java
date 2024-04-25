package br.edu.up.heranca.modelo;

public class IngressoVip extends Ingresso{

    private Double valorAdicional;

    public IngressoVip(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        var total = valorAdicional + getValor();
        return "IngressoVip{" +
                "valor=" + total +
                '}';
    }
}
