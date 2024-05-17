package src.funcionarios;

public class Funcionario {

    //atributos
    private String nome;
    private String cargo;
    private int matricula;

    //método construtor
    public Funcionario(){
    }
    public Funcionario(String nome, String cargo, int matricula){
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
    }

    //método de acesso get/set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //criar metodo para add e remover funcionarios
}
