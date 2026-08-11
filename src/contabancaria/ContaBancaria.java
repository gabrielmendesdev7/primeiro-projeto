package contabancaria;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }
}
