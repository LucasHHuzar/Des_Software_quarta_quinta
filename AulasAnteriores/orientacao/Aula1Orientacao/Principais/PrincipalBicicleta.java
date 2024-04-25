package Aula1Orientacao.Principais;

import Aula1Orientacao.Principais.Encapsulamento.Bicicleta;

public class PrincipalBicicleta {

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Bike", 0.0, 1);

        bicicleta.setModelo("Cross 2024");

        bicicleta.imprimir();
    }

}
