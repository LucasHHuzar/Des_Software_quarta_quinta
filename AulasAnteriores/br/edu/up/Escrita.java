package br.edu.up;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escrita {
 
    public static void main(String[] args) throws IOException {
        File diretorio = new File("C:\\lucasjava\\br\\edu\\up\\Teste");
        File arquivo = new File(diretorio, "teste.txt");

        if(!diretorio.exists())
            diretorio.mkdirs();

        if (!arquivo.exists()) 
            arquivo.createNewFile();    
        
        FileWriter file = new FileWriter(arquivo, true);
        PrintWriter writer = new PrintWriter(file);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Gravando o numero: " + i);
            writer.println("Gravando o numero: " + i);
        }
        writer.flush();
        writer.close();

    }
}
