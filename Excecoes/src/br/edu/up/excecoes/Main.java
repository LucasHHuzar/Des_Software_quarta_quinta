package br.edu.up.excecoes;

public class Main {

    public static void main(String[] args) {
        try {
            Conta conta = new Conta();
            conta.setLimite(100.00);
            conta.deposita(100.00);
            conta.saca(100.00);
        }catch (SaldoInduficienteException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
    }
}
