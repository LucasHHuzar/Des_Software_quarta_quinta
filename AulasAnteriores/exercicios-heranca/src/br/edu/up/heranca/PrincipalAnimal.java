package br.edu.up.heranca;

import br.edu.up.heranca.modelo.Animal;
import br.edu.up.heranca.modelo.Cachorro;
import br.edu.up.heranca.modelo.Gato;

public class PrincipalAnimal {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("André");
        Animal gato = new Gato("Lucas");

        gato.emitirSom();
        cachorro.emitirSom();

    }
}
