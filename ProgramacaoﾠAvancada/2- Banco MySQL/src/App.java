import dao.UsuarioDAO;
import entity.Usuario;

/*------------------------------------------------ LEMBRE MUITO INPORTANTE ------------------------------------------------*/
/*Não esquecer de baixar o drive  jdbc e colocar na pasta lib para que seja possivel realizar a conexão com o banco de dados MySql*/
public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando um novo usuario
        Usuario usuario1 = new Usuario("Maicon", "123", "456", "maicon@gmail.com");
        Usuario usuario2 = new Usuario("Pedro", "456", "789", "pedro@gmail.com");
        Usuario usuario3 = new Usuario("Carlos", "789", "1011", "carlos@gmail.com");

        Usuario usuario4 = new Usuario(2, "Luiz", "1213", "1415", "luiz@gmail.com");

        // Intancia a classe que faz acesso ao banco de dados de usuario
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Cadastrar usuario
        usuarioDAO.cadastrar(usuario1);
        usuarioDAO.cadastrar(usuario2);
        usuarioDAO.cadastrar(usuario3);

        // Listando todos usuario
        usuarioDAO.listar();

        // Buscar usuario
        usuarioDAO.buscar(2);
        System.out.println("");

        // Atualizando usuario
        usuarioDAO.atulizar(usuario4);
        System.out.println("");

        // Deletar usuario
        usuarioDAO.deletar(1);

        // Listando novamente para conferir as alterações
        usuarioDAO.listar();

    }
}
