package br.edu.up.heranca.modelo;

public class Cachorro extends Animal{
    public Cachorro(String name) {
        super(name);
    }
    @Override
    public void emitirSom(){
        System.out.println(super.getName() + " latindo!!");
    }

}
