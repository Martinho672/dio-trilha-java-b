package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
