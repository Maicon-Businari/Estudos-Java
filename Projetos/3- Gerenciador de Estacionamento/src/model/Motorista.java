package model;

import util.InputUtil;

public class Motorista {

    // Atributos
    private String cpf;
    private String nome;

    // Construtor
    public Motorista(String cpf, String nome) throws Exception {
        this.setCpf(cpf);
        this.setNome(nome);
    }

    // Getters e Setter
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (InputUtil.validadorCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new Exception("CPF invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (InputUtil.validarPalavra(nome)) {
            this.nome = nome;
        } else {
            throw new Exception("Nome invalido");
        }

    }

    // Métodos
    @Override
    public String toString() {
        return "Nome: " + getNome() + " Cpf: " + getCpf();
    }
}
