package src.ingressos;

import java.util.ArrayList;

public class Fila {
    //atributos
    private int numeroNaFila;
    private ArrayList<Fila> filas;

    //método construtor
    public Fila() {
        this.filas = new ArrayList<>();
    }
    public Fila(int numeroNaFila) {
        this.numeroNaFila = numeroNaFila;
        this.filas = new ArrayList<>();
    }

    //método para verificar andamento da fila
    public void verificaFila() {
        System.out.println("em construçao");
    }

    //método de acesso get/set
    public int getNumeroNaFila() {
        return numeroNaFila;
    }
    public void setNumeroNaFila(int numeroNaFila) {
        this.numeroNaFila = numeroNaFila;
    }

    public ArrayList<Fila> getFilas() {
        return filas;
    }
    public void setFilas(Fila fila) {
        this.filas.add(fila);
    }
}
