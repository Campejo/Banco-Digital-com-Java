import models.Banco;

public class Main {
    public static void main(String[] args) {
        Banco bra = new Banco("bradesco");

        System.out.println(bra.getNome());

        bra.adicionarConta("Mario", "12345678978", 2, 4214);
        bra.adicionarConta("Leia","9876543127", 1, 1264);
        
        bra.exibirContas();
        
        bra.depositarNaConta("Leia", "9876543127", 110);
        
        bra.exibirContas();

        bra.depositarNaConta("Mario", "12345678978", 6000);

        bra.exibirContas();

        bra.sacarDaConta("Mario", "12345678978", 5000);

        bra.exibirContas();
    }
}
