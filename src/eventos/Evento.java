package src.eventos;


public class Evento {
    //atributos
    private String nome;
    private String data;
    private String horario;
    private String descricao;
    private double precoIngresso;

    //método construtor
    public Evento(String nome, String data, String horario, String descricao, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
        this.precoIngresso = precoIngresso;
        int capacidadeTotal = 1751;   //sendo 77 cadeiras cativas
    }

    //método para exibir informaçoes do evento
    @Override
    public String toString(){
        return " Nome: " + nome + "\n Data: " + data + "\n Horário: " + horario +
                "\n Descrição: " + descricao + "\n Preço do Ingresso: R$ " + precoIngresso;
    }

    //método de acesso get/set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
}
