package util;

import dao.BancoMemoriaCarro;
import dao.BancoMemoriaMotorista;
import dao.BancoMemoriaVagas;
import model.Carro;
import model.Motorista;
import model.Vaga;

public abstract class InicializadorDeDados {

    public static void iniciarlizarDados(BancoMemoriaMotorista bancoMotorista, BancoMemoriaCarro bancoCarro,
            BancoMemoriaVagas bancoVagas) {

        // Injeção de dados Motoristas
        try {
            Motorista motorista = new Motorista("12345678912", "Pedro");
            Motorista motorista2 = new Motorista("12345678913", "Joao");
            Motorista motorista3 = new Motorista("12345678919", "Carlos");

            bancoMotorista.adicionar(motorista);
            bancoMotorista.adicionar(motorista2);
            bancoMotorista.adicionar(motorista3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Injeção de dados Carros
        try {
            Carro carro = new Carro("Corsa", "Vermelho", "abc1234", "12345678912", bancoMotorista);
            Carro carro2 = new Carro("Gol", "Preto", "abc1235", "12345678913", bancoMotorista);
            Carro carro3 = new Carro("Prisma", "Laranja", "abc1a23", "12345678919", bancoMotorista);

            bancoCarro.adicionar(carro);
            bancoCarro.adicionar(carro2);
            bancoCarro.adicionar(carro3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Injeção de dados Vagas
        try {
            Vaga vagaEncontrada;

            vagaEncontrada = bancoVagas.buscar(1, false);
            vagaEncontrada.colocarCarro("abc1234", bancoCarro);

            vagaEncontrada = bancoVagas.buscar(5, false);
            vagaEncontrada.colocarCarro("abc1235", bancoCarro);

            vagaEncontrada = bancoVagas.buscar(2, false);
            vagaEncontrada.colocarCarro("abc1a23", bancoCarro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
