package br.edu.up.modelos;

import java.util.Scanner;

public class Revisao {

    Scanner scanner = new Scanner(System.in);
    
    public String nome;
    public int idade;
    public int calorias = 0;
    public Boolean estado = true;

    public Revisao(String nome){
        this.nome = nome;
        this.idade = 0;
        this.calorias = 200;
        this.estado = true;
    }

    public void dormir(){
        this.calorias -= 50;
        this.idade++;
        this.estaVivo();
    }

    public void comer(){
        this.calorias += 100;
        this.estaVivo();
    }

    public void correr(){
        this.calorias -= 100;
        this.estaVivo();
    }

    public void estaVivo(){
        if (idade > 10 || calorias <= 0 || calorias >= 1000) {
            this.estado = false;
        }
    }

    public void morrer(){
        this.estado = false;
    }

    public void detalherAnimal(){
        System.out.println("Calorias: " + this.calorias);
        System.out.println("Idade: " + this.idade);
    }

    public void pedirInfos(){

        System.out.print("Qual o nome do animal: ");
        nome = scanner.nextLine();

        System.out.print("Qual a idade do " + nome + ": ");
        idade = scanner.nextInt();
        
        System.out.print("Quantas calorias o " + nome + " tem? ");
        calorias = scanner.nextInt();

    }

    public void decisao(){
        
        do {
            System.out.println("=======================");    
            System.out.println("1 - Dormir");    
            System.out.println("2 - Correr");    
            System.out.println("3 - Comer");    
            System.out.println("4 - Morrer");    
            System.out.println("5 - Detalhes");    
            System.out.println("=======================");
            var oq = scanner.nextInt();

            switch (oq) {
                case 1:
                    this.dormir();
                    break;

                case 2:
                    this.correr();
                    break;

                case 3:
                    this.comer();
                    break;
                    
                case 4:
                    this.morrer();
                    break;
                    
                case 5:
                    this.detalherAnimal();;
                    break;

                default:
                    System.out.println("Tente novamente!");
                    break;
            }

        } while (estado == true);

        System.out.println("Seu animal morreu!");

    }

    //dormir = -50
    //correr = -200
    //comer = +1000
    
    //morrer acaba o programa

}
