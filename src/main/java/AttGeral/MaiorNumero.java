package AttGeral;

import java.util.HashMap;
import java.util.Map;

public class MaiorNumero {

        private Map<Integer, String> valoresNumericos = new HashMap<>();

        public MaiorNumero(){
            valoresNumericos.put(29, "Maior numero");
            valoresNumericos.put(11, "Menor numero");
            valoresNumericos.put(18, "Numero intermediario");
        }

        public String highNumber(int idade){
                if(idade == 29){
                        return "Maior numero";
                }else if(idade == 11){
                        return "Menor numero";
                }else if(idade == 18) {
                        return "Numero intermediario";
                }
                return valoresNumericos.get(idade);
        }
    }

