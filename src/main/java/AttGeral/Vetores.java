package AttGeral;

import java.util.HashMap;
import java.util.Map;

public class Vetores {
    private Map <String, Integer > arrayPessoa = new HashMap<>();

    public Vetores() {
        arrayPessoa.put("Ana", 29);
        arrayPessoa.put("Mateus", 18);
    }

    public static String idade(int i) {
        if (i == 29){
            return "Ana";
        }else if (i == 18){
            return "Mateus";
        }
        return null;
    }
}
