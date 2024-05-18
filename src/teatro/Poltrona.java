package src.teatro;

import java.util.ArrayList;

public class Poltrona {
    // Atributos
    private int numeroPoltrona;
    private ArrayList<Poltrona> poltronas;

    // Construtor
    public Poltrona() {
        this.poltronas = new ArrayList<>();
    }

    public Poltrona(int numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }

    public Poltrona(ArrayList<Poltrona> poltronas) {
        this.poltronas = poltronas;
    }

    // Métodos de acesso
    public int getNumeroPoltrona() {
        return numeroPoltrona;
    }

    public void setNumeroPoltrona(int numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }

    public ArrayList<Poltrona> getPoltronas() {
        return poltronas;
    }

    public void addPoltrona(Poltrona poltrona) {
        this.poltronas.add(poltrona);
    }

    // Método para obter o número da poltrona
    public int getNumero() {
        return numeroPoltrona;
    }
}