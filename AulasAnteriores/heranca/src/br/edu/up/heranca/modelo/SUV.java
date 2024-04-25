package br.edu.up.heranca.modelo;

public class SUV extends Carro {
    private Integer consumo;

    public SUV(String marca, String modelo, String porta, Integer consumo) {
        super(marca, modelo, porta);
        this.consumo = consumo;
    }

    public Integer getConsumo() {
        return consumo;
    }

    public void setConsumo(Integer consumo) {
        this.consumo = consumo;
    }



}
