package view;

public class Menu {

    public static void limparConsole() {
        try {
            // Executa o comando
            Process process = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start();
            process.waitFor(); // Aguarda o término do processo

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void apresentarMenuInicial() {
        limparConsole();
        System.out.println("-----Menu----");
        System.out.println("1- Motorista");
        System.out.println("2- Carro");
        System.out.println("3- Vagas");
        System.out.println("0- Para encerrar o programa");
        System.out.println("Digite sua opção:");
    }

    public static void apresentarMenuMotorista() {
        limparConsole();
        System.out.println("-----Menu Motorista----");
        System.out.println("1- Cadastra Motorista");
        System.out.println("2- Listar Motoristas");
        System.out.println("3- Buscar Motorista");
        System.out.println("4- Excluir Motorista");
        System.out.println("0- Para voltar ao menu");
        System.out.println("Digite sua opção:");
    }

    public static void apresentarMenuCarro() {
        limparConsole();
        System.out.println("-----Menu Carro----");
        System.out.println("1- Cadastra Carro");
        System.out.println("2- Listar Carro");
        System.out.println("3- Buscar Carro");
        System.out.println("4- Excluir Carro");
        System.out.println("0- Para voltar ao menu");
        System.out.println("Digite sua opção:");
    }

    public static void apresentarMenuVaga() {
        limparConsole();
        System.out.println("-----Menu Vaga----");
        System.out.println("1- Listar Vaga");
        System.out.println("2- Buscar Vaga");
        System.out.println("3- Colocar carro na Vaga");
        System.out.println("4- Retirar carro da Vaga");
        System.out.println("0- Para voltar ao menu");
        System.out.println("Digite sua opção:");
    }

}
