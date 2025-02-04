package conexao;

//Tomar cuidado -> Sempre fazer imports do java.sql
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/bancolocal";
    private static final String usuario = "root";
    private static final String senha = "root";

    private static Connection conexao = null;

    public static Connection buscarConexao() {

        // Para caso de algum problema de conexão com o banco de dados
        try {
            //Verificando se a conexao já existe, se não tiver será feita
            if (conexao == null) {
                //Criando uma conexao com o banco de dados
                conexao = DriverManager.getConnection(url, usuario, senha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao realizar a conexão ao banco de dados.");
            e.printStackTrace();
        }
        return conexao;
    }

}
