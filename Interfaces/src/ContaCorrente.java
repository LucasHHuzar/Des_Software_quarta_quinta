public class ContaCorrente extends ContaBasica implements Conta{

    @Override
    public void depositar(Double valor) {
        double newValor = valor + getSaldo();
        super.setSaldo(newValor);
    }
    @Override
    public void sacar(Double valor) {
        double newValor = getSaldo() - valor;
        super.setSaldo(newValor);
    }
}
