package controller;

import java.util.Scanner;

import dao.BancoMemoriaCarro;
import dao.BancoMemoriaMotorista;
import dao.BancoMemoriaVagas;
import util.InputUtil;
import view.Menu;

public abstract class ControladorMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static String inputScanner;
    private static int opcao = -1;

    public static void contraladorMenu(BancoMemoriaMotorista bancoMotorista, BancoMemoriaCarro bancoCarro,
            BancoMemoriaVagas bancoVagas) {
        do {
            Menu.apresentarMenuInicial();
            inputScanner = scanner.nextLine();

            // Validando se a "opcao" possui apenas numeros;
            if (InputUtil.validarAlgarismo(inputScanner)) {
                opcao = Integer.parseInt(inputScanner);

                switch (opcao) {
                    case 1:
                        ControladorMotorista.controlador(bancoMotorista, scanner);
                        break;
                    case 2:
                        ControladorCarro.controlador(bancoMotorista, bancoCarro, scanner);
                        break;
                    case 3:
                        ControladorVaga.controlador(bancoVagas, bancoCarro, scanner);
                        break;
                    case 0:
                        System.out.println("O sistema será encerrado");
                        break;
                    default:
                        System.out.println("Favor digite uma opção válida");
                        break;
                }
            } else {
                System.out.println("Favor digitar somente números.");
            }
            InputUtil.pausarExecucao();

        } while (opcao != 0);
    }

    

}
