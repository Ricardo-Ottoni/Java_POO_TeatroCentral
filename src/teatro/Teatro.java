package src.teatro;

//importar classes evento e setores

import src.eventos.Evento;
import java.util.ArrayList;

public class Teatro {
    //atributos
    private String nome = "Cine-Theatro Central";
    private String endereco = "Praça João Pessoa, s/n. Calçadão da Rua Halfeld\n" +
            "CEP 36010-150. Centro. Juiz de Fora, MG, Brasil";
    private String tel = "(32) 2102-6329";
    private int capacidadeTotal = 1751;

    private ArrayList<Evento> eventos;

    public Teatro() {
        eventos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void addEventos(Evento evento) {
        this.eventos.add(evento);
    }
}


