package br.edu.up.heranca.modelo;

public class Equipamento {

    private Boolean ligado;

    public Boolean getLigado() {
        return ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

}
