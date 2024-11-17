import models.*;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("João das Neves");

        Conta contaCorrente = new ContaCorrente(1);
        Conta contaPoupanca = new ContaPoupanca(2);

        cliente1.addConta(contaCorrente);
        cliente1.addConta(contaPoupanca);

        banco.addConta(contaCorrente);
        banco.addConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

        banco.listarContas();
    }
}
