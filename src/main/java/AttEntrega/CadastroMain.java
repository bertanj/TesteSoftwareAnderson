package AttEntrega;

import java.util.List;

public class CadastroMain {

    public static Cadastro findCPF(List<Cadastro> pacientes) {
        Cadastro cpf = null;
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals("126.209.409-69")) {
                cpf = pacientes.get(i);
            }
        }
        return cpf;
    }

    public static Cadastro findName(List<Cadastro> pacientes) {
        Cadastro nome = null;
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNome().equals("Ana")) {
                nome = pacientes.get(i);
            }
        }
        return nome;
    }

    public static Cadastro findBlood(List<Cadastro> pacientes) {
        Cadastro blood = null;
        for (int i = 0; i < pacientes.size(); i++) {
            if(pacientes.get(i).getSangue().equals("A+")){
                blood = pacientes.get(i);
            }
        }
        return blood;
    }

    public static Cadastro findOlder(List<Cadastro> pacientes) {
        Cadastro idade = pacientes.get(0);
        for (int i = 0; i < pacientes.size(); i++) {
            if(idade.getIdade() < pacientes.get(i).getIdade()){
                idade = pacientes.get(i);
            }
        }
        return idade;
    }

    public static Cadastro findFemale(List<Cadastro> pacientes) {
        Cadastro genero = null;
        for (int i = 0; i < pacientes.size(); i++) {
            if(pacientes.get(i).getSexo().equals("F")){
                genero = pacientes.get(i);
            }
        }
        return genero;
    }
}
