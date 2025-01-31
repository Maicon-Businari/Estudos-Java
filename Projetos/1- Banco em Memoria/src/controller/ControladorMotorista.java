package controller;

import java.util.Scanner;

import dao.BancoMemoriaMotorista;
import model.Motorista;
import util.InputUtil;
import view.Menu;

public class ControladorMotorista {

    public static void controlador(BancoMemoriaMotorista bancoMotorista, Scanner scanner) {
        String cpf;
        String inputScanner;
        int opcaoInterna = -1;

        do {
            Menu.apresentarMenuMotorista();
            inputScanner = scanner.nextLine();

            if (InputUtil.validarAlgarismo(inputScanner)) {
                opcaoInterna = Integer.parseInt(inputScanner);

                switch (opcaoInterna) {
                    case 1:// Cadastrar
                        System.out.println("Favor informe o CPF: ");
                        cpf = scanner.nextLine();
                        System.out.println("Favor informe seu Nome: ");
                        String nome = scanner.nextLine();

                        try {
                            Motorista motorista = new Motorista(cpf, nome);
                            bancoMotorista.adicionar(motorista);
                            System.out.println("Motorista Cadastrado");
                            InputUtil.pressionarParaContinuar();

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            InputUtil.pressionarParaContinuar();
                        }
                        break;

                    case 2:// Listar
                        bancoMotorista.lista();
                        InputUtil.pressionarParaContinuar();
                        break;
                    case 3:// Buscar
                        System.out.println("Favor informe o CPF: ");
                        cpf = scanner.nextLine();
                        bancoMotorista.buscar(cpf, true);
                        InputUtil.pressionarParaContinuar();

                        break;
                    case 4:// Excluir
                        System.out.println("Favor informe o CPF: ");
                        cpf = scanner.nextLine();
                        bancoMotorista.excluir(cpf);
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
