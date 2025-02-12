package Primeiro.projeto.utilizando.spring.security.service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

import Primeiro.projeto.utilizando.spring.security.model.Usuario;

@Service
public class AutenticacaoToken {

    // Value -> Pega um valor do arquivo application.properties e injeta na variavel
    @Value("${api.security.token.secret}")
    private String secret;

    // Método para validar token
    public String gerarToken(Usuario usuario) {
        try {
            // Cria um hash de usuario e adiconal algo a mais utilizando a variavel secret (
            // hash + secret )
            Algorithm algorithm = Algorithm.HMAC256(secret);
            // Cirando um tokem com JWT
            String token = JWT.create()
                    // Informa qual foi a api que criou esse token
                    .withIssuer("api-spring-security")
                    // Para saber quem é o usuario dono desse token quando for descriptografado
                    .withSubject(usuario.getLogin())
                    // Tempo para experirar o tekon
                    .withExpiresAt(geradorTempoExpiracao())
                    // Para colocar a assinatura no final para saber que é dessa api
                    .sign(algorithm);

            return token;
        } catch (JWTCreationException e) {
            throw new RuntimeException("Erro na geração de token " + e);
        }
    }

    public String validacaoToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    // Quem gerou o token
                    .withIssuer("api-spring-security")
                    .build()
                    // Descriptografou
                    .verify(token)
                    // Pega o login de dentro do token e retorna
                    .getSubject();

        } catch (Exception e) {
            return "";
        }
    }

    // Gerar instancia de tempo para poder verificar se um token já expirou
    private Instant geradorTempoExpiracao() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }

}
