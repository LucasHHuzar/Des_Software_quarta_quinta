package br.edu.up.heranca.modelo;

public class Gato extends Animal{

    public Gato(String name) {
        super(name);
    }
    @Override
    public void emitirSom(){
        System.out.println(super.getName() + " miando!!!");
    }
}
