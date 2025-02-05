package model;

public class Dono {

    //Atributos
    private int id;
    private String nome;
    private String cpf;


    //Construtor
    public Dono(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Construtor com ID
    public Dono(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Id: " + getId() +" Nome: " + getNome() + " Cpf: " + getCpf();
    }

}
