package Aula1Orientacao.Principais;

import Aula1Orientacao.Principais.Encapsulamento.ContaBancaria;

public class PrincipalBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500.00);
        conta.sacar(1000);
        conta.sacar(1000);

        System.out.println(conta.obterSaldo());
    }
}
