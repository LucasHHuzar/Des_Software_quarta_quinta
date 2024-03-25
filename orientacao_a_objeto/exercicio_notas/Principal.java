//Escrever um programa que leia o nome de um aluno e as notas das três
//provas que ele obteve no semestre. No final informar o nome do aluno e a sua
//média (aritmética).

package br.edu.up;

import java.util.Scanner;

import br.edu.up.Atividades.Aluno;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Criando um objeto Aluno
        Aluno alunos = new Aluno(nomeAluno);

        // Pedindo ao usuário as notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        alunos.n1(nota1);

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        alunos.n2(nota2);

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        alunos.n3(nota3);

        // Verificando se o aluno passou de ano
        if (alunos.passouDeAno()) {
            System.out.println(alunos.nome + " passou de ano com média" + alunos.calcularMedia() + "!");
        } else {
            System.out.println(alunos.nome + " não passou de ano" + alunos.calcularMedia() + ".");
        }

        scanner.close();
    }

}
