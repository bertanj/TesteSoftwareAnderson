package AttGeral;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaiorNumeroTeste {

    private MaiorNumero maiorNumero = new MaiorNumero();

    @Test
    public void maiorNumero() {
        assertEquals("Maior numero", maiorNumero.highNumber(29));
    }

    @Test
    public void menorNumero() {
        assertEquals("Menor numero", maiorNumero.highNumber(11));
    }

    @Test
    public void intermedioNumero() {
        assertEquals("Numero intermediario", maiorNumero.highNumber(18));
    }

}
