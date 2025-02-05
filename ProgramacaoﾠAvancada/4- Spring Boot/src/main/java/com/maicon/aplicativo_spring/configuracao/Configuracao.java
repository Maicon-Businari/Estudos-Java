package com.maicon.aplicativo_spring.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maicon.aplicativo_spring.service.ServicosExternos;

//Serve para informar ao spring que existe classes externas(Vindo de blibliotecas) devem ser mapeadas para poder ser gerenciadas
@Configuration
public class Configuracao {

    //Informando que existe uma classe externa chamada SDKAWS e que ela deve ser mapeada
    @Bean
    public ServicosExternos servicosExternos(){
        return new ServicosExternos();
    }

}
