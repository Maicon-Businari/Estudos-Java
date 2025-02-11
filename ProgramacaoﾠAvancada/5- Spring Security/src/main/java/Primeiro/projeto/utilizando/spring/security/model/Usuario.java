package Primeiro.projeto.utilizando.spring.security.model;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// As 3 anotações abaixo são do lombok, utilizado para não precisar declarar no codigo os getter, setter e construtores
@Getter
@Setter
@AllArgsConstructor
// A classe a ser implementada é uma classe do Spring Security -> Informa que
// essa classe será um usuario que precisara ser autenticado
public class Usuario implements UserDetails {

    private String login;
    private String senha;
    private String role;

    //Definindo nivel de acesso ( ROLE )
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (Objects.equals("admin", role)) {
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USUARIO"));
        } else {
            return List.of(new SimpleGrantedAuthority("ROLE_USUARIO"));
        }
    }

    @Override
    public String getPassword() {
        return this.getSenha();
    }

    @Override
    public String getUsername() {
        return this.getLogin();
    }

}