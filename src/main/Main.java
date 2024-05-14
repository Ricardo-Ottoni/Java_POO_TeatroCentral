package src.main;

import src.eventos.Evento;
import src.teatro.Teatro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Teatro teatro = new Teatro();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println();
            System.out.println("-------- MENU --------");
            System.out.println("Escolha uma opção: ");
            System.out.println("----------------------");
            System.out.println("1. Eventos cadastrados");
            System.out.println("2. Cadastrar evento");
            System.out.println("3. Remover evento");
            System.out.println("4. Sair");
            System.out.println("----------------------");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    teatro.exibeEventos();
                    break;
                case 2:
                    teatro.addEvento();
                    break;
                case 3:
                    teatro.deletaEvento();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
