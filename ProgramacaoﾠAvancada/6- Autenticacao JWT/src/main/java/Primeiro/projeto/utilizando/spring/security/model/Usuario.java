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

@Getter
@Setter
@AllArgsConstructor
public class Usuario implements UserDetails {

    private String login;
    private String senha;
    private String role;

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