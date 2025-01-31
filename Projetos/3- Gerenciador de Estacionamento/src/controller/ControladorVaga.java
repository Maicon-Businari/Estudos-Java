package controller;

import java.util.Scanner;

import dao.BancoMemoriaCarro;
import dao.BancoMemoriaVagas;
import model.Vaga;
import util.InputUtil;
import view.Menu;

public class ControladorVaga {

    public static void controlador(BancoMemoriaVagas bancoVagas, BancoMemoriaCarro bancoCarro, Scanner scanner) {
        int numeroVaga;
        String placa;
        Vaga vagaEncontrada;
        String input;
        int opcaoInterna = -1;

        do {
            Menu.apresentarMenuVaga();
            input = scanner.nextLine();

            if (InputUtil.validarAlgarismo(input)) {
                opcaoInterna = Integer.parseInt(input);

                switch (opcaoInterna) {
                    case 1:// Listar
                        bancoVagas.listar();
                        InputUtil.pressionarParaContinuar();
                        break;

                    case 2:// Buscar
                        System.out.println("Informe o numero da vaga.");
                        input = scanner.nextLine();

                        // Validando a string e convertendo para int
                        numeroVaga = InputUtil.validarConveterInt(input);
                        if (numeroVaga != -1) {
                            bancoVagas.buscar(numeroVaga, true);
                        }
                        InputUtil.pressionarParaContinuar();

                        break;
                    case 3:// Colocar Carro na vaga

                        System.out.println("Informe o numero da vaga.");
                        input = scanner.nextLine();

                        // Validando input algarismo
                        numeroVaga = InputUtil.validarConveterInt(input);
                        if (numeroVaga != -1) {
                            System.out.println("Informe a placa.");
                            placa = scanner.nextLine();

                            // Validando input Placa
                            if (!InputUtil.validarPlaca(placa)) {
                                System.out.println("Placa inválida.");
                                InputUtil.pausarExecucao();
                            } else {
                                vagaEncontrada = bancoVagas.buscar(numeroVaga, false);
                                if (vagaEncontrada != null) {
                                    try {
                                        vagaEncontrada.colocarCarro(placa, bancoCarro);
                                        System.out.println("Carro foi colocado na vaga.");

                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                        InputUtil.pausarExecucao();
                                    }
                                    InputUtil.pausarExecucao();
                                }
                            }
                        }
                        InputUtil.pausarExecucao();
                        break;
                    case 4:// Retirar Carro
                        System.out.println("Favor informe o numero da vaga ");
                        input = scanner.nextLine();

                        numeroVaga = InputUtil.validarConveterInt(input);
                        if (numeroVaga != -1) {
                            vagaEncontrada = bancoVagas.buscar(numeroVaga, false);

                            if (vagaEncontrada != null) {
                                try {
                                    vagaEncontrada.retirarCarro();
                                    System.out.println("O carro foi retirado da vaga");
                                    InputUtil.pressionarParaContinuar();

                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                    InputUtil.pausarExecucao();
                                }
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal.");
                        InputUtil.pausarExecucao();
                        break;

                    default:
                        System.out.println("Favor informar uma opção válida.");
                        InputUtil.pausarExecucao();
                        break;
                }
            } else {
                System.out.println("Favor digitar somente números.");
                InputUtil.pausarExecucao();
            }
        } while (opcaoInterna != 0);

    }

   
}
