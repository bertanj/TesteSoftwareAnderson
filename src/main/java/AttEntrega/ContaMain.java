package AttEntrega;

import java.util.List;

public class ContaMain {
    public static Conta identifyMaiorDeposito(List<Conta> contas) {
        Conta maiorDeposito = contas.get(0);
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getSaldo() > maiorDeposito.getSaldo()) {
                maiorDeposito = contas.get(i);
            }
        }
        return maiorDeposito;
    }

    public static Conta identifyMaiorSaldoAposJuros(List<Conta> contas) {
        Conta maiorDepositoAposJuros = contas.get(0);
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getSaldo() > maiorDepositoAposJuros.getSaldo()) {
                maiorDepositoAposJuros = contas.get(i);
            }
        }
        return maiorDepositoAposJuros;
    }

    public static Conta identifyMenorSaldoAposJuros(List<Conta> contas) {
        Conta menorDepositoAposJuros = contas.get(0);
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getSaldo() < menorDepositoAposJuros.getSaldo()) {
                menorDepositoAposJuros = contas.get(i);
            }
        }
        return menorDepositoAposJuros;
    }

    public static Conta identifyMaiorSaque(List<Conta> contas) {
        Conta maiorSaque = contas.get(0);
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getSaque() > maiorSaque.getSaque()) {
                maiorSaque = contas.get(i);
            }
        }
        return maiorSaque;
    }

    public static Conta identifyMenorSaque(List<Conta> contas) {
        Conta menorSaque = contas.get(0);
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getSaque() < menorSaque.getSaque()) {
                menorSaque = contas.get(i);
            }
        }
        return menorSaque;
    }
}
