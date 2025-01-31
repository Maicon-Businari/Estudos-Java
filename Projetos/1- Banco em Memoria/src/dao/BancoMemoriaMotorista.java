package dao;

import model.Motorista;
import util.InputUtil;

public class BancoMemoriaMotorista extends BancoMemoria<Motorista> {

    public void adicionar(Motorista obj) {
        if (!super.adicionar(obj, motorista -> motorista.getCpf().equals(obj.getCpf()))) {
            System.out.println("Já existe um motorista cadastrado com esse CPF.");
        }
    }

    public void lista() {
        super.lista();
    }

    public Motorista buscar(String cpf, boolean imprimir) {
        if (!InputUtil.validadorCpf(cpf)) {
            System.out.println("Cpf inválido");
            return null;
        }
        Motorista motoristaEncontrado = super.buscar(motorista -> motorista.getCpf().equals(cpf));

        if (motoristaEncontrado == null) {
            System.out.println("Motorista não encontrado.");
            return null;
        }
        if (imprimir) {
            System.out.println(motoristaEncontrado);
        }
        return motoristaEncontrado;

    }

    public void excluir(String cpf) {
        if (buscar(cpf, false) != null) {
            System.out.println("Motorista excluido.");
            super.excluir(motorista -> motorista.getCpf().equals(cpf));
        }
    }

}
