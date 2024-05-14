package src.vendas;

public class Venda {

    //atributos
    private boolean onLine;
    private boolean presencial;

    //método construtor

    public Venda() {
    }
    public Venda(boolean onLine, boolean presencial) {
        this.onLine = onLine;
        this.presencial = presencial;
    }

    //método de acesso get/set
    public boolean isOnLine() {
        return onLine;
    }
    public void setOnLine(boolean onLine) {
        this.onLine = onLine;
    }

    public boolean isPresencial() {
        return presencial;
    }
    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }
}