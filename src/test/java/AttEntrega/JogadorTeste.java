package AttEntrega;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JogadorTeste {

    //Saída esperada: posição do jogador Anderson que é o atacante (ATA).
    @Test
    public void findATAPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);



        jogador[1] = new Jogador("Anderson", "ATA", 1994, "BR", 1.85f, 82.0f);

        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[1].getPosicao(), jogadorMain.identifyATAPlayer(jogadores).getPosicao());

    }

    //Saída esperada: posição do jogador Mateus que atua no meio campo (MEI).
    @Test
    public void findMEIPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);



        jogador[1] = new Jogador("Anderson", "ATA", 1994, "BR", 1.85f, 82.0f);

        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[0].getPosicao(), jogadorMain.identifyMEIPlayer(jogadores).getPosicao());

    }

    //Saída esperada: posição da jogadora Ana que atua na defesa do time(DEF)
    @Test
    public void findDEFPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[2].getPosicao(), jogadorMain.identifyDEFPlayer(jogadores).getPosicao());

    }

    //Saída esperada: Idade do jogador Mateus que é o jogador mais jovem (18 anos)
    @Test
    public void findYoungPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        jogador[0].calcularIdade();
        jogador[1].calcularIdade();
        jogador[2].calcularIdade();

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[0].getIdade(), jogadorMain.identifyYoungPlayer(jogadores).getIdade());
    }

    //Saída esperada: Idade do jogador Anderson que é o mais velho dos jogadores (44 anos)
    @Test
    public void findOlderPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        jogador[0].calcularIdade();
        jogador[1].calcularIdade();
        jogador[2].calcularIdade();

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[1].getIdade(), jogadorMain.identifyOlderPlayer(jogadores).getIdade());
    }

    //Saída esperada: Nacionalidade da jogadora Ana pois ela é a estrangeira dentre os jogadores.
    @Test
    public void findForeignerPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[2].getNacionalidade(), jogadorMain.identifyForeignerPlayer(jogadores).getNacionalidade());
    }

    //Saída esperada: Peso jogador Anderson pois é o mais pesado dos jogadores
    @Test
    public void findHeaviestPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[1].getPeso(), jogadorMain.identifyHeaviestPlayer(jogadores).getPeso());

    }

    //Saída esperada: Peso jogadora Ana pois é a mais leve dos jogadores
    @Test
    public void findLightPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[2].getPeso(), jogadorMain.identifyLighterPlayer(jogadores).getPeso());

    }

    //Saída esperada: Altura do jogador Anderson pois ele é o mais alto dos jogadores
    @Test
    public void findHigherPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[1].getAltura(), jogadorMain.identifyHigherPlayer(jogadores).getAltura());
    }

    //Saída esperada: Altura da jogadora Ana pois ela é a mais baixa dos jogadores
    @Test
    public void findLowerPlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[2].getAltura(), jogadorMain.identifyLowerPlayer(jogadores).getAltura());
    }

    //Saída esperada: Retorno true do método calcularAposentadoria do jogador Anderson pois ele ultrapassa o limite de idade de jogadores do ataque
    @Test
    public void findRetireePlayer(){
        Jogador [] jogador = new Jogador[3];

        jogador [0] = new Jogador("Mateus Bertani", "MEI", 2006, "BR", 1.79f, 78.0f);
        jogador[1] = new Jogador("Anderson", "ATA", 1980, "BR", 1.85f, 82.0f);
        jogador[2] = new Jogador("Ana", "DEF" , 1995, "ITA", 1.70f, 60.0f);

        jogador[0].calcularAposentadoria();
        jogador[1].calcularAposentadoria();
        jogador[2].calcularAposentadoria();

        List<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(jogador[0]);
        jogadores.add(jogador[1]);
        jogadores.add(jogador[2]);

        JogadorMain jogadorMain = new JogadorMain();
        Assert.assertEquals(jogador[1].getAposentado(), jogadorMain.identifyRetireePlayer(jogadores).getAposentado());
    }
}
//jogador[0].calcularIdade();
//System.out.println(jogador[0].toString());
//jogador[0].calcularAposentadoria();