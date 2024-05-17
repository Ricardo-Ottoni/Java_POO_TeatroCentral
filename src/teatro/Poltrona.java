package src.teatro;

import java.util.ArrayList;
import java.util.Scanner;

public class Poltrona {

    private int numeroPoltrona;
    private ArrayList<Poltrona> poltronas;

    public Poltrona() {
        this.poltronas = new ArrayList<>();
    }

    public Poltrona(int numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }

    public Poltrona(ArrayList<Poltrona> poltronas) {
        this.poltronas = poltronas;
    }

    public void escolhePoltrona() {
        Scanner scanner = new Scanner(System.in); // Instanciando o Scanner
        numeroPoltrona = 1;
        while (numeroPoltrona != 1571) {
            System.out.println("--------- Menu Poltrona---------");
            System.out.println("  Digite o numero da poltrona: \n");
            System.out.println("  De    1 a  572 = Plateia A ");
            System.out.println("  De  573 a 1233 = Plateia B ");
            System.out.println("  De 1234 a 1354 = Camarote ");
            System.out.println("  De 1355 a 1624 = Balcao Nobre");
            System.out.println("  De 1625 a 1755 = Galeria ");
            System.out.println("--------------------------------");

            numeroPoltrona = scanner.nextInt();
            if (numeroPoltrona >= 1 && numeroPoltrona <= 572) {
                System.out.println("Ok poltrona disponivel");
            } else if (numeroPoltrona >= 573 && numeroPoltrona <= 1233) {
                System.out.println("Ok poltrona disponivel");
            } else if (numeroPoltrona >= 1234 && numeroPoltrona <= 1354) {
                System.out.println("Ok poltrona disponivel");
            } else if (numeroPoltrona >= 1355 && numeroPoltrona <= 1624) {
                System.out.println("Ok poltrona disponivel");
            } else if (numeroPoltrona >= 1625 && numeroPoltrona <= 1755) {
                System.out.println("Ok poltrona disponivel");
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        Poltrona novaPoltrona = new Poltrona(numeroPoltrona);
        poltronas.add(novaPoltrona);
    }

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
}