package AttEntrega;

import java.util.List;

public class Conta {
    protected String titular;
    protected double saldo;
    protected double saque;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor >0){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depositado com sucesso!");
        }else{
            System.out.println("Valor de depósito inválido");
        }
    }


    public void sacar(double valor) {
        if(saldo < valor){
            System.out.println("Saldo insuficiente");
        }else{
            saque = valor;
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque realizado com sucesso");
        }
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

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
}
