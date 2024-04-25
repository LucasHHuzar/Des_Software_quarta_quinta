package br.edu.up;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class Documentacao {
    public static void main(String[] args) throws FileNotFoundException {

        Formatter formatter = new Formatter("C:\\lucasjava\\br\\edu\\up\\Teste\\teste.txt");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Gravando o numero: " + i);
            formatter.format("Gravando o numero: " + i + "\n");
        }

        formatter.close();

    }
}
