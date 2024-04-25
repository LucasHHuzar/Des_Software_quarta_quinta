package br.edu.up.heranca;

import br.edu.up.heranca.modelo.Ingresso;
import br.edu.up.heranca.modelo.IngressoVip;

public class PrincipalIngresso {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(80.00);
        Ingresso ingresso1 = new IngressoVip(80.00, 30.00);
        IngressoVip vip = new IngressoVip(100.00, 50.00);

        System.out.println(vip.getValorAdicional());
        System.out.println(vip.getValor());
        System.out.println(vip);
        System.out.println(ingresso);
        System.out.println(ingresso1);

    }
}
