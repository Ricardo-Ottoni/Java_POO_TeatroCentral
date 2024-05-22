package src.eventos;

import java.util.ArrayList;
import java.util.Scanner;

public class Evento {
    //atributos
    private String nome;
    private String data;
    private String horario;
    private String descricao;
    private double precoIngresso;
    private ArrayList<Evento> eventos;  //criando lista de Evento ao Main

    //método construtor
    public Evento(){
        eventos = new ArrayList<>();   //inicia lista
        eventos.add( new Evento ("Slipknot", "29-06-2024",      //evento ja disponivel no mes
                "21", "Show de Metal banda Slipknot", 300.0));
    }
    public Evento(String nome, String data, String horario, String descricao, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
        this.precoIngresso = precoIngresso;
    }

    //método para adicionar evento
    public void addEvento(Evento evento) {
        eventos.add(evento);

    }

    //método para exibir os eventos cadastrados
    public void exibeEventos() {
        for(Evento evento : eventos){            //lembrar que aqui percorre a lista de eventos
            System.out.println();
            System.out.println(evento);
        }
    }

    //método para remover evento
    public void deletaEvento() {
        Scanner scanner = new Scanner(System.in);
        boolean eventoRemovido = false;

        while (!eventoRemovido) {
            System.out.println("Informe o nome do evento que deseja remover:");
            String nomeEvento = scanner.nextLine();

            for (Evento evento : eventos) {
                if (evento.getNome().equals(nomeEvento)) {
                    eventos.remove(evento);
                    eventoRemovido = true;
                    System.out.println("Evento removido!");
                    break;
                }
            }
            if (!eventoRemovido) {
                System.out.println("Evento nao encontrado.");
                System.out.println();
            }
        }
    }

    //método para exibir informaçoes do evento
    @Override
    public String toString() {
        return " Nome: " + nome + "\n Data: " + data + "\n Horário: " + horario + "h" +
                "\n Descrição: " + descricao + "\n Preço do Ingresso: R$ " + precoIngresso;
    }

    //método de acesso get/set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    public void addEventos(Evento eventos) {
        this.eventos.add(eventos);
    }
}
