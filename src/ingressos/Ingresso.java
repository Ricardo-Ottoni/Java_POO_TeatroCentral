package src.ingressos;

import src.teatro.Poltrona;
import src.cliente.Cliente;
import src.eventos.Evento;
//import src.reserva.Reserva;
//import src.fila.Fila;

//importar classes: cliente, setor e poltrona

public class
Ingresso {
    //atributos
    private int numeroIngresso;
    private double precoIngresso;
    private Poltrona poltrona;
    private Cliente cliente;
    private Evento evento;
    private Reserva reserva;
    private Fila fila;

    //método construtor
    public Ingresso() {
    }
    public Ingresso(int numeroIngresso, double precoIngresso, Poltrona poltrona,
                    Cliente cliente, Evento evento, Reserva reserva, Fila fila) {
        this.numeroIngresso = numeroIngresso;
        this.precoIngresso = precoIngresso;
        this.poltrona = poltrona;
        this.cliente = cliente;
        this.evento = evento;
        this.reserva = reserva;
        this.fila = fila;
    }

    //método de acesso get/set

    public int getNumeroIngresso() {
        return numeroIngresso;
    }
    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public Poltrona getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(Poltrona poltrona) {
        this.poltrona = poltrona;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Fila getFila() {
        return fila;
    }
    public void setFila(Fila fila) {
        this.fila = fila;
    }
}
