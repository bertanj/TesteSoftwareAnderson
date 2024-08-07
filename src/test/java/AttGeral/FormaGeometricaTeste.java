package AttGeral;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FormaGeometricaTeste {

    private FormaGeometrica formaGeometrica = new FormaGeometrica();

    @Test
    public void isQuadrado(){
        assertEquals("Quadrado", formaGeometrica.geometria(4));
    }

    @Test
    public void isTriangulo(){
        assertEquals("Triângulo", formaGeometrica.geometria(3));
    }

    @Test
    public void isNotFormaGeometrica(){
        assertEquals("Não é forma geométrica", formaGeometrica.geometria(2));
    }

    @Test
    public void isPentagono(){
        assertEquals("Pentagono", formaGeometrica.geometria(5));
    }

    @Test
    public void isHexagono(){
        assertEquals("Hexagono", formaGeometrica.geometria(6));
    }

}
