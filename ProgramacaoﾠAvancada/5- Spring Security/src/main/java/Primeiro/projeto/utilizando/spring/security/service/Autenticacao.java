package Primeiro.projeto.utilizando.spring.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Primeiro.projeto.utilizando.spring.security.repository.UsuarioRepository;

@Service
public class Autenticacao implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Mostrando para o spring como ele deve fazer para consultar o banco dados para verificar o usuario
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.buscar(username);
    }

}
