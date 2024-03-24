//Escrever um programa para determinar o consumo médio de um
//automóvel sendo fornecida a distância total percorrida pelo automóvel e o total
//de combustível gasto.

package br.edu.up.Atividades;

public class Carro {
    
    public Double distancia;
    public Double combustivel;

    public Carro(Double distancia){
        this.distancia = distancia;
    }

    public void combustivel(Double combustivel){
        this.combustivel = combustivel;
    }

    public Double calcularMedia(){
        return distancia / combustivel;
    }

}

