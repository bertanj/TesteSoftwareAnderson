package AttEntrega;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CadastroTeste {
    @Test
    public void findCPF(){
        Cadastro[] cadastro = new Cadastro[3];

        cadastro[0] = new Cadastro("Mateus","126.209.409-69","O-",1.78,18,"M");
        cadastro[1] = new Cadastro("Ana", "123.145.678-90", "A+", 1.60, 29,"F");
        cadastro[2] = new Cadastro("Anderson", "226.345.456-13", "B-",1.87,32,"M");

        List<Cadastro> pacientes = new ArrayList<Cadastro>();
        pacientes.add(cadastro[0]);
        pacientes.add(cadastro[1]);
        pacientes.add(cadastro[2]);

        CadastroMain cadastroMain = new CadastroMain();
        Assert.assertEquals(cadastro[0].getCpf(), CadastroMain.findCPF(pacientes).getCpf());
    }

    @Test
    public void findNome(){
        Cadastro[] cadastro = new Cadastro[3];

        cadastro[0] = new Cadastro("Mateus","126.209.409-69","O-",1.78,18,"M");
        cadastro[1] = new Cadastro("Ana", "123.145.678-90", "A+", 1.60, 29,"F");
        cadastro[2] = new Cadastro("Anderson", "226.345.456-13", "B-",1.87,32,"M");

        List<Cadastro> pacientes = new ArrayList<Cadastro>();
        pacientes.add(cadastro[0]);
        pacientes.add(cadastro[1]);
        pacientes.add(cadastro[2]);

        CadastroMain cadastroMain = new CadastroMain();
        Assert.assertEquals(cadastro[1].getNome(), CadastroMain.findName(pacientes).getNome());
    }

    @Test
    public void findTipoSangue(){
        Cadastro[] cadastro = new Cadastro[3];

        cadastro[0] = new Cadastro("Mateus","126.209.409-69","O-",1.78,18,"M");
        cadastro[1] = new Cadastro("Ana", "123.145.678-90", "A+", 1.60, 29,"F");
        cadastro[2] = new Cadastro("Anderson", "226.345.456-13", "B-",1.87,32,"M");

        List<Cadastro> pacientes = new ArrayList<Cadastro>();
        pacientes.add(cadastro[0]);
        pacientes.add(cadastro[1]);
        pacientes.add(cadastro[2]);

        CadastroMain cadastroMain = new CadastroMain();
        Assert.assertEquals(cadastro[1].getSangue(), CadastroMain.findBlood(pacientes).getSangue());
    }

    @Test
    public void findOlder(){
        Cadastro[] cadastro = new Cadastro[3];

        cadastro[0] = new Cadastro("Mateus","126.209.409-69","O-",1.78,18,"M");
        cadastro[1] = new Cadastro("Ana", "123.145.678-90", "A+", 1.60, 29,"F");
        cadastro[2] = new Cadastro("Anderson", "226.345.456-13", "B-",1.87,32,"M");

        List<Cadastro> pacientes = new ArrayList<Cadastro>();
        pacientes.add(cadastro[0]);
        pacientes.add(cadastro[1]);
        pacientes.add(cadastro[2]);

        CadastroMain cadastroMain = new CadastroMain();
        Assert.assertEquals(cadastro[2].getIdade(), CadastroMain.findOlder(pacientes).getIdade());
    }

    @Test
    public void findFemale(){
        Cadastro[] cadastro = new Cadastro[3];

        cadastro[0] = new Cadastro("Mateus","126.209.409-69","O-",1.78,18,"M");
        cadastro[1] = new Cadastro("Ana", "123.145.678-90", "A+", 1.60, 29,"F");
        cadastro[2] = new Cadastro("Anderson", "226.345.456-13", "B-",1.87,32,"M");

        List<Cadastro> pacientes = new ArrayList<Cadastro>();
        pacientes.add(cadastro[0]);
        pacientes.add(cadastro[1]);
        pacientes.add(cadastro[2]);

        CadastroMain cadastroMain = new CadastroMain();
        Assert.assertEquals(cadastro[1].getSexo(), CadastroMain.findFemale(pacientes).getSexo());
    }
}
