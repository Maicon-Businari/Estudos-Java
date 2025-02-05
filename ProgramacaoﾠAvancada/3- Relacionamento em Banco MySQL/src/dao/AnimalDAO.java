package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexao.Conexao;
import model.Animal;
import model.Dono;

public class AnimalDAO {

    public void adicionar(Animal animal) {

        try {
            Connection conexao = Conexao.buscarConexao();

            if (conexao != null) {
                String sql = "INSERT INTO ANIMAL (NOME, TIPO, CPF_DONO) VALUES (?, ?, ?)";
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, animal.getNome());
                ps.setString(2, animal.getTipo());
                ps.setString(3, animal.getDono().getCpf());

                ps.execute();
            }

        } catch (Exception e) {
            System.out.println("Erro ao CADASTRAR animal");
            e.printStackTrace();
        }
    }

    public void listar() {

        try {
            Connection conexao = Conexao.buscarConexao();
            // Linha que muda para buscar um dado de uma tebela que tem relacionamento com dado de outra tabela
            if (conexao != null) {
                String sql = "SELECT A.ID AS IDANIMAL, A.NOME AS NOMEANIMAL, A.TIPO TIPOANIMAL, D.ID, D.NOME, D.CPF " +
                        "FROM ANIMAL A " +
                        "JOIN DONO D ON A.CPF_DONO = D.CPF ";
                PreparedStatement ps = conexao.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    Dono dono = new Dono(
                            rs.getInt("ID"),
                            rs.getString("NOME"),
                            rs.getString("CPF"));

                    Animal animal = new Animal(
                            rs.getInt("IDANIMAL"),
                            rs.getString("NOMEANIMAL"),
                            rs.getString("TIPOANIMAL"),
                            dono);
                    System.out.println(animal);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao LISTAR animal");
            e.printStackTrace();
        }
    }

    public void buscas(int id) {

        try {

            Connection conexao = Conexao.buscarConexao();

            if (conexao != null) {
                // Linha que muda para buscar um dado de uma tebela que tem relacionamento com dado de outra tabela
                String sql = "SELECT A.ID AS IDANIMAL, A.NOME AS NOMEANIMAL, A.TIPO TIPOANIMAL, D.ID, D.NOME, D.CPF " +
                        "FROM ANIMAL A " +
                        "JOIN DONO D ON A.CPF_DONO = D.CPF " +
                        "WHERE A.ID = ?";

                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    Dono dono = new Dono(
                            rs.getInt("ID"),
                            rs.getString("NOME"),
                            rs.getString("CPF"));

                    Animal animal = new Animal(
                            rs.getInt("IDANIMAL"),
                            rs.getString("NOMEANIMAL"),
                            rs.getString("TIPOANIMAL"),
                            dono);
                    System.out.println(animal);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao BUSCAR animal");
            e.printStackTrace();
        }
    }

    public void atualizar(Animal animal) {

        try {
            Connection conexao = Conexao.buscarConexao();

            if (conexao != null) {
                String sql = "UPDATE ANIMAL SET NOME = ?, TIPO = ?, CPF_DONO = ? WHERE ID = ?";
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, animal.getNome());
                ps.setString(2, animal.getTipo());
                ps.setString(3, animal.getDono().getCpf());
                ps.setInt(4, animal.getId());

                ps.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("Erro ao ATUALIZAR animal");
            e.printStackTrace();
        }
    }

    public void deletar(int id) {

        try {

            Connection conexao = Conexao.buscarConexao();

            if (conexao != null) {
                String sql = "DELETE FROM ANIMAL WHERE ID = ?";
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);

                ps.execute();
            }

        } catch (Exception e) {
            System.out.println("Erro ao DELETAR animal");
            e.printStackTrace();
        }

    }
}
