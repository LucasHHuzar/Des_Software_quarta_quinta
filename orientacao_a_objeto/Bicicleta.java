package Aula1Orientacao.Principais.Encapsulamento;

public class Bicicleta {

    private String modelo;
    private Double velocidade;
    private Integer marcha;

    public Bicicleta(String modelo, Double velocidade, Integer marcha){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    public void imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Marcha: " + this.marcha);
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setModelo(String modelo) {

        if (!possoAlterarModelo(modelo)) {
            System.out.println("Dados inválidos. Não posso alterar o modelo!");          
            return; 
        } 
        this.modelo = modelo;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    private boolean possoAlterarModelo(String modelo){
        
        if (modelo == null || modelo.length() <= 3)
            return false;
        else if (modelo.length() >= 30) 
            return false;
        
        return true;
    }

}
