package AttGeral;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VetoresTeste {
    private Vetores vetores = new Vetores();

    @Test
    public void maisVelho(){
        assertEquals("Ana", Vetores.idade(29));
    }

    @Test
    public void maisNovo(){
        assertEquals("Mateus", Vetores.idade(18));
    }

}
