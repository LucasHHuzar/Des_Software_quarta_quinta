package Aula1Orientacao.Principais.Encapsulamento;

public class Pessoa {
    
    //Declaração dos atributos
    private String nome;
    private int idade;
    
    //Getter para o atributo idade
    public String getNome() {
        return nome;
    }
    
    //Setter para o atributo nome
    public void setNome(String nome) {
        
        System.out.println("Seu nome é: " + nome);
        this.nome = nome;
    }
    
    //Getter para o atributo idade
    public int getIdade() {
        return idade;
    }

    //Setter para o atributo idade
    public void setIdade(int idade) {

        System.out.println("Sua idade é: " + idade);

        this.idade = idade;
    }

}
