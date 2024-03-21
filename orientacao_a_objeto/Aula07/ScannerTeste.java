package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class ScannerTeste {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://github.com/rhafael-costa-dev/desenvolvimento-software/tree/main/Aulas");
        //File arquivo = new File("C:\\atvjava\\LucasJava\\src\\br\\edu\\up\\dados.txt");
        Scanner scanner = new Scanner(url.openStream());

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

//            String[] dados = scanner.nextLine().split(";");
//            long matricula = Long.parseLong(dados[0]);
//            Date dataAniversario = new Date(dados[2]);
//            System.out.println("Matrícula: " + matricula);
//            System.out.println("Data: " + dataAniversario);
        }

    }

}
