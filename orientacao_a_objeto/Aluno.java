//Escrever um programa que leia o nome de um aluno e as notas das três
//provas que ele obteve no semestre. No final informar o nome do aluno e a sua
//média (aritmética).

package br.edu.up.Atividades;

public class Aluno {
    
    //Atribuindo variáveis
    public String nome;
    public Double nota1, nota2, nota3;

    //Construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    //Métodos para definir as notas
    public void notas(Double nota1){
        this.nota1 = nota1;
    }

    public void n2(Double nota2){
        this.nota2 = nota2;
    }

    public void n3(Double nota3){
        this.nota3 = nota3;
    }

    //Calculo da média aritimética do aluno
    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    //Verificar se o aluno passou de ano
    public boolean passouDeAno(){
        Double media = calcularMedia();
        return media >= 6;
    }

}

