package src.main;

import src.cliente.Cliente;
import src.eventos.Evento;
import src.ingressos.Ingresso;
import src.teatro.Poltrona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Evento evento = new Evento();
        Cliente cliente = new Cliente();
        Poltrona poltrona = new Poltrona();
        Ingresso ingresso = new Ingresso();

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
            System.out.println("----------------------");
            System.out.println(" 10. Sair");
            System.out.println("----------------------");

            opcao = scanner.nextInt();
            if (opcao == 1) {
                evento.exibeEventos();
            } else if (opcao == 2) {
                evento.addEvento();
            } else if (opcao == 3) {
                evento.deletaEvento();
            }  else if (opcao == 4) {
                cliente.cadastroCliente();
            } else if (opcao == 5) {
                ingresso.vendaIngresso();
            } else if (opcao == 6) {
                //poltrona.verificaPoltrona();
            } else if (opcao == 7) {
                //reserva.verificaReserva();
            } else if (opcao == 8) {
                //fila.verificaFila();
            } else if (opcao == 9) {
                //relatorio.consultaRelatorio();
            } else if (opcao == 10) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }


}
