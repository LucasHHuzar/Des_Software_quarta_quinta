package br.edu.up.relacoes.associacao.modelos;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inicializarLista(){
        if(this.alunos == null){
            this.alunos = new ArrayList<>();
        }
    }

    public Boolean addAluno(Aluno aluno){
        this.inicializarLista();
        if(aluno.getTurma().getNome() != this.nome){
            return false;
        }

        this.alunos.add(aluno);
        return true;
    }

    public boolean verificarAluno(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = '" + nome + '\'' +
                ", aluno = " + alunos +
                '}';
    }

}
