package contabancaria;

public class Agencia {

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("João", 1000.0);

        minhaConta.setTitular("João da Silva");
        minhaConta.setSaldo(minhaConta.getSaldo() + 1500.0);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titulo da conta é " + titularConta + " e o saldo final é " + saldoFinal);
    }

}
