import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setSaldo(200.00);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto deseja depositar?");
        cc.depositar(scanner.nextDouble());

        System.out.println(cc.getSaldo());

        System.out.println("Quanto deseja sacar?");
        cc.sacar(scanner.nextDouble());

        System.out.println(cc.getSaldo());

//        depositar(cc, 300.00);
//        System.out.println(cc.getSaldo());
//
//        cc.sacar(200.00);
//        System.out.println(cc.getSaldo());

    }

    private static void depositar(Conta conta, Double valor){
        conta.depositar(valor);
    }
}