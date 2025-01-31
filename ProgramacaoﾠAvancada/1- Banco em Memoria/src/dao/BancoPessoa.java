package dao;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class BancoPessoa {

    //Criado uma lista de passoas que serão utilizados como banco de dados em memória
    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    //----- CRUD -----

    //Adicina uma nova pessoa a lista
    public void adicionar(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    //Lista todas as pessoas da lista
    public void listar(){
        //Coleção de dados -> Conjunto de dados guardados de forma organizada.
        //stream -> Utilizados para poder realizar operações sobre cada dentro de uma coleção de dados
        pessoas.stream().forEach(pessoa -> {
            System.out.println(pessoa);
        });
    }

    //Busca uma pessoa especifica utilizando cpf
    public void buscar(String cpf){
        //Percorrendo toda a lista de pessoas e utilizando o metedo "getCpf" e comparando com "cpf" recebido por parâmetro
        Pessoa pessoaEncontrada = pessoas.stream().filter(pessoa -> pessoa.getCpf().equals(cpf)).findFirst().orElse(null);
        if(pessoaEncontrada !=  null){
            System.out.println(pessoaEncontrada);
        }
    }

    //Excluir uma pessoa da lista com base no cpf
    public void excluir(String cpf){
        pessoas.removeIf(pessoas -> pessoas.getCpf().equals(cpf));
    }
}
