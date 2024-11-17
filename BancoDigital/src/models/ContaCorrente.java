package models;

public class ContaCorrente extends Conta {
    private double taxa = 5.00;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + taxa);
    }
}
