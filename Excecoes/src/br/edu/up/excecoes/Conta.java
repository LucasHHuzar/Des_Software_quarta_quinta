package br.edu.up.excecoes;

public class Conta {

    private Double saldo;
    private Double limite;

    public Conta(){

    }
    public void deposita(Double valor){
        this.saldo = saldo;
    }

    public void setLimite(Double limite){
        this.limite = limite;
    }

    public void saca(Double valor) throws SaldoInduficienteException{

        double limiteMax = this.saldo + this.limite;

        if (valor > limiteMax) {

            throw new SaldoInduficienteException("Você não tem saldo suficiente!");

        }

        this.saldo -= valor;

        }
}
