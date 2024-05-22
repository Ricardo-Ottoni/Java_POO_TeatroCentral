package src.ingressos;

import src.teatro.Poltrona;
import src.cliente.Cliente;
import src.eventos.Evento;

import java.util.ArrayList;
import java.util.Scanner;

import static src.main.Main.escolhePoltrona;

public class Ingresso {
    // Atributos
    private static int contadorIngressos = 1; // Iniciar em 1
    private int numeroIngresso;
    private Poltrona poltrona;
    private Cliente cliente;
    private Evento evento;
    private ArrayList<Ingresso> ingressos;

    // Construtor
    public Ingresso(Cliente cliente) {
        this.cliente = cliente;
        this.ingressos = new ArrayList<>();
    }

    public Ingresso(Poltrona poltrona, Cliente cliente, Evento evento) {
        this.numeroIngresso = contadorIngressos++; // Incrementar e então atribuir
        this.poltrona = poltrona;
        this.cliente = cliente;
        this.evento = evento;
    }

    // Método para venda de ingressos
    public void vendaIngresso() {
        Scanner scanner = new Scanner(System.in);
        char escolha;
        Evento evento = new Evento();
        Poltrona poltronaEscolhida = null;

        while (true) {
            System.out.println("Possui cadastro? (S/N)");
            escolha = Character.toUpperCase(scanner.nextLine().charAt(0));

            if (escolha == 'S') {
                System.out.println("Informe o nome:");
                String nomeCliente = scanner.nextLine();

                Cliente clienteEncontrado = null;
                for (Cliente c : cliente.getClientes()) {
                    if (c.getNome().equalsIgnoreCase(nomeCliente)) {
                        clienteEncontrado = c;
                        break;
                    }
                }

                if (clienteEncontrado != null) {
                    System.out.println("Cliente encontrado:");
                    System.out.println("Evento(s):");
                    evento.exibeEventos();

                    System.out.println("\nDigite o nome do evento:");
                    String nomeEvento = scanner.nextLine();
                    Evento eventoEncontrado = null;
                    for (Evento ev : evento.getEventos()) {
                        if (ev.getNome().equalsIgnoreCase(nomeEvento)) {
                            eventoEncontrado = ev;
                            break;
                        }
                    }

                    if (eventoEncontrado != null) {
                        System.out.println("Poltronas disponíveis:");
                        poltronaEscolhida = escolhePoltrona();

                        Ingresso ingresso = new Ingresso(poltronaEscolhida, clienteEncontrado, eventoEncontrado);
                        ingressos.add(ingresso);

                        int formaPagamento = formaPagamento(); // Captura a forma de pagamento
                        System.out.println("Ingresso comprado com sucesso!");
                        System.out.println("Número do ingresso: " + ingresso.getNumeroIngresso());
                        System.out.println("Detalhes do ingresso:");
                        System.out.println("Cliente: " + clienteEncontrado.getNome());
                        System.out.println("Evento: " + eventoEncontrado.getNome());
                        System.out.println("Poltrona: " + poltronaEscolhida.getNumero());
                        System.out.println("Pagamento: " + formaPagamento); // Imprime a forma de pagamento
                        break; // Sair do loop após finalizar a venda
                    } else {
                        System.out.println("Venda cancelada.");
                        break; // Sair do loop se a venda for cancelada
                    }
                } else {
                    System.out.println("Cliente não encontrado.\n");
                }
            } else if (escolha == 'N') {
                cliente.cadastroCliente();
            } else {
                System.out.println("Opção inválida. Digite 'S' para Sim ou 'N' para Não.");
            }
        }
    }

    // Métodos de acesso
    public int getNumeroIngresso() {
        return numeroIngresso;
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