package Aula1Orientacao.Principais.Encapsulamento;
/*
import java.util.PriorityQueue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        // Criando uma fila com prioridade de inteiros
        PriorityQueue<Integer> filaPrioritaria = new PriorityQueue<>();

        // Adicionando elementos à fila com prioridade
        filaPrioritaria.add(10);
        filaPrioritaria.add(7);
        filaPrioritaria.add(42);
        filaPrioritaria.add(41);
        filaPrioritaria.offer(1);

        // Acessando e removendo o elemento com maior prioridade
        while (!filaPrioritaria.isEmpty()) {
            System.out.println(filaPrioritaria.poll());
        }
    }
}
import java.util.LinkedList;
import java.util.Queue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        // Criando uma fila
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos à fila
        fila.offer("Primeiro");
        fila.offer("Terceiro");
        fila.offer("Segundo");

        // Removendo e exibindo elementos da fila
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}

import java.util.concurrent.ArrayBlockingQueue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        // Criando uma fila com capacidade máxima de 3 elementos
        ArrayBlockingQueue<Integer> filaComCapacidadeLimitada = new ArrayBlockingQueue<>(3);
        
        // Adicionando elementos à fila
        filaComCapacidadeLimitada.offer(1);
        filaComCapacidadeLimitada.offer(2);
        filaComCapacidadeLimitada.offer(3);
        
        // Tentando adicionar mais elementos além da capacidade máxima
        filaComCapacidadeLimitada.offer(4); // Esta adição falhará, já que a capacidade máxima foi atingida
        
        // Imprimindo os elementos na fila
        System.out.println("Elementos na fila com capacidade limitada:");
        for (Integer elemento : filaComCapacidadeLimitada) {
            System.out.println(elemento);
        }
    }
}
*/


import java.util.PriorityQueue;
import java.util.Scanner;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
        // Criando uma fila com prioridade de inteiros
        PriorityQueue<Integer> filaPrioritaria = new PriorityQueue<>(3);
        
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que insira os números
        System.out.println("Por favor, insira os números na fila (digite 'fim' para encerrar):");
        
        // Loop para inserir os números fornecidos pelo usuário
        while (true) {
            // Lendo a próxima entrada do usuário
            String input = scanner.nextLine();
            
            // Verificando se o usuário deseja encerrar a entrada
            if (input.equalsIgnoreCase("fim")) {
                break;
            }
            
            try {
                // Convertendo a entrada do usuário para um número inteiro
                int numero = Integer.parseInt(input);
                
                // Adicionando o número à fila com prioridade
                filaPrioritaria.offer(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido ou 'fim' para encerrar.");
            }
        }
        
        // Fechando o Scanner
        scanner.close();
        
        // Imprimindo os números na fila com prioridade
        System.out.println("Números na fila com prioridade:");
        while (!filaPrioritaria.isEmpty()) {
            System.out.println(filaPrioritaria.poll());
        }
    }
}