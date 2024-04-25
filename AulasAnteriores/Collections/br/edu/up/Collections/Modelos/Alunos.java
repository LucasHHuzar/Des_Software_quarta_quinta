package br.edu.up.Collections.Modelos;

import java.util.UUID;

public class Alunos implements Comparable<Alunos>{

    private UUID uuid;
    private String nome;

    private Integer anoNascimento;

    public Alunos(String nome, Integer anoNascimento){
        this.nome = nome;
        this.uuid = uuid.randomUUID();
        this.anoNascimento = anoNascimento;
    }

    public UUID getUuid(){
        return uuid;
    }

    public String getNome(){
        return nome;
    }

    public Integer getAnoNascimento(){
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int compareTo(Alunos aluno){
        int idx = this.nome.compareTo(aluno.getNome());
        if (idx != 0) {
            return idx;
        }

        return this.anoNascimento.compareTo(aluno.getAnoNascimento());
    }
    
}
