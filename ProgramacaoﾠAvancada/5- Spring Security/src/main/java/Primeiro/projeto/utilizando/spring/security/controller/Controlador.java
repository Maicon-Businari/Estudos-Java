package Primeiro.projeto.utilizando.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Primeiro.projeto.utilizando.spring.security.model.AutenticacaoUsuario;
import Primeiro.projeto.utilizando.spring.security.model.CadastroUsuario;

@RestController
@RequestMapping("")
public class Controlador {

    @Autowired
    // Instanciado a configuração AuthenticationManager que foi definido nas
    // configurações do spring
    private AuthenticationManager authenticationManager;

    // Cada rota de requisição é tambem conhecida como end-point
    @PostMapping("login")
    // Está rota está aguardando algo no corpo(body) da requisição
    public String paginaLogin(@RequestBody AutenticacaoUsuario autenticacao) {

        // Preparando um objeto para ser validado
        var usuarioToken = new UsernamePasswordAuthenticationToken(autenticacao.login(), autenticacao.senha());
        // Realizando validação e aguardando que seja retornado uma autenticação
        Authentication auth = this.authenticationManager.authenticate(usuarioToken);

        return "Pagina Login: " + auth.getName();

    }

    @PostMapping("cadastrar")
    public String paginaRegistro(@RequestBody CadastroUsuario cadastro){

        return "";
    }

    @GetMapping("/inicial")
    public String paginaInicial() {
        return "Pagina Inicial -> Usuario";
    }

    @GetMapping("/admin")
    public String paginaConfig() {
        return "Pagina de configuração -> Admin";
    }
}
