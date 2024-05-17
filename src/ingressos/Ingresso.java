package src.ingressos;

import src.teatro.Poltrona;
import src.cliente.Cliente;
import src.eventos.Evento;

import java.util.ArrayList;
import java.util.Scanner;
//import src.reserva.Reserva;
//import src.fila.Fila;

//importar classes: cliente, setor e poltrona

public class
Ingresso {
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

        Cliente cliente = new Cliente();
        Evento evento = new Evento();

        System.out.println("Possui cadastro?");    //chamar e verificar classe Cliente
        int escolha = 0;
        while (escolha != 2){
            System.out.println(" (S)im");
            System.out.println(" (N)ao");

            escolha = Integer.parseInt(scanner.nextLine());
            if (escolha == 'S' || escolha == 's'){
                System.out.println("Informe o nome: ");
                String nomeCliente = scanner.nextLine();

                Cliente clienteEcontrado = null;        //lembrar q aqui eu busco o cliente
                for (Cliente c : cliente.getCliente()) {
                    if (c.getNome().equalsIgnoreCase(nomeCliente)) {
                        clienteEcontrado = c;
                        break;
                    }
                }

                if (clienteEcontrado != null) {     // lembrar q aqui eu verifico se o cliente foi encontrado

                    System.out.println("Cliente encontrado:");
                    System.out.println("Nome: " + clienteEncontrado.getNome());
                    System.out.println("CPF: " + clienteEncontrado.getCpf());
                    System.out.println("Telefone: " + clienteEncontrado.getTelefone());

                    // Solicita o evento ao usuário
                    System.out.println("Informe o evento desejado:");
                    evento.exibeEventos();
                    ArrayList<Evento> eventos = evento.getEventos();
                    System.out.println("Poltronas disponiveis: ");
                    poltrona.escolhePoltrona();
                    //continuar...
                }
            }

            } else if (escolha == 'N' || escolha == 'n'){
                cliente.cadastroCliente();
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