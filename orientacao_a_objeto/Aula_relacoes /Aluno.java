package br.edu.up.relacoes.associacao.modelos;

public class Aluno {
    
    private String nome;
    private Turma turma;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = '" + nome + '\'' +
                ", turma = " + turma.getNome() +
                '}';
    }

}
