package br.edu.up.Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.edu.up.Collections.Modelos.Alunos;

public class Principal {
    public static void main(String[] args) {
        
        List<Alunos> lista = new ArrayList<Alunos>();
        Set<Alunos> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>(); 

        set.add(new Alunos("Ana", 1997));
        set.add(new Alunos("Ana", 1998));

        lista.add(new Alunos("Ana", 1998));
        lista.add(new Alunos("Ana", 1997));

        Collections.sort(lista);

        for (Alunos alunos : set) {
            //System.out.println(alunos.getUuid());
            System.out.println(alunos.getNome() + " - " + alunos.getAnoNascimento());
        }
        
        System.out.println("========================");

        for (Alunos alunos : lista) {
            //System.out.println(alunos.getUuid());
            System.out.println(alunos.getNome() + " - " + alunos.getAnoNascimento());
        }

        // map.put(1, "Joaquim");
        // map.put(2, "Maria");
        // map.put(3, "Ana");
        // map.put(3, "Ana2");

        // System.out.println(map.get(3));

        // lista.add("Joaquim");
        // lista.add("Maria");
        // lista.add("Ana");

        // Collections.sort(lista, new Comparator<String>() {
        //     public int compare(String o1, String o2){
        //         return 0;
        //     }
        // });

        // Collections.sort(lista);
        // Collections.reverse(lista);

        // set.add(5);
        // set.add(4);
        // set.add(3);

        // Collections.reverseOrder(set);
        
        // for (String value : lista) {
        //     System.out.println(value);
        // }

    }

}
