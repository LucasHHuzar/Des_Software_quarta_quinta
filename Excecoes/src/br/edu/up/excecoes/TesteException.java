package br.edu.up.excecoes;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class TesteException {

    //EXERCÍCIO 1
//    public static void main(String[] args) {
//
//        System.out.println("Inicio do main");
//        metodo1();
//        System.out.println("Fim do main");
//    }
//
//    static void metodo1(){
//        System.out.println("Inicio do método 1");
//        metodo2();
//        System.out.println("Fim do método 1");
//    }
//
//    static void metodo2(){
//        System.out.println("Inicio do método 2");
//        int[] array = new int[10];
//        try {
//            for (int i = 0; i < 15; i++) {
//                array[i] = i;
//                System.out.println(i);
//            }
//        }catch(ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Fim do método 2");
//    }


    //EXERCICIO 2

    public static void main(String[] args) {

        boolean result = false;

        Scanner teclado = new Scanner(System.in);

//        do {
//
//            try {
//
//                System.out.println("Eu sei dividir:");
//                int x = readValue(teclado, "primeiro");
//                int y = readValue(teclado, "segundo");
//
//            } catch (ArithmeticException ari) {
//
//            } catch (Exception ex) {
//
//            }
//        }while (!result) ;

            System.out.println("Eu sei dividir:");

            int x = -1;
            int y = -1;

            do {
                try {
                    x = readValue(teclado, "primeiro");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } while (x <= 0);

            do {
                try {
                    y = readValue(teclado, "segundo");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } while (y <= 0);

            try {
                double r = (x / y);
                System.out.println("O resultado de agora é " + r);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        }
    static int readValue(Scanner teclado, String nome){
        System.out.println("Informe o " + nome + " valor: ");
        int x = teclado.nextInt();
        return x;
    }


}
