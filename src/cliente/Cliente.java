package src.cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    //atributos
    private String nome;
    private String cpf;
    private String tel;
    private static int contadorClientes = 0;
    private ArrayList<Cliente> clientes;

    //método construtor
    public Cliente() {
        this.clientes = new ArrayList<>();
    }
    public Cliente(String nome, String cpf, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.clientes = new ArrayList<>();
    }

    //método para criar cadastro de cliente
    public void cadastroCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe o cpf: ");
        String cpf = scanner.nextLine();
        System.out.println("Informe o telefone: ");
        String telefone = scanner.nextLine();

        Cliente novoCliente = new Cliente(nome, cpf, tel);
        clientes.add(novoCliente);
        contadorClientes++;
        System.out.println("Cadastro criado");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
