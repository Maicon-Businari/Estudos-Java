package dao;

import model.Carro;
import util.InputUtil;

public class BancoMemoriaCarro extends BancoMemoria<Carro> {

    public void adicionar(Carro obj) {
        if (super.adicionar(obj, carro -> carro.getPlaca().equals(obj.getPlaca())) == false) {
            System.out.println("Placa ja conta no nosso sistema, dados do carro foram atualizados");
        }
    }

    public void lista() {
        super.lista();
    }

    public Carro buscar(String placa, boolean imprimir) {
        if (!InputUtil.validarPlaca(placa)) {
            System.out.println("Placa inválida.");
            return null;
        }
        Carro carroEncontrado = super.buscar(carro -> carro.getPlaca().equals(placa));
        if (carroEncontrado == null) {
            System.out.println("Carro não encontrado.");
            return null;
        }
        if (imprimir) {
            System.out.println(carroEncontrado);
        }
        return carroEncontrado;
    }

    public void excluir(String placa) {
        if (buscar(placa, false) != null) {
            System.out.println("Carro excluido.");
            super.excluir(carro -> carro.getPlaca().equals(placa));
        }
    }

}
