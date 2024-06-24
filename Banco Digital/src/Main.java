import models.Banco;

public class Main {
    public static void main(String[] args) {
        Banco bra = new Banco("bradesco");

        System.out.println(bra.getNome());

        bra.adicionarConta("Thiago", 2, 4214);
        bra.adicionarConta("Juliana", 1, 1264);
        
        bra.exibirContas();
        
        bra.depositarNaConta("Juliana", 1, 1264, 110);
        
        bra.exibirContas();

        bra.depositarNaConta("Thiago", 2, 4214, 6000);

        bra.exibirContas();

        bra.sacarDaConta("Thiago", 2, 4214, 5000);

        bra.exibirContas();
    }
}
