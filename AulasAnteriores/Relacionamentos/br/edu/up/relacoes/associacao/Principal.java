package br.edu.up.relacoes.associacao;

import br.edu.up.relacoes.associacao.modelos.Aluno;
import br.edu.up.relacoes.associacao.modelos.Turma;

public class Principal {
    public static void main(String[] args) {
        
        Turma turma = new Turma("Dev de Software");
        Turma turma2 = new Turma("Banco de Dados");

        for (int i = 1; i <= 5; i++) {
            Aluno aluno = new Aluno("Aluno " + i);
            aluno.setTurma(turma);
            
            System.out.println(aluno.toString());  

            if(i == 2){
                turma2.addAluno(aluno);
                
                continue;
            }

            turma.addAluno(aluno);

        }
        
        System.out.println(turma);

    }
}
