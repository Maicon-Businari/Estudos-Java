package Primeiro.projeto.utilizando.spring.security.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import Primeiro.projeto.utilizando.spring.security.model.CadastroUsuario;
import Primeiro.projeto.utilizando.spring.security.model.Usuario;
import jakarta.annotation.PostConstruct;

@Repository
public class UsuarioRepository {

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Agora criando uma lista de usuario ( Banco de memória )
    private List<Usuario> bancoUsuario = new ArrayList<>();

    // Método de inicialização após o spring o "capaturar" com o bean
    @PostConstruct
    public void iniciar() {
        String senha = passwordEncoder.encode("1234");
        String senhaUsuario = passwordEncoder.encode("5678");

        Usuario admin = new Usuario("admin", senha, "admin");
        Usuario usuario = new Usuario("usuario", senhaUsuario, "usuario");

        bancoUsuario.add(admin);
        bancoUsuario.add(usuario);
    }

    // Adicionar ao banco de dados
    public Usuario adicionar(CadastroUsuario cadastroUsuario) {
        String senhaCodificada = passwordEncoder.encode(cadastroUsuario.senha());
        Usuario usuario = new Usuario(cadastroUsuario.login(), senhaCodificada , cadastroUsuario.role());

        bancoUsuario.add(usuario);
        return usuario;
    }

    // Buscar um usuario pelo login
    public UserDetails buscar(String username) {
        return bancoUsuario.stream().filter(usuario -> usuario.getLogin().equals(username)).findFirst().orElse(null);
    }

}
