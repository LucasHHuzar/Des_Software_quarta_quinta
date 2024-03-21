package br.edu.up;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Principal {
    public static void main(String[] args) throws IOException {

        String path = "";
        File arquivo = new File("C:\\atvjava\\LucasJava\\src\\br\\edu\\up\\dados.txt");
        FileReader reader = new FileReader(arquivo);
        BufferedReader buffered = new BufferedReader(reader);

        String linha = "";

        while ((linha = buffered.readLine()) != null) {
            String[] dados = linha.split(";");
            long matricula = Long.parseLong(dados[0]);
            Date dataAniversario = new Date(dados[2]);
            System.out.println(matricula);
            System.out.println(dataAniversario);
        }

    }

}