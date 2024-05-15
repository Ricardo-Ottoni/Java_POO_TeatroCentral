package src.cliente;

import src.ingressos.Ingresso;

import java.util.ArrayList;


public class Cliente {
    //atributos
    private String nome;
    private String cpf;
    private String tel;
    private ArrayList<Ingresso> ingressos;

    //método construtor
    public Cliente() {
        this.ingressos = new ArrayList<>();
    }
    public Cliente(String nome, String cpf, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.ingressos = new ArrayList<>();
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

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }
    public void addIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }
}
