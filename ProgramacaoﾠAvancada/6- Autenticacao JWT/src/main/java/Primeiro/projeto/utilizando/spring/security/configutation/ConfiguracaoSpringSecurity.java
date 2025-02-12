package Primeiro.projeto.utilizando.spring.security.configutation;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import Primeiro.projeto.utilizando.spring.security.service.FiltroSeguranca;

@Configuration
@EnableWebSecurity
public class ConfiguracaoSpringSecurity {

    @Autowired
    FiltroSeguranca filtroSeguranca;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> {
                    authorize.requestMatchers("/login").permitAll();
                    authorize.requestMatchers("/cadastrar").permitAll();
                    authorize.requestMatchers("/inicial").authenticated();
                    authorize.requestMatchers("/admin").hasRole("ADMIN");

                    authorize.anyRequest().authenticated();
                })
                // Informa que irá chamar o metodo doFilterInternal da classe que eu criei com nome FiltroSegurnça
                .addFilterBefore(filtroSeguranca, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration auth) throws Exception {
        // Informa que irá chamar o metodo loadUserByUsername da classe que eu criei com nome de Autenticação
        return auth.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
