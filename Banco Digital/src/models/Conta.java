package models;

public class Conta {

    private String nome;
    private int agencia;
    private int numero;
    private double saldo;
    

    protected Conta(String nome, int agencia, int numero) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
    }

     
    
    protected void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado com sucesso!");
        
    }

    
    protected void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println(String.format("Valor de %.2f sacado com sucesso!", valor));

        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
        
        
    }

    protected void transferir(double valor) {
        saldo -= valor;
    }
    

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }
    

    protected void imprimirInformacoes() {
        System.out.println(String.format("Titular:  %s", this.nome));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | " +
            "Agência: " + agencia + " | " +
            "Número: " + numero + " | " +
            "Saldo: " + saldo + "\n";
    }
}
