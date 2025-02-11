package Primeiro.projeto.utilizando.spring.security.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Primeiro.projeto.utilizando.spring.security.model.Usuario;

@Service
public class UsuarioDAO implements UserDetailsService {
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    //Parte onde o spring irá buscar usuario no banco de dados para realizar validação
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Utilizado dados em memoria -> Sem banco de dados no momento
        Usuario admin = new Usuario("admin", passwordEncoder.encode("1234"), "admin");
        Usuario usuario = new Usuario("usuario", passwordEncoder.encode("5678"), "usuario");


        //Simulando return de usuario vindo do banco de dados
        if ("admin".equals(username)) {
            return admin;
        } if("usuario".equals(username)){
            return usuario; 
        }else {
           return null;
        }
    }

}
