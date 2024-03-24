//Escrever um programa para determinar o consumo médio de um
//automóvel sendo fornecida a distância total percorrida pelo automóvel e o total
//de combustível gasto.

package br.edu.up;

import java.util.Scanner;

import br.edu.up.Atividades.Carro;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário a distância percorrida
        System.out.print("Digite a distância percorrida em KM: ");
        Double veiculo = scanner.nextDouble();

        // Criando um objeto Carro
        Carro carros = new Carro(veiculo);

        // Pedindo ao usuário a quantidade de combustivel gasto
        System.out.print("Digite a quantidade de combustível gasto em Litros: ");
        double combustivel = scanner.nextDouble();
        carros.combustivel(combustivel);

        //Imprimir o cálculo da média percorrida
        System.out.println(carros.calcularMedia());

        scanner.close();
    }

}
