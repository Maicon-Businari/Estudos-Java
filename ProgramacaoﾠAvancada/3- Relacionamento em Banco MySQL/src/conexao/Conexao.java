package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/bancolocal";
    private static final String usuario = "root";
    private static final String senha = "root";

    private static Connection conexao = null;

    public static Connection buscarConexao(){
            try {
                if(conexao == null){
                    conexao = DriverManager.getConnection(url, usuario, senha);
                }
                
            } catch (Exception e) {
                System.out.println("Erro ao conectar com o banco");
                e.printStackTrace();
            }
            return conexao;
    }

}
