package controller;

import java.util.Scanner;

import dao.BancoMemoriaCarro;
import dao.BancoMemoriaMotorista;
import model.Carro;
import util.InputUtil;
import view.Menu;

public class ControladorCarro {

    public static void controlador(BancoMemoriaMotorista bancoMotorista, BancoMemoriaCarro bancoCarro,
            Scanner scanner) {

        String modelo;
        String cor;
        String placa;
        String cpfMotorista;
        String inputScanner;
        int opcaoInterna = -1;

        do {
            Menu.apresentarMenuCarro();
            inputScanner = scanner.nextLine();

            if (InputUtil.validarAlgarismo(inputScanner)) {
                opcaoInterna = Integer.parseInt(inputScanner);

                switch (opcaoInterna) {
                    case 1:// Cadastrar
                        System.out.println("Favor informe o modelo: ");
                        modelo = scanner.nextLine();
                        System.out.println("Favor informe a cor: ");
                        cor = scanner.nextLine();
                        System.out.println("Favor informe a placa do veículo: ");
                        placa = scanner.nextLine();
                        System.out.println("Favor informe o cpf do dono: ");
                        cpfMotorista = scanner.nextLine();

                        try {
                            Carro carro = new Carro(modelo, cor, placa, cpfMotorista, bancoMotorista);
                            bancoCarro.adicionar(carro);
                            System.out.println("Carro Cadastrado");
                            InputUtil.pressionarParaContinuar();

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            InputUtil.pressionarParaContinuar();
                        }
                        break;

                    case 2:// Listar
                        bancoCarro.lista();
                        InputUtil.pressionarParaContinuar();
                        break;
                    case 3:// Buscar
                        System.out.println("Favor informe a placa do veículo: ");
                        placa = scanner.nextLine();
                        bancoCarro.buscar(placa, true);
                        InputUtil.pressionarParaContinuar();

                        break;
                    case 4:// Excluir
                        System.out.println("Favor informe a placa do veiculo: ");
                        placa = scanner.nextLine();
                        bancoCarro.excluir(placa);
                        InputUtil.pressionarParaContinuar();
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
