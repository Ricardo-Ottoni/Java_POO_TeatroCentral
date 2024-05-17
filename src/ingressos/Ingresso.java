package src.ingressos;

import src.teatro.Poltrona;
import src.cliente.Cliente;
import src.eventos.Evento;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingresso {
    //atributos
    private int numeroIngresso;
    private Poltrona poltrona;
    private Cliente cliente;
    private Evento evento;
    private ArrayList<Ingresso> ingressos;  //criando lista de Ingresso ao Main

    //método construtor
    public Ingresso() {
        ingressos = new ArrayList<>();   //inicia lista
    }
    public Ingresso(int numeroIngresso, Poltrona poltrona,
                    Cliente cliente, Evento evento) {
        this.numeroIngresso = numeroIngresso;
        this.poltrona = poltrona;
        this.cliente = cliente;
        this.evento = evento;
    }

    //método para venda de ingressos
    public void vendaIngresso() {
        Scanner scanner = new Scanner(System.in);
        char escolha = ' ';
        Evento evento = new Evento();


        while (true) {
            System.out.println("Possui cadastro? (S/N)");    //chamar e verificar classe Cliente
            escolha = Character.toUpperCase(scanner.nextLine().charAt(0));

            if (escolha == 'S') {
                System.out.println("Informe o nome: ");
                String nomeCliente = scanner.nextLine();

                Cliente clienteEncontrado = null;
                for (Cliente c : cliente.getClientes()) {           //lembrar q aqui eu busco o cliente
                    if (c.getNome().equalsIgnoreCase(nomeCliente)) {
                        clienteEncontrado =c;
                        break;
                    }
                }

                if (clienteEncontrado != null) {     // lembrar q aqui eu verifico se o cliente foi encontrado
                    System.out.println("Cliente encontrado:");      //entao eu continuo com a venda

                    System.out.println("Informe o evento desejado:");
                    evento.exibeEventos();
                    ArrayList<Evento> eventos = evento.getEventos();
                    System.out.println("Poltronas disponiveis: ");
                    poltrona.escolhePoltrona();
                    //continuar...
                } else {
                    System.out.println("Cliente não encontrado.");
                }

            } else if (escolha == 'N') {
                cliente.cadastroCliente();
            } else {
                System.out.println("Opçao invalida. Digite 'S' para Sim ou 'N' para Nao.");
            }
        }
    }

    //método de acesso get/set
    public int getNumeroIngresso() {
        return numeroIngresso;
    }
    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
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

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }
    public void addIngressos(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }
}