package AttEntrega;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MaiorNumeroTeste {

    @Test
    public void maiorNumero() {
        Numero hn1 = new Numero();
        hn1.setNumero(500);

        Numero hn2 = new Numero();
        hn2.setNumero(200);

        Numero hn3 = new Numero();
        hn3.setNumero(80);

        List<Numero> numeros = new ArrayList<Numero>();
        numeros.add(hn1);
        numeros.add(hn2);
        numeros.add(hn3);

        ServicoNumero servicoNumero = new ServicoNumero();
        Assert.assertEquals(hn1.getNumero(), servicoNumero.findHighNumber(numeros).getNumero());

    }

    @Test
    public void menorNumero() {
        Numero ln1 = new Numero();
        ln1.setNumero(500);

        Numero ln2 = new Numero();
        ln2.setNumero(200);

        Numero ln3 = new Numero();
        ln3.setNumero(80);

        List<Numero> numeros = new ArrayList<Numero>();
        numeros.add(ln1);
        numeros.add(ln2);
        numeros.add(ln3);

        ServicoNumero servicoNumero = new ServicoNumero();
        Assert.assertEquals(ln3.getNumero(), servicoNumero.findLowNumber(numeros).getNumero());
    }

    @Test
    public void medioNumero() {
        Numero mn1 = new Numero();
        mn1.setNumero(500);

        Numero mn2 = new Numero();
        mn2.setNumero(200);

        Numero mn3 = new Numero();
        mn3.setNumero(80);

        List<Numero> numeros = new ArrayList<Numero>();
        numeros.add(mn1);
        numeros.add(mn2);
        numeros.add(mn3);

        ServicoNumero servicoNumero = new ServicoNumero();
        Assert.assertEquals(mn2.getNumero(), servicoNumero.findMediumNumber(numeros).getNumero());
    }
}
