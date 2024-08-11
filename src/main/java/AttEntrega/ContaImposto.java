package AttEntrega;

public class ContaImposto extends Conta {
    //Atributos
    double percentualImposto = 0.04;

    public ContaImposto(String titular) {
        super(titular);
    }

    public void calcularImposto(double percentualImposto){
       // this.percentualImposto = percentualImposto;
        this.setSaldo(this.getSaldo() - (this.getSaldo() * percentualImposto));
        System.out.println("Saldo após cobrar imposto: " + this.getSaldo());
    }
}
