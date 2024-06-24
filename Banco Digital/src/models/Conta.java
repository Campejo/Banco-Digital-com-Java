package models;

public class Conta {

    private String nome;
    private String cpf;
    private int agencia;
    private int numero;
    private double saldo;
    

    protected Conta(String nome, String cpf, int agencia, int numero) {
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
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
            "CPF: " + cpf + " | " +
            "Agência: " + agencia + " | " +
            "Número: " + numero + " | " +
            "Saldo: " + saldo + "\n";
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }



    

    
}
