package abstracao;

public class Principal {

    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das Flores", "São Paulo", "1542",
                "SP", "98545896-000", "João Paulo da Silva", "000024587565", "Vendedor");

        Cliente maria = new Cliente("Rua das Palmeiras", "São Paulo", "SP", "42145896-000",
                "Maria da Silva", "00002458733313");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(maria);
        maria.mostrarEndereco();
    }

}
