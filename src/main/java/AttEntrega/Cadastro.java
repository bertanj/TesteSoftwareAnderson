package AttEntrega;

public class Cadastro {
    //Atributos
    private String nome;
    private String cpf;
    private String sangue;
    private double altura;
    private int idade;
    private String sexo;

    public Cadastro(String nome, String cpf, String sangue, double altura, int idade, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sangue = sangue;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSangue() {
        return sangue;
    }

    public void setSangue(String sangue) {
        this.sangue = sangue;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
