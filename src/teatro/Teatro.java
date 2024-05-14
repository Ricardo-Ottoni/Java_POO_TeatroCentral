package src.teatro;

import src.eventos.Evento;
import java.util.ArrayList;
import java.util.Scanner;


public class Teatro
{
    //atributos e arraylist
    private ArrayList<Evento> eventos;  //criando lista de Teatro a Evento

    //método construtor
    public Teatro() {
        eventos = new ArrayList<>();   //inicia lista
        eventos.add( new Evento ("Slipknot", "01-07-2024",      //evento ja disponivel
                "21h", "Show de Metal", 200.0));
    }

    //método para adicionar evento
    public void addEvento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do evento:");
        String nome = scanner.nextLine();
        System.out.println("Informe a data do evento (DD-MM-AAAA:");
        String data = scanner.nextLine();
        System.out.println("Informe o horário do evento:");
        String horario = scanner.nextLine();
        System.out.println("Informe a descrição do evento:");
        String descricao = scanner.nextLine();
        System.out.println("Informe o preço do ingresso:");
        double precoIngresso = scanner.nextDouble();

        Evento novoEvento = new Evento(nome, data, horario, descricao, precoIngresso);
        eventos.add(novoEvento);
    }

    //método para exibir os eventos cadastrados
    public void exibeEventos() {
        for(Evento evento : eventos){            //lembrar: aqui percorre a lista de eventos
            System.out.println(evento);
        }
    }

    //método para remover evento
    public void deletaEvento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do evento que deseja remover:");
        String nomeEvento = scanner.nextLine();
        eventos.removeIf(evento -> evento.getNome().equals(nomeEvento));

    }
}

