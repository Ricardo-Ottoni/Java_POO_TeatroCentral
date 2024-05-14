package src.ingressos;

public class Ingresso {
    //atributos
    private String evento;
    private int numeroIngresso;
    private int numeroPoltrona;

    //método construtor
    public Ingresso() {
    }
    public Ingresso(String evento, int numeroIngresso, int numeroPoltrona) {
        this.evento = evento;
        this.numeroIngresso = numeroIngresso;
        this.numeroPoltrona = numeroPoltrona;
    }

    //método de acesso get/set
    public String getEvento() {
        return evento;
    }
    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }
    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public int getNumeroPoltrona() {
        return numeroPoltrona;
    }
    public void setNumeroPoltrona(int numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }
}
