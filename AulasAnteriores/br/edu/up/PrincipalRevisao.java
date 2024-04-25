package br.edu.up;

import java.io.IOException;

import br.edu.up.modelos.Revisao;

public class PrincipalRevisao {

    public static void main(String[] args) throws IOException {
        
        Revisao rev = new Revisao("Lucas");

        rev.pedirInfos();

        rev.decisao();
        
    }
    
}
