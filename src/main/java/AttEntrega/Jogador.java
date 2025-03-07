package AttEntrega;

public class Jogador {
    //Atributos
    protected String nome;
    protected String posicao;
    protected int anoNasc;
    protected static int idade;
    protected String nacionalidade;
    protected float altura;
    protected float peso;
    protected boolean aposentado;

    //Metodos
    public void calcularIdade(){
        this.setIdade(2024 - this.getAnoNasc());
    }

    public boolean calcularAposentadoria(){
        if (this.getPosicao().equals("DEF")){
            if (this.getIdade() >= 40){
                this.setAposentado(true);
                return getAposentado();
            } else{
                int i = 40 - this.getIdade();
                this.setAposentado(false);
                return getAposentado();
            }
        }else if(this.getPosicao().equals("MEI")){
            if (this.getIdade() >= 38){
                this.setAposentado(true);
                return getAposentado();
            } else{
                int i = 38 - this.getIdade();
                this.setAposentado(false);
                return getAposentado();
            }
        }else if (this.getPosicao().equals("ATA")){
            if (this.getIdade() >= 35){
                this.setAposentado(true);
                return getAposentado();
            } else{
                int i = 35 - this.getIdade();
                this.setAposentado(false);
                return getAposentado();
            }
        }
        return getAposentado();
    }

    //Metodos especiais

    public Jogador(String nome, String posicao, int anoNasc, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.anoNasc = anoNasc;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean getAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", anoNasc=" + anoNasc +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}