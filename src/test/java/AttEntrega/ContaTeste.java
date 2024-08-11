package AttEntrega;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ContaTeste {
    @Test
    public void maiorDepositoConta() {
        Conta[] conta = new Conta[3];

        conta[0] = new ContaImposto("Anderson");
        conta[1] = new ContaImposto("Mateus");
        conta[2] = new ContaImposto("Ana");

        conta[0].depositar(100);
        conta[1].depositar(1000);
        conta[2].depositar(10);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(conta[0]);
        contas.add(conta[1]);
        contas.add(conta[2]);

        ContaMain contaMain = new ContaMain();
        Assert.assertEquals(conta[1].getSaldo(), ContaMain.identifyMaiorDeposito(contas).getSaldo(), 0.1);
    }

    @Test
    public void maiorSaldoAposJuros() {
        ContaImposto[] conta = new ContaImposto[3];

        conta[0] = new ContaImposto("Anderson");
        conta[1] = new ContaImposto("Mateus");
        conta[2] = new ContaImposto("Ana");

        conta[0].depositar(1100);//1089
        conta[1].depositar(1300); //1066
        conta[2].depositar(1500); //750

        conta[0].calcularImposto(0.01);
        conta[1].calcularImposto(0.18);
        conta[2].calcularImposto(0.5);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(conta[0]);
        contas.add(conta[1]);
        contas.add(conta[2]);

        ContaMain contaMain = new ContaMain();
        Assert.assertEquals(conta[0].getSaldo(), ContaMain.identifyMaiorSaldoAposJuros(contas).getSaldo(), 0.1);
    }

    @Test
    public void menorSaldoAposJuros() {
        ContaImposto[] conta = new ContaImposto[3];

        conta[0] = new ContaImposto("Anderson");
        conta[1] = new ContaImposto("Mateus");
        conta[2] = new ContaImposto("Ana");

        conta[0].depositar(1100);//1089
        conta[1].depositar(1300); //1066
        conta[2].depositar(1500); //750

        conta[0].calcularImposto(0.01);
        conta[1].calcularImposto(0.18);
        conta[2].calcularImposto(0.5);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(conta[0]);
        contas.add(conta[1]);
        contas.add(conta[2]);

        ContaMain contaMain = new ContaMain();
        Assert.assertEquals(conta[2].getSaldo(), ContaMain.identifyMenorSaldoAposJuros(contas).getSaldo(), 0.1);
    }

    @Test
    public void maiorSaque() {
        ContaImposto[] conta = new ContaImposto[3];

        conta[0] = new ContaImposto("Anderson");
        conta[1] = new ContaImposto("Mateus");
        conta[2] = new ContaImposto("Ana");

        conta[0].depositar(1100);
        conta[1].depositar(1300);
        conta[2].depositar(1500);

        conta[0].sacar(500);
        conta[1].sacar(700);
        conta[2].sacar(100);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(conta[0]);
        contas.add(conta[1]);
        contas.add(conta[2]);

        ContaMain contaMain = new ContaMain();
        Assert.assertEquals(conta[2].getSaque(), ContaMain.identifyMaiorSaque(contas).getSaque(), 0.1);
    }

    @Test
    public void menorSaque() {
        ContaImposto[] conta = new ContaImposto[3];

        conta[0] = new ContaImposto("Anderson");
        conta[1] = new ContaImposto("Mateus");
        conta[2] = new ContaImposto("Ana");

        conta[0].depositar(1100);
        conta[1].depositar(1300);
        conta[2].depositar(1500);

        conta[0].sacar(500);
        conta[1].sacar(700);
        conta[2].sacar(100);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(conta[0]);
        contas.add(conta[1]);
        contas.add(conta[2]);

        ContaMain contaMain = new ContaMain();
        Assert.assertEquals(conta[2].getSaque(), ContaMain.identifyMenorSaque(contas).getSaque(), 0.1);
    }
}
