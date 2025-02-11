package Primeiro.projeto.utilizando.spring.security.configutation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


//Informa para o spring security que nessa classe eu vou definir as regras de segurança
@Configuration
@EnableWebSecurity
public class ConfiguracaoSpringSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(csrf -> csrf.disable())
                // Definindo a politica de segurança: irá funcionar no modo STATELESS ( Servidor não irá armazenar nada do usuario s)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> {
                    // Definindo as regras de acesso a cada end-point
                    authorize.requestMatchers("/login").permitAll();
                    authorize.requestMatchers("/cadastrar").permitAll();
                    authorize.requestMatchers("/inicial").authenticated();
                    authorize.requestMatchers("/admin").hasRole("ADMIN");
                    
                    authorize.anyRequest().authenticated();
                });
        return httpSecurity.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration auth) throws Exception {
        return auth.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
