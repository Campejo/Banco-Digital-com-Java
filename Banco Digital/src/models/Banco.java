package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> contasList;

    public Banco(String nome) {
        this.nome = nome;
        this.contasList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(String nome, String cpf, int agencia, int numero) {
        contasList.add(new Conta(nome, cpf, agencia, numero));
    }

    public void removerConta(String nome, String cpf) {
        List<Conta> contaParaRemover = null;
        if (!contasList.isEmpty()) {
            for (Conta c : contasList) {
                if (c.getCpf().equalsIgnoreCase(cpf) && c.getNome().equalsIgnoreCase(nome)) {
                    contaParaRemover.add(c);
                    contasList.remove(contaParaRemover);
                    break;
                }
            }
            
        }
    }

    public void exibirContas() {
        System.out.println(contasList);
    }
    
    public void depositarNaConta(String nome, String cpf, double valor) {
        for (Conta c : contasList) {
            if (c.getCpf().equalsIgnoreCase(cpf) && c.getNome().equalsIgnoreCase(nome)) {
                c.depositar(valor);
                break;
            } 
            
        }
    }

    public void sacarDaConta(String nome, String cpf, double valor) {
        for (Conta c : contasList) {
            if (c.getCpf().equalsIgnoreCase(cpf) && c.getNome().equalsIgnoreCase(nome)) {
                c.sacar(valor);
                break;
            }    
        }
    }
    
}
