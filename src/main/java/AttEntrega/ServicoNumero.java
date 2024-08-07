package AttEntrega;

import java.util.List;

public class ServicoNumero {
    public Numero findHighNumber(List<Numero> numeros) {
        Numero highNumber = new Numero();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i).getNumero() > highNumber.getNumero()) {
                highNumber = numeros.get(i);
            }
        }
        return highNumber;
    }

    public Numero findLowNumber(List<Numero> numeros) {
        Numero lowNumber = null;
        for (int i = 0; i < numeros.size(); i++) {
            if(lowNumber == null) {
                lowNumber = numeros.get(i);
            }else if (numeros.get(i).getNumero() < lowNumber.getNumero()) {
                lowNumber = numeros.get(i);
            }
        }
        return lowNumber;
    }

    public Numero findMediumNumber(List<Numero> numeros) {
        Numero mediumNumber = null;
        for (int i = 0; i < numeros.size(); i++) {
            if(mediumNumber == null) {
                mediumNumber = numeros.get(i);
            }else if (numeros.get(i).getNumero() < this.findHighNumber(numeros).getNumero() && numeros.get(i).getNumero() > this.findLowNumber(numeros).getNumero() ) {
                mediumNumber = numeros.get(i);
            }
        }
        return mediumNumber;
    }
}
