package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta Número: " + conta.getNumero() + " Saldo: " + conta.getSaldo());
        }
    }
}
