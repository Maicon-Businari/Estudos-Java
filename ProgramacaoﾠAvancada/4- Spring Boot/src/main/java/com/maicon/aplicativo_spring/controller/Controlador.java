package com.maicon.aplicativo_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maicon.aplicativo_spring.service.Servicos;

import model.Usuario;

//Controlador -> É uma classe responsavel identificar as requisições e como lidar com elas

//Controller -> Anotação utilizada para dizer que a classe é um controlador e por padrão sua resposta será um arquivo html.
//ResponseBody -> Anotação utilizada para dizer que o controlador irá alterar o tipo de respota para um arquivo json.

//@RestController -> Anotação faz o mesmo que as duas anotações acima juntas.
@RestController
//Anotação -> Informa a url onde o controlador vai aguardar requisições.
@RequestMapping("")
public class Controlador {

    //Recebendo referência da instância de Servicos que está gerenciada pelo Spring
    private Servicos servicos;

    //O construtor é uma boa prática para injeção de dependência no Spring
    //Não é estritamente necessário para utilizar a dependência 'servicos'
    //O Spring pode injetar automaticamente via campo, usando @Autowired
    public Controlador(Servicos servicos){
        this.servicos = servicos;
    }


    //@GetMapping -> Informa que quando solicitado uma requisição, se for do tipo GET ele será responsavel por lidar com ela.
    @GetMapping
    public String paginaInicial(){
        
        return servicos.paginaIniciaGET("Teste");
    }

    @GetMapping("/servico-externo")
    public String servicosExternos(){

        return servicos.servicoExterno();
    }

    //@PostMapping -> Informa que quando solicitado uma requisição, se for do tipo POST ele será responsavel por lidar com ela.
    //@PathVariable("id") -> Informa que quando receber a requisição POST será recebido um dado via URL.
    //@RequestBody  -> Informa que quando receber a requisição POST tambem vira dados pelo body.
    @PostMapping("/{id}")
    public String paginaIncialPOST(@PathVariable("id") String id,@RequestBody Usuario usuario){

        return "Id: " + id  + " Nome: " + usuario.getNome();
    }

    @PostMapping("/filtro")
    public String paginaFiltroPOST(@RequestParam(value = "filtro", defaultValue = "Nenhum") String filtro){

        return "Filtro: " + filtro;
    }

}
