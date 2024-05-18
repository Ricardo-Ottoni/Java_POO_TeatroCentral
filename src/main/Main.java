package src.main;

import src.cliente.Cliente;
import src.eventos.Evento;
import src.ingressos.Fila;
import src.ingressos.Reserva;
import src.ingressos.Ingresso;
import src.teatro.Poltrona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Poltrona> poltronas = new ArrayList<>();
    public static Evento eventos = new Evento();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Evento evento = new Evento();
        Ingresso ingresso = new Ingresso(cliente);
        Reserva reserva = new Reserva();
        Fila fila = new Fila();

        int opcao = 0;
        while (opcao != 10) {
            System.out.println();
            System.out.println("--------- MENU ---------");
            System.out.println(" Escolha uma opção: ");
            System.out.println("------------------------");
            System.out.println(" 1. Eventos cadastrados");
            System.out.println(" 2. Cadastrar eventos");
            System.out.println(" 3. Remover eventos");
            System.out.println("------------------------");
            System.out.println(" 4. Cadastro cliente");
            System.out.println(" 5. Venda de ingressos");
            System.out.println("------------------------");
            System.out.println(" 6. Poltronas");
            System.out.println(" 7. Reservas");
            System.out.println(" 8. Fila");
            System.out.println("------------------------");
            System.out.println(" 9. Relatorio");
            System.out.println("------------------------");
            System.out.println(" 10. Sair");
            System.out.println("------------------------");

            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) {
                eventos.exibeEventos();
            } else if (opcao == 2) {
                eventos.addEvento();
            } else if (opcao == 3) {
                eventos.deletaEvento();
            } else if (opcao == 4) {
                cliente.cadastroCliente();
            } else if (opcao == 5) {
                ingresso.vendaIngresso();
            } else if (opcao == 6) {
                escolhePoltrona();
            } else if (opcao == 7) {
                // reserva.verificaReserva();
            } else if (opcao == 8) {
                // fila.verificaFila();
            } else if (opcao == 9) {
                // relatorio.consultaRelatorio();
            } else if (opcao == 10) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static Poltrona escolhePoltrona() {
        Scanner scanner = new Scanner(System.in);
        int numeroPoltrona;

        while (true) {
            System.out.println("--------- Menu Poltrona---------");
            System.out.println("  Digite o numero da poltrona: \n");
            System.out.println("  De    1 a  572 = Plateia A ");
            System.out.println("  De  573 a 1233 = Plateia B ");
            System.out.println("  De 1234 a 1354 = Camarote ");
            System.out.println("  De 1355 a 1624 = Balcao Nobre");
            System.out.println("  De 1625 a 1755 = Galeria ");
            System.out.println("--------------------------------");

            numeroPoltrona = scanner.nextInt();
            if (numeroPoltrona == -1) {
                System.out.println("Saindo do menu de poltronas...");
                return null;
            } else if (numeroPoltrona >= 1 && numeroPoltrona <= 572) {
                System.out.println("Ok, poltrona disponível na Plateia A");
                return new Poltrona(numeroPoltrona);
            } else if (numeroPoltrona >= 573 && numeroPoltrona <= 1233) {
                System.out.println("Ok, poltrona disponível na Plateia B");
                return new Poltrona(numeroPoltrona);
            } else if (numeroPoltrona >= 1234 && numeroPoltrona <= 1354) {
                System.out.println("Ok, poltrona disponível no Camarote");
                return new Poltrona(numeroPoltrona);
            } else if (numeroPoltrona >= 1355 && numeroPoltrona <= 1624) {
                System.out.println("Ok, poltrona disponível no Balcão Nobre");
                return new Poltrona(numeroPoltrona);
            } else if (numeroPoltrona >= 1625 && numeroPoltrona <= 1755) {
                System.out.println("Ok, poltrona disponível na Galeria");
                return new Poltrona(numeroPoltrona);
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static void formaPagamento() {
        Scanner scanner = new Scanner(System.in);

        int pg = 0;
        while (pg != 4) {
            System.out.println("--------Menu Pagamento--------");
            System.out.println(" Escolha a forma de pagamento:");
            System.out.println(" 1. Dinheiro -----------------");
            System.out.println(" 2. PIX ----------------------");
            System.out.println(" 3. Debito -------------------");
            System.out.println(" 4. Credito ------------------");
            System.out.println("------------------------------");

            pg = scanner.nextInt();
            scanner.nextLine();
            if (pg == -1) {
                System.out.println("Saindo do menu pagamento...");
            } else if (pg == 1) {
                System.out.println("Forma de pagamento: Dinheiro");
            } else if (pg == 2) {
                System.out.println("Forma de pagamento: PIX");
            } else if (pg == 3) {
                System.out.println("Forma de pagamento: Debito");
            } else if (pg == 4) {
                System.out.println("Forma de pagamento: Credito");
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}