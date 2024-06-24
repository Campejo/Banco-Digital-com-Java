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

    public void adicionarConta(String nome, int agencia, int numero) {
        contasList.add(new Conta(nome, agencia, numero));
    }

    public void removerConta(String nome, int agencia, int numero) {
        List<Conta> contaParaRemover = null;
        if (!contasList.isEmpty()) {
            for (Conta conta : contasList) {
                if (conta.getNome().equalsIgnoreCase(nome) && conta.getAgencia() == agencia && conta.getNumero() == numero) {
                    contaParaRemover.add(conta);
                    contasList.remove(contaParaRemover);
                    break;
                }
            }
            
        }
    }

    public void exibirContas() {
        System.out.println(contasList);
    }
    
    public void depositarNaConta(String nome, int agencia, int numero, double valor) {
        for (Conta c : contasList) {
            if (c.getNome().equalsIgnoreCase(nome) && c.getAgencia() == agencia && c.getNumero() == numero) {
                c.depositar(valor);
                break;
            } 
            
        }
    }

    public void sacarDaConta(String nome, int agencia, int numero, double valor) {
        for (Conta c : contasList) {
            if (c.getNome().equalsIgnoreCase(nome) && c.getAgencia() == agencia && c.getNumero() == numero) {
                c.sacar(valor);
                break;
            }    
        }
    }
    
}
