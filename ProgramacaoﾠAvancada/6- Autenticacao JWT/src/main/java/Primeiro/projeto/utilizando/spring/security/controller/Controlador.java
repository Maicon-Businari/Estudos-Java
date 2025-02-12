package Primeiro.projeto.utilizando.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import Primeiro.projeto.utilizando.spring.security.model.TokenUsuario;
import Primeiro.projeto.utilizando.spring.security.model.Usuario;
import Primeiro.projeto.utilizando.spring.security.repository.UsuarioRepository;
import Primeiro.projeto.utilizando.spring.security.service.AutenticacaoToken;

@RestController
@RequestMapping("")
public class Controlador {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AutenticacaoToken autenticacaoToken;

    @PostMapping("login")
    public ResponseEntity paginaLogin(@RequestBody AutenticacaoUsuario autenticacao) {

        var usuarioToken = new UsernamePasswordAuthenticationToken(autenticacao.login(), autenticacao.senha());
        // Aguandando um usuario que foi atenticado
        Authentication auth = this.authenticationManager.authenticate(usuarioToken);

        // Geranto um token para o usuario anteriormente autenticado
        var token = autenticacaoToken.gerarToken((Usuario) auth.getPrincipal());

        return ResponseEntity.ok(new TokenUsuario(token));

    }

    @PostMapping("/cadastrar")
    public ResponseEntity paginaRegistro(@RequestBody CadastroUsuario cadastro) {

        Usuario usuario = usuarioRepository.adicionar(cadastro);
        return ResponseEntity.ok(new TokenUsuario("Usuario cadastrado: " + usuario.getLogin()));
    }

    @GetMapping("/inicial")
    public ResponseEntity paginaInicial() {
        return ResponseEntity.ok(new TokenUsuario( "Pagina Inicial -> Usuario"));
    }

    @GetMapping("/admin")
    public ResponseEntity paginaConfig() {
        return ResponseEntity.ok(new TokenUsuario("Pagina de configuração -> Admin"));
    }
}
