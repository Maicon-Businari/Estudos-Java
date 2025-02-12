package Primeiro.projeto.utilizando.spring.security.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import Primeiro.projeto.utilizando.spring.security.repository.UsuarioRepository;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
// OncePerRequestFilter -> Filtro que ocorre uma vez por requisção
public class FiltroSeguranca extends OncePerRequestFilter {

    @Autowired
    AutenticacaoToken autenticacaoToken;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        var token = this.recuperandoToken(request);
        // Caso tenha tokem irá verificar se token é valido, quem é o dono do token e
        // verificar seus niveis de autorizações
        if (token != null) {
            var login = autenticacaoToken.validacaoToken(token);
            UserDetails usuario = usuarioRepository.buscar(login);

            if (usuario != null) {
                // Gerando uma autenticação utilizando as lista de autenticações que o usuario
                // possui
                var autenticacao = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
                // Informando para o spring security quais autenticações o usuario tem
                SecurityContextHolder.getContext().setAuthentication(autenticacao);
            }
        }
        // Se o token foi igual a nulo, pode seguir para o proximo filtro
        filterChain.doFilter(request, response);
    }

    // Pegando token que vem na requisição
    private String recuperandoToken(HttpServletRequest request) {
        // Buscando token pelo noma da variavel em que ele veio
        var authHeader = request.getHeader("Authorization");
        // Se não tiver token retorna nulo
        if (authHeader == null) {
            return null;
        }
        // Se tiver quero que retire o pré-fixo do token
        return authHeader.replace("Bearer ", "");
    }
}
