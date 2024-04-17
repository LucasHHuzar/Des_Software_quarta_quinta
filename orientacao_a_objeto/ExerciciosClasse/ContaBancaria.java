package Aula1Orientacao.Principais.Encapsulamento;

import java.util.Scanner;

public class ContaBancaria {

    Scanner scanner = new Scanner(System.in);
    
    private Double saldo;

    public ContaBancaria(){
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }
    
    public void depositar(double valor){

        this.saldo += valor;

        if(saldo > 0)
            System.out.println("Saldo atualizado!");
        else if (saldo < 0)
            System.out.println("Valor não permitido!");
    }

    public void sacar(double valor){

        System.out.println("Qual o valor que você deseja sacar?");
        valor = scanner.nextDouble();

        if (saldo < valor) 
            System.out.println("Saldo insuficiente!");

        this.saldo -= valor;
        
    }

    public Double obterSaldo(){
        return this.saldo;
    }

}

