package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import model.Dono;

public class DonoDAO {

    public void adicionar(Dono dono) {

        try {

            Connection conexao = Conexao.buscarConexao();
            System.out.println("testando");
            if (conexao != null) {

                String sql = "INSERT INTO DONO ( NOME, CPF) VALUES (?,?)";
                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, dono.getNome());
                ps.setString(2, dono.getCpf());

                ps.execute();
            }
        } catch (Exception e) {
            System.out.println("Erro ao adicionar Dono.");
            e.printStackTrace();
        }

    }

    public void listar() {

        try {
            Connection conexao = Conexao.buscarConexao();

            if (conexao != null) {
                String sql = "SELECT * FROM DONO";
                PreparedStatement ps = conexao.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    Dono dono = new Dono(
                            rs.getInt("ID"),
                            rs.getString("NOME"),
                            rs.getString("CPF"));

                    System.out.println(dono);
                }

            }

        } catch (Exception e) {
            System.out.println("Erro ao listar Donos.");
            e.printStackTrace();
        }

    }

    public void buscar(int id) {
        try {
            Connection conexao = Conexao.buscarConexao();

            if (conexao != null) {
                String sql = "SELECT * FROM DONO WHERE ID = ?";

                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setInt(1, id);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    Dono dono = new Dono(
                            rs.getInt("ID"),
                            rs.getString("NOME"),
                            rs.getString("CPF"));

                    System.out.println(dono);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar Dono");
            e.printStackTrace();
        }

    }

    public void atualizar(Dono dono) {

        Connection conexao = Conexao.buscarConexao();

        if (conexao != null) {
            try {
                String sql = "UPDATE DONO SET NOME = ?, CPF = ? WHERE ID = ?";
                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, dono.getNome());
                ps.setString(2, dono.getCpf());
                ps.setInt(3, dono.getId());


                ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Erro ao atualizar Dono");
                e.printStackTrace();
            }

        }

    }

    public void deletar(int id) {

        try {
            Connection conexao = Conexao.buscarConexao();

            if(conexao != null){
                String sql = "DELETE FROM DONO WHERE ID = ?";
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                ps.execute();
            }

        } catch (Exception e) {
            System.out.println("Erro ao excluir");
            e.printStackTrace();
        }

    }

}
