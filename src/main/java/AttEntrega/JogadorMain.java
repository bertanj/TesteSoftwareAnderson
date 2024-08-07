package AttEntrega;

import java.util.List;
import java.util.Objects;

public class JogadorMain {
    public Jogador identifyATAPlayer(List<Jogador> jogadores) {
        Jogador jogadorATA = null;
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getPosicao().equals("ATA")) {
                jogadorATA = jogadores.get(i);
            }
        }
        return jogadorATA;
    }

    public Jogador identifyMEIPlayer(List<Jogador> jogadores) {
        Jogador jogadorMEI = null;
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getPosicao().equals("MEI")) {
                jogadorMEI = jogadores.get(i);
            }
        }
        return jogadorMEI;
    }

    public Jogador identifyDEFPlayer(List<Jogador> jogadores) {
        Jogador jogadorDEF = null;
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getPosicao().equals("DEF")) {
                jogadorDEF = jogadores.get(i);
            }
        }
        return jogadorDEF;
    }

    public Jogador identifyYoungPlayer(List<Jogador> jogadores) {
        Jogador jogadorYoung = null;

        for (int i = 0; i < jogadores.size(); i++) {
            jogadorYoung = jogadores.get(i);
            if (jogadores.get(i).getIdade()<jogadorYoung.getIdade()) {
                jogadorYoung = jogadores.get(i);
            }
        }
        return jogadorYoung;
    }


    public Jogador identifyOlderPlayer(List<Jogador> jogadores) {
        Jogador jogadorOlder = null;

        for (int i = 0; i < jogadores.size(); i++) {
            jogadorOlder = jogadores.get(i);
             if (jogadores.get(i).getIdade() > jogadorOlder.getIdade()) {
                jogadorOlder = jogadores.get(i);
            }
        }
        return jogadorOlder;
    }

    public Jogador identifyForeignerPlayer(List<Jogador> jogadores) {
        Jogador jogadorForeigner = null;
        for (int i = 0; i < jogadores.size(); i++) {
            jogadorForeigner = jogadores.get(i);
            if(!Objects.equals(jogadorForeigner.getNacionalidade(), "BR")){
                jogadorForeigner = jogadores.get(i);
            }
        }
        return jogadorForeigner;
    }

    public Jogador identifyHeaviestPlayer(List<Jogador> jogadores) {
        Jogador jogadorHeaviest = null;

        for (int i = 0; i < jogadores.size(); i++) {
            jogadorHeaviest = jogadores.get(i);
            if (jogadores.get(i).getPeso() > jogadorHeaviest.getPeso()) {
                jogadorHeaviest = jogadores.get(i);
            }
        }
        return jogadorHeaviest;
    }

    public Jogador identifyLighterPlayer(List<Jogador> jogadores) {
        Jogador jogadorLighter = null;

        for (int i = 0; i < jogadores.size(); i++) {
            jogadorLighter = jogadores.get(i);
            if (jogadores.get(i).getPeso() > jogadorLighter.getPeso()) {
                jogadorLighter = jogadores.get(i);
            }
        }
        return jogadorLighter;
    }

    public Jogador identifyHigherPlayer(List<Jogador> jogadores) {
        Jogador jogadorHigher = null;

        for (int i = 0; i < jogadores.size(); i++) {
            jogadorHigher = jogadores.get(i);
            if (jogadores.get(i).getAltura() > jogadorHigher.getAltura()) {
                jogadorHigher = jogadores.get(i);
            }
        }
        return jogadorHigher;
    }


    public Jogador identifyLowerPlayer(List<Jogador> jogadores) {
        Jogador jogadorLower = null;

        for (int i = 0; i < jogadores.size(); i++) {
            jogadorLower = jogadores.get(i);
            if (jogadores.get(i).getAltura() < jogadorLower.getAltura()) {
                jogadorLower = jogadores.get(i);
            }
        }
        return jogadorLower;
    }

    public Jogador identifyRetireePlayer(List<Jogador> jogadores) {
        Jogador jogadorRetiree = null;

        for (int i = 0; i < jogadores.size(); i++) {
            jogadorRetiree = jogadores.get(i);
            if(jogadores.get(i).getAposentado()){
                jogadorRetiree = jogadores.get(i);
            }
        }
        return jogadorRetiree;
    }
}




/* Jogador jogador[] = new Jogador[5];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79, 78.0);

        jogador[0].calcularIdade();
        System.out.println(jogador[0].toString());
        jogador[0].calcularAposentadoria();

        */