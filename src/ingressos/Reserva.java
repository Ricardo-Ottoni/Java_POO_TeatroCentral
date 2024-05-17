package src.ingressos;

import src.cliente.Cliente;
import src.eventos.Evento;
import src.teatro.Poltrona;

import java.util.ArrayList;

public class Reserva {
    //atributos
    private Poltrona poltrona;
    private Cliente cliente;
    private Evento evento;
    private Ingresso ingresso;
    private ArrayList<Reserva> reservas;

    //método construtor
    public Reserva() {
        this.reservas = new ArrayList<>();
    }
    public Reserva(Poltrona poltrona, Cliente cliente, Evento evento, Ingresso ingresso) {
        this.poltrona = poltrona;
        this.cliente = cliente;
        this.evento = evento;
        this.ingresso = ingresso;
        this.reservas = reservas;
    }

    // método para criar reserva de ingressos
    public void verificaReserva() {
        System.out.println("em construção");
    }

    // getters e setters
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

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }
}