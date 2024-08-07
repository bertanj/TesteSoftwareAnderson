package AttEntrega;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoaTeste {

    @Test
    public void findOldPerson() {
        Pessoa p1 = new Pessoa();
        p1.setNome("Gelado");
        p1.setIdade(31);

        Pessoa p2 = new Pessoa();
        p2.setNome("Zé");
        p2.setIdade(8);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);

        ServicoPessoa servicoPessoa = new ServicoPessoa();
        Assert.assertEquals(p1.getNome(), servicoPessoa.identifyOldPerson(pessoas).getNome());
    }

    @Test
    public void findNewPerson() {
        Pessoa p1 = new Pessoa();
        p1.setNome("Gelado");
        p1.setIdade(31);

        Pessoa p2 = new Pessoa();
        p2.setNome("Zé");
        p2.setIdade(8);

        Pessoa p3 = new Pessoa();
        p3.setNome("Sr. Incrivel");
        p3.setIdade(4);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        ServicoPessoa servicoPessoa = new ServicoPessoa();
        Assert.assertEquals(p3, servicoPessoa.identifyNewPerson(pessoas));
    }
}
