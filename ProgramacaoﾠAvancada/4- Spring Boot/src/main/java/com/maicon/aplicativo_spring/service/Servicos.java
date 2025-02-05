package com.maicon.aplicativo_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Serviços -> É a classe reponsalvel por fazer toda a parte de processamento da requisição
@Service
public class Servicos {

    @Autowired
    private ServicosExternos servicosExternos;

    public String paginaIniciaGET(String teste) {

        return "Olá mundo" + teste;
    }

    public String servicoExterno() {

        return servicosExternos.consultar();
    }

}
