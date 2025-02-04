package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {

    public void cadastrar(Usuario usuario) {

        try {
            // Gerando linha de codigo que será inserida no banco de dados(para fazer algo)
            String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

            // Buscando/realizando conexão com banco de dados
            Connection conexao = Conexao.buscarConexao();

            // Criando uma linha de comando para o banco de dados
            PreparedStatement ps = conexao.prepareStatement(sql);

            // Informando o que cada "?" vai receber.
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            // Executando no banco de dados a linha de comando criada
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuario." + e.getStackTrace());
            e.printStackTrace();
        }

    }

    public void listar() {

        try {
            // Gerando linha de codigo que será inserida no banco de dados(para fazer algo)
            String sql = "SELECT * FROM USUARIO";

            // Buscando/realizando conexão com banco de dados
            Connection conexao = Conexao.buscarConexao();

            // Criando uma linha de comando para o banco de dados
            PreparedStatement ps = conexao.prepareStatement(sql);

            // Executando comando no banco de dados e aguardando uma resposta
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // Transformando a resposta em objetos do tipo usuario
                Usuario usuarioEncontado = new Usuario(
                        rs.getInt("IDUSUARIO"),
                        rs.getString("NOME"),
                        rs.getString("LOGIN"),
                        rs.getString("SENHA"),
                        rs.getString("EMAIL"));

                System.out.println(usuarioEncontado);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar usuario." + e.getStackTrace());
            e.printStackTrace();
        }

    }

    public void buscar(int id) {

        try {
            // Gerando linha de codigo que será inserida no banco de dados(para fazer algo)
            String sql = "SELECT * FROM USUARIO WHERE IDUSUARIO = ?";

            // Buscando/realizando conexão com banco de dados
            Connection conexao = Conexao.buscarConexao();

            // Criando uma linha de comando para o banco de dados
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);

            // Executando comando no banco de dados e aguardando uma resposta
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Transformando a resposta em um objeto do tipo usuario
                Usuario usuarioEncontado = new Usuario(
                        rs.getInt("IDUSUARIO"),
                        rs.getString("NOME"),
                        rs.getString("LOGIN"),
                        rs.getString("SENHA"),
                        rs.getString("EMAIL"));

                System.out.println(usuarioEncontado);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar usuario." + e.getStackTrace());
            e.printStackTrace();
        }

    }

    public void atulizar(Usuario usuario) {

        try {
            // Gerando linha de codigo que será inserida no banco de dados(para fazer algo)
            String sql = "UPDATE USUARIO SET NOME = ?, LOGIN = ?, SENHA = ?, EMAIL = ? WHERE IDUSUARIO = ?";
           
            // Buscando/realizando conexão com banco de dados
            Connection conexao = Conexao.buscarConexao();

            // Criando uma linha de comando para o banco de dados
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            ps.setInt(5, usuario.getIdUsuario());

            ps.executeUpdate();
            
        } catch (Exception e) {
             System.out.println("Erro ao atualizar usuario." + e.getStackTrace());
            e.printStackTrace();
        }

    }

    public void deletar(int id) {

        try {
            // Gerando linha de codigo que será inserida no banco de dados(para fazer algo)
            String sql = "DELETE FROM USUARIO WHERE IDUSUARIO = ?";

            // Buscando/realizando conexão com banco de dados
            Connection conexao = Conexao.buscarConexao();

            // Criando uma linha de comando para o banco de dados
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);

            // Executando comando no banco de dados e aguardando uma resposta
            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao deletar usuario." + e.getStackTrace());
            e.printStackTrace();
        }

    }
}
