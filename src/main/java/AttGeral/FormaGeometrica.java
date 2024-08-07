package AttGeral;

import java.util.HashMap;
import java.util.Map;

public class FormaGeometrica {

    private Map<Integer, String> valoresGeometricos = new HashMap<>();

    public FormaGeometrica(){
        valoresGeometricos.put(4, "Quadrado");
        valoresGeometricos.put(3, "Triângulo");
        valoresGeometricos.put(5, "Pentagono");
        valoresGeometricos.put(6, "Hexagono");
    }

    public String geometria(int qtdLados) {

        /*
        ANTES DA REFATORAÇÃO
        if(qtdLados == 4) {
            return "Quadrado";
        }
        else if(qtdLados == 3) {
            return "Triângulo";
        }
        return "Não é forma geométrica";
         */

        /*
        if(valoresGeometricos.get(qtdLados)){
            return valoresGeometricos.get(qtdLados)
        }

        return "Não é forma geométrica";
         */
        return valoresGeometricos.get(qtdLados) != null ? valoresGeometricos.get(qtdLados) : "Não é forma geométrica";
    }
}
