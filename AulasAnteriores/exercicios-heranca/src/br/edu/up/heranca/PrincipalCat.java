package br.edu.up.heranca;

import br.edu.up.heranca.animais.*;

public class PrincipalCat {
    public static void main(String[] args) {
        DoLittle doLittle = new DoLittle();

        Cat tiger = new Tiger();
        Cat lion = new Lion();
        Cat cheetah = new Cheetah();

        doLittle.health(lion);
        doLittle.health(tiger);
        doLittle.health(cheetah);
    }
}
