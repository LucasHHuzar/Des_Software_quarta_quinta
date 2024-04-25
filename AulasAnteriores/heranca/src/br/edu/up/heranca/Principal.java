package br.edu.up.heranca;

import br.edu.up.heranca.modelo.Carro;
import br.edu.up.heranca.modelo.Moto;
import br.edu.up.heranca.modelo.SUV;
import br.edu.up.heranca.modelo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        SUV suv = new SUV("Fiat", "RAM", "I3", 6);
        suv.setMarca("BMW");
        System.out.println(suv);

        Veiculo veiculo = new Veiculo("Dodge", "RAM");
        System.out.println(veiculo);

        Carro meuCarro = new Carro("Fiat", "Uno", "2");
        System.out.println(meuCarro.toString());

        Veiculo carro = new Carro("Fiat", "BMW", "I3");
        System.out.println(carro.toString());

        System.out.println("+++++++++++++++++++++++++");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fiat", "Uno", "2"));
        veiculos.add(new Carro("BMW", "BMW", "I3"));
        veiculos.add(new Moto("BMW", "GS 310", 5));
        veiculos.add(new Moto("Honda", "CB 1000", 2));

        for (Veiculo v: veiculos) {

            if (v instanceof Carro){
                System.out.println("Carro");
                continue;
            }

            System.out.println(v);
        }

    }

}
