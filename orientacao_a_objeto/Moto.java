package br.edu.up.heranca.modelo;

public class Moto extends Veiculo {

    private Integer bauCarga;

    public Moto(String marca, String modelo, Integer bauCarga) {
        super(marca, modelo);
        this.bauCarga = bauCarga;
    }

    public Integer getBauCarga() {
        return bauCarga;
    }

    public void setBauCarga(Integer bauCarga) {
        this.bauCarga = bauCarga;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", bauCarga='" + this.bauCarga + '\'' +
                '}';
    }

}
