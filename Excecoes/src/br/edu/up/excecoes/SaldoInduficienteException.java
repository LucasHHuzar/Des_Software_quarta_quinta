package br.edu.up.excecoes;

public class SaldoInduficienteException extends Exception{
    public SaldoInduficienteException (String message) {
        super.getMessage();
    }

    public SaldoInduficienteException(String message, Throwable cause){
        super(message, cause);
    }
}
