import controller.ControladorMenu;
import dao.BancoMemoriaCarro;
import dao.BancoMemoriaMotorista;
import dao.BancoMemoriaVagas;
import util.InicializadorDeDados;

public class App {
    public static void main(String[] args) throws Exception {

        // Criando banco de dados em momoria
        BancoMemoriaMotorista bancoMotorista = new BancoMemoriaMotorista();
        BancoMemoriaCarro bancoCarro = new BancoMemoriaCarro();
        BancoMemoriaVagas bancoVagas = new BancoMemoriaVagas();

        //Inserindo Dados nos bancos
        InicializadorDeDados.iniciarlizarDados(bancoMotorista, bancoCarro, bancoVagas);

        
        //Iniciando Fluxo do Programa
        ControladorMenu.contraladorMenu(bancoMotorista, bancoCarro, bancoVagas);
    }
}
