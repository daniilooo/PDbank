package models;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(){

    }

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.setNumeroConta(numeroConta);
        this.setTitular(titular);
        this.setSaldo(saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        String contaBancaria = String.format("""
                
                =================================
                
                Numero da conta: %d
                Titular da Conta: %s
                Saldo da conta: R$ %.2f
                
                =================================
                
                """, this.getNumeroConta(), this.getTitular(), this.getSaldo());

        return contaBancaria;
    }

}
