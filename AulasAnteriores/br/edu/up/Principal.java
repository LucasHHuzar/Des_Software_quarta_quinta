package br.edu.up;

import java.io.File;
import java.io.IOException;

public class Principal {
    
    public static void main(String[] args) throws IOException{

        File diretorio = new File("C:\\lucasjava\\br\\edu\\up\\Teste");
        File arquivo = new File(diretorio, "teste.txt");
        File arquivo2 = new File(diretorio, "banco_de_dados.txt");

        if (!diretorio.exists()){
            diretorio.mkdirs();
        }
        
        if (!arquivo.exists()){
            arquivo.createNewFile();
        }
        
        boolean result = arquivo.renameTo(arquivo2);
        System.out.println("Resultado: " + result);

        if (arquivo2.exists()){
            System.out.println("Alterado!");
        }

        boolean r1 = arquivo.delete();
        boolean r2 = arquivo2.delete();
        boolean r3 = diretorio.delete();

        File files = new File("C:\\lucasjava\\br\\edu\\up\\Teste");
        
        for (File file : files.listFiles()) {
            System.out.println(file.getName());
            System.out.println("Diretório: " + file.isDirectory());
            System.out.println("Arquivo: " + file.isFile());
        }

        boolean result = diretorio.mkdir();

        if (result){
            System.out.println("Sucesso");
        } else {
            System.out.println("Falha");
        }

        System.out.println(diretorio.getAbsolutePath());

    }
    
}